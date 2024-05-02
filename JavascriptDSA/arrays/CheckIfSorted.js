function sorted(array) {
  for (let i = 0; i < array.length - 1; i++) {
    if (array[i] > array[i + 1]) {
      return false;
    }
    return true;
  }
}

console.log(
  "Checking if the array is sorted or not  --> ",
  sorted([1, 2, 3, 4, 5])
);
