// largest element

const number = [2, 5, 1, 3, 0];

let maxNumber = Number.MIN_SAFE_INTEGER;

//optimized
for (let i = 0; i < number.length; i++) {
  if (number[i] > maxNumber) {
    maxNumber = number[i];
  }
}

// doing using recursion
function largestNum(array, start, max) {
  if (start == array.length - 1) {
    if (array[start] > max) {
      max = array[start];
    }
    console.log("Maximum element using recursion --> ", max);
    return;
  }

  if (array[start] > max) {
    max = array[start];
  }

  largestNum(array, start + 1, max);
}

// console.log("Maximun number in the array ", maxNumber);
largestNum(number, 0, 0);
