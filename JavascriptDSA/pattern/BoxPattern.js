/**
 Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *

 */

const n = 3;

function printPattern(n) {
  for (let i = 0; i < n; i++) {
    let line = "";
    for (let j = 0; j < n; j++) {
      line = line + "*";
    }
    console.log(line);
  }
}

printPattern(n);
