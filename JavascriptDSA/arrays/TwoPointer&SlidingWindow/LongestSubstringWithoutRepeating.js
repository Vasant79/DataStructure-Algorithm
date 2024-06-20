/**
 Problem Statement: Given a String, find the length of longest substring without any repeating character.
Example 1:
Input: s = ”abcabcbb”

my approch was correct -
problem - was using if instead of while & was removing current element from set should have removed left
 */

const s = "abcabcbb";
// const s = "pwwkew";

function longestSubStringWithoutRepetation(s) {
  let left = 0;
  let right = 0;

  let set = new Set();
  let len = 0;
  let result = 0;

  while (right < s.length) {
    let ch = s[right];
    if (set.has(ch)) {
      set.clear();
      left = right;
    }
    set.add(ch);
    len = right - left + 1;
    result = Math.max(len, result);
    right++;
  }

  console.log(result);
}

longestSubStringWithoutRepetation(s);
