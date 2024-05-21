/**
 
Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Input:
 nums = [2,0,2,1,1,0]
Output
: [0,0,1,1,2,2]
 */

const nums = [2, 0, 2, 1, 1, 0];

function sortArray(nums) {
  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[j] < nums[i]) {
        //swap
        let temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
  }
}

// sorting it in O(N) using dutch national flag algo
function dutchNationFlag(nums) {
  let left = 0;
  let right = nums.length - 1;
  let curr = left;

  while (curr <= right) {
    if (nums[curr] == 2) {
      //swap with right
      let temp = nums[curr];
      nums[curr] = nums[right];
      nums[right] = temp;
    }

    if (nums[curr] == 0) {
      left++;
    }
    if (nums[right] == 2) {
      right--;
    }
    curr++;
  }

  console.log(nums);
}

dutchNationFlag(nums);
