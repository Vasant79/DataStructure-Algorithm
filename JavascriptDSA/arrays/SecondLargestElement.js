// second largest element without sorting

const number = [1, 2, 4, 7, 7, 5];

// solution with sorting -- tc Onlogn
function sort(number) {
  //bubble sort
  for (let i = 0; i < number.length; i++) {
    for (let j = i + 1; j < number.length; j++) {
      if (number[i] > number[j]) {
        //swap
        let temp = number[i];
        number[i] = number[j];
        number[j] = temp;
      }
    }
  }
}

function secondLargestElement(number) {
  let last = number.length - 1;

  sort(number);

  for (let i = last; i >= 0; i--) {
    if (number[i - 1] != number[i]) {
      console.log(
        "Second largest element solution using sorting ",
        number[i - 1]
      );
      break;
    }
  }
}

secondLargestElement(number);

// finding solution wihtout without sorting -- tc  On
function max(number) {
  //Math.max(...arr)
  let max = Number.MIN_SAFE_INTEGER;

  for (let i = 0; i < number.length; i++) {
    if (max < number[i]) {
      max = number[i];
    }
  }
  return max;
}

function secondLargestMax(number) {
  let max = max(number);
  let secondLargestMax = Number.MIN_SAFE_INTEGER;

  for (let i = 0; i < number.length; i++) {
    if (secondLargestMax < number[i] && secondLargestMax < max) {
      secondLargestMax = number[i];
    }
  }

  console.log(
    "second larget maximum element solution without sorting ",
    secondLargestMax
  );
}

//striver solution --
function secondLarge2(number) {
  if (number.length < 2) {
    return -1;
  }

  let large = -Infinity;
  let secondLarge = -Infinity;

  for (let i = 0; i < number.length; i++) {
    if (number[i] > large) {
      secondLarge = large;
      large = number[i];
    } else if (number[i] > secondLarge && number[i] != large) {
      secondLarge = number[i];
    }
  }

  console.log(secondLarge);
}

// secondLargestElement(number);
secondLarge2(number);
