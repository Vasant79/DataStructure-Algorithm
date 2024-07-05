// fibonacci - print fibo no at n position

const position = 6;

//iterative approch
function fiboIterative(position) {
  let v1 = 1;
  let v2 = 0;

  let curr = 0;
  for (let i = 2; i <= position; i++) {
    curr = v1 + v2;
    v2 = v1;
    v1 = curr;
  }

  return curr;
}

console.log(fiboIterative(position));

// recursivce approch
function fib(position) {
  if (position === 0) {
    return 0;
  }
  if (position === 1) {
    return 1;
  }

  return fib(position - 1) + fib(position - 2);
}

console.log(fib(position));
