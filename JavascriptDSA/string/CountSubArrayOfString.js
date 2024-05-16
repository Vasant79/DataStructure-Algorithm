/**
Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 

Input:
S = "aba", K = 2
Output:
3
Explanation:
The substrings are: "ab", "ba" and "aba".
 */

const str = "ecbaddce";
let value = 3;

function subString(str, value) {
  let result = 0;
  //all substring
  const len = str.length;

  for (let i = 0; i < len; i++) {
    let set = new Set();
    for (let j = i; j < len; j++) {
      set.add(str[j]);

      if (set.size == value) {
        result++;
      }
      if (set.size > value) {
        break;
      }
    }
    set.clear();
  }
  console.log(result);
}

subString(str, value);
