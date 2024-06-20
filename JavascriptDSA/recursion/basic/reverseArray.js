/**
 reverse an array using recursion
 */

const arr = [1, 2, 3, 4];

function swap(arr, left, right) {
  let temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
}

function reverseArr(arr, left, right) {
  if (left >= right) {
    return;
  }

  swap(arr, left, right);

  reverseArr(arr, left + 1, right - 1);
}

reverseArr(arr, (left = 0), (right = arr.length - 1));
console.log(arr);
