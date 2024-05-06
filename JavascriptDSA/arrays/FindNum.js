// find if a number is present in array - if present return index

function getNum(array, num) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] == num) {
      return i;
    }
  }
  return -1;
}

console.log(" Numbers present at index : ", getNum([1, 2, 3, 4, 5], 3));
