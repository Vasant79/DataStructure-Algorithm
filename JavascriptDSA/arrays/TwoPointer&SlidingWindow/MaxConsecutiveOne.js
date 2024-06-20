const nums = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1];
const k = 3;

// brute force
function maxConsecutiveOne(nums, k) {
  let len = 0;

  for (let i = 0; i < nums.length; i++) {
    let count = 0;
    for (let j = i; j < nums.length; j++) {
      let ele = nums[j];
      if (ele == 0) {
        count++;
      }
      if (count > k) {
        len = Math.max(len, j - i);
        break;
      }
    }
  }

  console.log(len);
}

maxConsecutiveOne(nums, k);
