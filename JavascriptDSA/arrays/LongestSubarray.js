// find the longest subarray with sum k -- todo optimize

// const array = [2, 3, 5, 1, 9];
// let k = 10;
const array = [-1, 1, 1];
let k = 1;

function sum(array) {
  let sum = 0;
  for (let i = 0; i < array.length; i++) {
    sum = sum + array[i];
  }
  return sum;
}

function longestSubarrayWithSumK(array, k) {
  let result = [];

  //subarray
  for (let i = 0; i < array.length; i++) {
    for (let j = i; j < array.length; j++) {
      const subArray = [];
      for (let k = i; k <= j; k++) {
        subArray.push(array[k]);
      }
      let subArraySum = sum(subArray);
      if (subArraySum == k) {
        if (result.length < subArray.length) {
          result = subArray;
        }
      }
    }
  }
  console.log(result);
}

longestSubarrayWithSumK(array, k);
