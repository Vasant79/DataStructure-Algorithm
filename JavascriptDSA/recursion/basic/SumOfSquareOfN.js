// sum of square of n

let n = 4;

function sumOfSquare(n) {
  if (n === 1) {
    return 1;
  }
  return Math.pow(n, 2) + sumOfSquare(n - 1);
}

console.log(sumOfSquare(4));
