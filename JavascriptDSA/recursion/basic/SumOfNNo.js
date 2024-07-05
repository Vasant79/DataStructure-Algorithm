// sum of n numbers

function iterativeSum(n) {
  let sum = 0;

  while (n >= 1) {
    sum = sum + n;
    n--;
  }
  return sum;
}
function recursiveSum(n) {
  if (n == 1) {
    return 1;
  }

  return n + recursiveSum(n - 1);
}

console.log(iterativeSum(5));
console.log(recursiveSum(5));
