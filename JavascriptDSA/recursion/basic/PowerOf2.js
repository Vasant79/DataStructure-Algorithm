// check if n is a power of 2

function checkIfPower(n) {
  let base = 2;
  let pow = 0;

  for (let i = 0; i < n; i++) {
    let res = base ** pow;

    if (res === n) {
      return true;
    } else if (res > n) {
      return false;
    }

    pow++;
  }
}

// recursive approch
function pow(start, n) {
  if (start == n) {
    return false;
  }

  if (Math.pow(2, start) == n) {
    return true;
  }
  return pow(start + 1, n);
}

console.log(checkIfPower(8));
console.log(pow(0, 8));

// calculate pow of 2 eg 2**6
function getPower(n) {
  if (n == 1) {
    return 2;
  }

  return 2 * getPower(n - 1);
}

console.log("Powe of 2 : ", getPower(5));
