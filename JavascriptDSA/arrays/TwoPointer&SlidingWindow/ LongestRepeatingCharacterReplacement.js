/**
 You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Input: s = "AABABBA", k = 1
Output: 4
 */

const s = "AABABBA";
const k = 1;

function swapChar(s) {
  const map = new Map();

  for (let i = 0; i < s.length; i++) {
    map.set(s[i], (map.get(s[i]) || 0) + 1);
  }

  let leastOcc = Number.MAX_SAFE_INTEGER;
  let leastChar = "";

  for (let [key, value] of map) {
    if (value < leastOcc) {
      leastOcc = value;
      leastChar = key;
    }
  }
  console.log(leastChar);
  return leastChar;
}
function getLongestSubString(s, k) {
  const len = s.length;
  let max = 0;
  let count = 0;
  let occ = k;
  let leastChar = swapChar(s);

  for (let i = 0; i < len - 1; i++) {
    let ch = s[i];
    count++;
    if (ch === leastChar && occ > 0) {
      count++;
      occ--;
    }
  }
}

getLongestSubString(s, k);
