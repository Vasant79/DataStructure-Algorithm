/**
 two pointer / slinding window approch 
 Boradely 4 patterns
 1. constant window
 */

//
const arr = [-1, 2, 3, 3, 4, 5, -1];
const k = 4;

//constant window problem
function subArrayWithMaxSum(arr, k) {
  let right = 0;
  let left = 0;
  let sum = 0;
  let result = 0;

  while (right < arr.length) {
    sum = sum + arr[right];

    if (right - left + 1 > 4) {
      sum = sum - arr[left];
      left++;
    }

    result = Math.max(result, sum);
    right++;
  }

  console.log("Constant window pattern --> ", result);
}

subArrayWithMaxSum(arr, k);

//longest subarray / substring

const array = [2, 5, 1, 7, 10];
const val = 14;

function longestSubArray(array, val) {
  let left = 0;
  let right = 0;

  let sum = 0;
  let result = 0;

  while (right < array.length) {
    sum = sum + array[right];
    if (sum > val) {
      sum = sum - array[left];
      left++;
    }
    if (sum <= val) {
      result = Math.max(result, right - left + 1);
    }

    right++;
  }
  console.log("Longest subarray pattern --> ", result);
}

longestSubArray(array, val);
