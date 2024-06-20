// function codechef
const k = 4;

function checkForN(k) {
  let sum = 0;
  let start = 2;
  end = 10;

  while (start < 10) {
    let val = k * start;

    if (validVal(val, k)) {
      console.log(`valid ${val} `, validVal(val));
      sum = sum + val;
    }

    start++;
  }
  console.log("Sum of all N : ", sum);
}

function validVal(val, k) {
  for (let i = 1; i < val; i++) {
    if (val % i == 0) {
      if (k < i) {
        return false;
      }
    }
  }
  return true;
}

checkForN(k);
