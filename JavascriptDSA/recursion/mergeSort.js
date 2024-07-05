// merge sort -- tc O(nlogn) --sc O(n)

const nums = [5, 2, 3, 1];
let start = 0;
let end = nums.length - 1;

//merger
function merge(nums, start, mid, end) {
  const temp = [];
  let left = start;
  let right = mid + 1;

  while (left <= mid && right <= end) {
    if (nums[left] <= nums[right]) {
      temp.push(nums[left]);
      left++;
    } else {
      temp.push(nums[right]);
      right++;
    }
  }

  //incase left array is greater insize
  while (left <= mid) {
    temp.push(nums[left]);
    left++;
  }
  //incase right array is greater insize
  while (right <= end) {
    temp.push(nums[right]);
    right++;
  }

  //putting values of temp into nums -- imp step
  let index = 0;
  while (start <= end) {
    nums[start] = temp[index];
    start++;
    index++;
  }
}

function mergeSort(nums, start, end) {
  if (start == end) {
    return;
  }

  let mid = Math.floor((start + end) / 2);

  mergeSort(nums, start, mid);
  mergeSort(nums, mid + 1, end);

  merge(nums, start, mid, end);
}

mergeSort(nums, start, end);

console.log(nums);
