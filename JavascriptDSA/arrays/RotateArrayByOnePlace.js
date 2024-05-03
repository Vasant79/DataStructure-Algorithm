//  left rotate array by 1 place

// tc - On & Sc -On
function rotateArrayToLeftByOne(array) {
  let resArray = [];

  for (let i = 1; i < array.length; i++) {
    resArray[i - 1] = array[i];
  }

  resArray[array.length - 1] = array[0];

  return resArray;
}

// Optimized ts - On
function rotateArrayToLeft(array) {
  let temp = array[0];

  for (let i = 0; i < array.length - 1; i++) {
    array[i] = array[i + 1];
  }

  array[array.length - 1] = temp;

  return array;
}

console.log(
  "Original array rotate to left by 1 : [1,2,3,4,5] --> ",
  rotateArrayToLeft([1, 2, 3, 4, 5])
);
