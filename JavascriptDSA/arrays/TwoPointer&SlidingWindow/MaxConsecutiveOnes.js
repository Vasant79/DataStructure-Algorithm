/**
 Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 */

const nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0];
const k = 2;

function maxConsecutiveOne(nums, k) {
  let left = 0;
  let right = 0;

  while (right < nums.length) {
    if (nums[right] == 0) k--;

    if (k < 0) {
      if (nums[left] == 0) k++;
      left++;
    }

    right++;
  }
  console.log(right - left);
}

maxConsecutiveOne(nums, 2);
