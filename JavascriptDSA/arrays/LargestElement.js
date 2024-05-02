// largest element

const number = [2, 5, 1, 3, 0];

let maxNumber = Number.MIN_SAFE_INTEGER;

for (let i = 0; i < number.length; i++) {
  if (number[i] > maxNumber) {
    maxNumber = number[i];
  }
}

console.log("Maximun number in the array ", maxNumber);
