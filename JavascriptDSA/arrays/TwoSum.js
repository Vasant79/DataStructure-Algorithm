/**
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

const nums = [2, 7, 11, 15];
const target = 9;

function twoSum(nums, target) {
  let result = [];

  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[j] + nums[i] == target) {
        //store index
        result.push(i);
        result.push(j);
        console.log(result);
        return;
      }
    }
  }
}

function twoSumOptimized(nums, target) {
  const map = new Map();
  const result = [];

  //populate value in map for storing element & index
  for (let i = 0; i < nums.length; i++) {
    let value = target - nums[i];

    if (map.has(value)) {
      result.push(map.get(value));
      result.push(i);
      console.log("Solved using optimised approch ", result);
      return;
    }

    map.set(nums[i], i);
  }
}

twoSum(nums, target);
twoSumOptimized(nums, target);
