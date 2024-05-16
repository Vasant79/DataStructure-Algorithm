/**
 * 
 * Normally parsInt() used to convert string to int
 String to Integer (atoi)

 Input: s = "1337c0d3"

Output: 1337

Explanation:
Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
 */

// const s = "-425c9";
// const s = "1337c0d3";
const s = "  -042";

const atoi = (s) => {
  //eliminate space
  s = s.trim();

  //check for sign
  let positive = true;
  if (s[0] === "-") {
    positive = false;
    s = s.substring(1);
  } else if (s[i] === "+") {
    s = s.substring(1);
  }

  let result = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] == " ") {
      break;
    }
    let value = s[i] - "0";
    if (value >= 0 && value <= 9) {
      //it is an integer
      result = result * 10 + value;
    }
  }

  if (!positive) {
    result = result * -1;
  }

  //check for over flow
  let max_int = Math.pow(2, 31) - 1;
  let min_int = Math.pow(-2, 31);

  if (result > max_int) {
    console.log(max_int);
    return;
  } else if (result < min_int) {
    console.log(min_int);
    return;
  }
  console.log(result);
};

atoi(s);

console.log(typeof ("3" - "0"));
