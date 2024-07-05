// find a count of sub array where sum is < 5
const arr = [1, 2, 3, 4, 5];

//find subarrat that sums 6
//brute foec
const f1 = (arr, k) => {
  for (let i = 0; i < arr.length; i++) {
    let sum = 0;
    let subArr = [];
    for (let j = i; j < arr.length; j++) {
      sum = sum + arr[j];
      subArr.push(arr[j]);

      if (sum == k) {
        console.log(subArr);
      }
    }
    sum = 0;
    subArr = [];
  }
  console.log("subarray that sum to ", k);
};

f1(arr, 6);

//brute force
function bruteForce(arr, k) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    let sum = 0;
    for (let j = i; j < arr.length; j++) {
      sum = sum + arr[j];

      if (sum < k) {
        count++;
      }
    }

    sum = 0;
  }
  console.log(count);
}
// bruteForce(arr, 5);

// optimized
function optimized(arr, k) {
  let left = 0;
  let right = 0;
  let count = 0;

  let sum = 0;

  while (right < arr.length) {
    let ele = arr[right];
    sum = sum + ele;

    while (sum >= k) {
      sum = sum - arr[left];
      left++;
    }
    count = count + (right - left + 1);
    right++;
  }
  console.log(count);
}

optimized(arr, 5);

// count of  toatl subarray

function totalSubarray(arr) {
  let right = 0;
  let left = 0;
  let subArray = 0;

  while (right < arr.length) {
    subArray = subArray + (right - left + 1);
    right++;
  }
  console.log("optimized way of calculating all total subarray : ", subArray);
}

totalSubarray(arr);

const totalSubArrayBruteForce = (arr) => {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    for (let j = i; j < arr.length; j++) {
      count++;
    }
  }
  console.log("Bruteforce way of calculating total subarray : ", count);
};

totalSubArrayBruteForce(arr);

// recursion
//print 1 to n

console.log("recursion printing from 1 to n ");

function print(val, n) {
  if (n == val) {
    return;
  }
  console.log(val);
  print(val + 1, n);
}

//printing even no till n
function printEven(val, n) {
  if (val >= n) {
    return;
  }

  console.log(val);

  printEven(val + 2, n);
}

// always pass n as even
function printEvenOneArg(n) {
  if (n == 2) {
    console.log(n);
    return;
  }

  printEvenOneArg(n - 2);

  console.log(n);
}

print(1, 5);
console.log("recursion printing even from 1 to n");
printEven(2, 5);
console.log("recursion printing even till n");
printEvenOneArg(6);

//solving fibbonaci using iterative approch
let val = 1;

let n = 5;

function fib(n) {
  let last = 1;
  let sLast = 0;

  let currVal = 0;
  for (let i = 2; i <= n; i++) {
    currVal = last + sLast;
    sLast = last;
    last = currVal;
  }

  return currVal;
}

console.log("fibbonci using iterative : ", fib(3));
