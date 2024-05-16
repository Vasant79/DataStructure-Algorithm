/**
 *  Maximum Nesting Depth of the Parentheses
 * 
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:

Digit 8 is inside of 3 nested parentheses in the string.
 */

const s = "(1+(2*3)+((8)/4))+1";

function maxNestDepth(s) {
  let stack = new Array();
  let depth = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] === "(") {
      stack.push(s[i]);
      depth = Math.max(depth, stack.length);
    } else if (s[i] === ")") {
      stack.pop();
    }
  }

  console.log(depth);
}

maxNestDepth(s);
