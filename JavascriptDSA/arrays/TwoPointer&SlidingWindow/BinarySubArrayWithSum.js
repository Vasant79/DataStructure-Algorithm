/**
 Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.
Example 1:
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
 */

const nums = [1, 0, 1, 0, 1];
const goal = 2;

// corect brute force
function subArrayCount(nums, goal) {
  const len = nums.length;
  let count = 0;

  for (let i = 0; i < len; i++) {
    let sum = 0;

    for (let j = i; j < len; j++) {
      sum = sum + nums[j];

      if (sum === goal) {
        count++;
      }
    }
  }

  console.log(count);
}

// optimized two pointer sliding window
function getSubArrayCountGreaterEqualThanGeal(nums, goal) {
  if (goal < 0) {
    return;
  }
  const len = nums.length;

  let left = 0;
  let right = 0;
  let sum = 0;
  let count = 0;

  while (right < len) {
    sum = sum + nums[right];

    while (sum > goal) {
      sum = sum - nums[left];
      left++;
    }
    count = count + (right - left + 1);
    right++;
  }
  return count;
}

function optimized(nums, goal) {
  let result =
    getSubArrayCountGreaterEqualThanGeal(nums, goal) -
    getSubArrayCountGreaterEqualThanGeal(nums, goal - 1);

  console.log(result);
}

// subArrayCount(nums, goal);
optimized(nums, goal);
