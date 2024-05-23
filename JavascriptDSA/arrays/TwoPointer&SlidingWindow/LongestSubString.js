/**
 Problem Statement: Given a String, find the length of longest substring without any repeating character.
Example 1:
Input: s = ”abcabcbb”
Output: 3
 */

const s = "pwwkew";

function longestSubString(s) {
  const set = new Set();
  let len = 0;

  for (let i = 0; i < s.length; i++) {
    for (let j = i; j < s.length; j++) {
      let ch = s[j];
      if (!set.has(ch)) {
        set.add(ch);
        len = Math.max(len, set.size);
      } else {
        break;
      }
    }
    set.clear();
  }

  console.log(len);
}

// optimized solution
function solve(s) {
  let map = new Map();
  let left = 0;
  let right = 0;
  let n = s.length;
  let len = 0;

  while (right < n) {
    if (map.has(s.charAt(right))) {
      left = Math.max(map.get(s.charAt(right)) + 1, left);
    }

    map.set(s.charAt(right), right);
    len = Math.max(len, right - left + 1);
    right++;
  }
  console.log(len);
}

longestSubString(s);
console.log("optimized solution ");
solve(s);
