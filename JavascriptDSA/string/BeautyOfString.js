/**
 
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

 

Example 1:

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
 */

const s = "aabcb";

function stringBeauty(map) {
  let max = Number.MIN_SAFE_INTEGER;
  let min = Number.MAX_SAFE_INTEGER;

  map.forEach((values, key) => {
    if (min > values) {
      min = values;
    }
    if (max < values) {
      max = values;
    }
  });

  return max - min;
}

function totalBeauty(s) {
  const len = s.length;
  let value = 0;

  for (let i = 0; i < len; i++) {
    let map = new Map();
    for (let j = i; j < len; j++) {
      map.set(s[j], (map.get(s[j]) || 0) + 1);

      if (map.size == 1) {
        continue;
      }
      value = value + stringBeauty(map);
    }
  }
  console.log(value);
}

totalBeauty(s);
