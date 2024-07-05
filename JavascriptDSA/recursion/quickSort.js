// quick sort

const arr = [2, 7, 1, 5, 0, 2];
const start = 0;
const end = arr.length - 1;

function partision(arr, start, end) {
  // put pivot at right place, return pivot index
  let pivot = arr[end];

  let position = start;

  // issue here was using i=0 i<arr.length -- bug same type of bug in merge sort
  for (let i = start; i <= end; i++) {
    if (arr[i] <= pivot) {
      // swap the ele of position with ele at i
      let temp = arr[position];
      arr[position] = arr[i];
      arr[i] = temp;
      position++;
    }
  }

  return position - 1;
}

function quickSort(arr, start, end) {
  if (start >= end) {
    return;
  }

  let pivot = partision(arr, start, end);

  quickSort(arr, start, pivot - 1);
  quickSort(arr, pivot + 1, end);
}

quickSort(arr, start, end);
console.log(arr);
