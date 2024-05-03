// rotate array element to right / left by k

function rotateToRightByK(array, k) {
  const temp = [];
  let end = array.length - 1 - k;

  let start = 0;

  for (let i = array.length - 1; i > end; i--) {
    temp.push(array[i]);
  }

  for (let i = end; i >= 0; i--) {
    array[i + 2] = array[i];
  }

  for (let i = temp.length - 1; i >= 0; i--) {
    array[start] = temp[i];
    start++;
  }

  return array;
}

function rotateToLeftByK(array, k) {
  let temp = [];

  let start = 0;
  //store in temp
  for (let i = 0; i < k; i++) {
    temp.push(array[i]);
  }

  //shift
  for (let i = 0; i < array.length; i++) {
    array[i] = array[i + k];
  }

  //put temp element into array
  for (let i = array.length - k; i < array.length; i++) {
    array[i] = temp[start];
    start++;
  }

  return array;
}

console.log("Array rotated to right by k times :  [1, 2, 3, 4, 5, 6, 7] ");
rotateToRightByK([1, 2, 3, 4, 5, 6, 7], 2);

console.log("Array rotated to left by k times :  [3, 7, 8, 9, 10, 11] ");
rotateToLeftByK([3, 7, 8, 9, 10, 11], 3);
