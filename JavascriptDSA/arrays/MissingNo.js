// find the missing number -- array contains 1-n no

const array = [1, 2, 4, 5];
let n = 5;
let sumOfN = (n * (n + 1)) / 2;

function missingNo(array, sumOfN) {
  let sum = 0;

  for (let i = 0; i < array.length; i++) {
    sum = sum + array[i];
  }

  return sumOfN - sum;
}

console.log("missing no ", missingNo(array, sumOfN));
