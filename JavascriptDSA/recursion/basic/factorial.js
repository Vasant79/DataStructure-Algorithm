// factorial of 2 using recursion

function factorialIterative(n) {
  let res = 1;

  for (let i = n; i > 1; i--) {
    res = res * i;
  }

  return res;
}

function recursiveSolution(n) {
  if (n === 1) {
    return 1;
  }

  return n * recursiveSolution(n - 1);
}

console.log(factorialIterative(5));
console.log(recursiveSolution(5));
