/**
 Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

Examples
Example 1:
Input Format
: N = 3, nums[] = {3,2,3}
Result
: 3
 */

const nums = [4, 4, 2, 4, 3, 4, 4, 3, 2, 4];
const n = 10;

function majorityElement(nums, n) {
  const map = new Map();
  let element = 0;

  for (let i = 0; i < nums.length; i++) {
    map.set(nums[i], (map.get(nums[i]) || 0) + 1);
  }

  for (let [key, value] of map) {
    if (value > n / 2) {
      element = value;
      console.log("Element with occurence more then n/2 is ", key);
      return;
    }
  }
}

function mooresVotingAlgo(nums, n) {
  let count = 0;
  let element = 0;

  for (let i = 0; i < n; i++) {
    if (count == 0) {
      //store element
      element = nums[i];
    } else if (element == nums[i]) {
      count++;
    } else {
      count--;
    }
  }

  console.log("Answer using Moores voting algo ", element);
}

majorityElement(nums, n);
mooresVotingAlgo(nums, n);
