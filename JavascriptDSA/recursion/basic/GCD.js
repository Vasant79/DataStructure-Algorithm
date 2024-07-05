/**
 * get the gcd for two numbers
 * 3 ways - iterative , recursive with extra parametrs, elucide algorith(recursive)
 **/
let val1 = 18;
let val2 = 10;

function gcd(val1, val2) {
  let remainder = val1;

  let map1 = new Map();
  let map2 = new Map();

  while (remainder > 1) {
    // console.log(remainder);

    if (remainder % 2 === 0) {
      map1.set(2, (map1.get(2) || 0) + 1);
      remainder = remainder / 2;
    } else if (remainder % 3 === 0) {
      map1.set(3, (map1.get(3) || 0) + 1);
      remainder = remainder / 3;
    } else if (remainder % 5 == 0) {
      map1.set(5, (map1.get(5) || 0) + 1);
      remainder = remainder / 5;
    }
  }
  let remainder2 = val2;
  while (remainder2 > 1) {
    // console.log(remainder2);

    if (remainder2 % 2 === 0) {
      map2.set(2, (map2.get(2) || 0) + 1);
      remainder2 = remainder2 / 2;
    } else if (remainder2 % 3 === 0) {
      map2.set(3, (map2.get(3) || 0) + 1);
      remainder2 = remainder2 / 3;
    } else if (remainder2 % 5 == 0) {
      map2.set(5, (map2.get(5) || 0) + 1);
      remainder2 = remainder2 / 5;
    }
  }

  //   return [map1, map2];
  let result = getGCD(map1, map2);
  return result;
}
function getGCD(map1, map2) {
  let res = 1;

  for (let [key, value] of map1) {
    if (map2.has(key)) {
      let freq = Math.min(value, map2.get(key));
      //   console.log(key, " no of keys : ", freq);

      while (freq > 0) {
        res = res * key;
        freq--;
      }
    }
  }
  return res;
}

//recursive approch
let a = 18;
let b = 48;

function gcdRecursive(start, a, b, gcd) {
  if (start === Math.min(a, b)) {
    return gcd;
  }
  if (a % start == 0 && b % start == 0) {
    gcd = start;
  }
  return gcdRecursive(start + 1, a, b, gcd);
}

// optimized approch -- elucide algo - uses recursion
function elucideAlgo(a, b) {
  if (b === 0) {
    // console.log(a);
    return a;
  }

  return elucideAlgo(b, a % b);
}

console.log(gcd(val1, val2));
console.log("gcd recursive approch : ", gcdRecursive(1, a, b, 1));
console.log("Elucide algorithm : ", elucideAlgo(a, b));
