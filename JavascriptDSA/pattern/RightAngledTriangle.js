/**
 Input Format: N = 6
Result:
* 
* * 
* * *
* * * *
* * * * *
* * * * * *
 */

const n = 6;

function printPattern(n) {
  for (let i = 0; i < n; i++) {
    let line = "";
    for (let j = 0; j <= i; j++) {
      line = line + "*";
    }
    console.log(line);
  }
}

//print no instead of star
function printPatternNo(n) {
  for (let i = 0; i < n; i++) {
    let count = 1;
    let line = "";
    for (let j = 0; j <= i; j++) {
      line = line + count;
      count++;
    }
    console.log(line);
  }
}

// modified version
function printPattern4(n) {
  let count = 1;
  for (let i = 0; i < n; i++) {
    let line = "";

    for (let j = 0; j <= i; j++) {
      line = line + count;
    }
    count++;
    console.log(line);
  }
}

printPattern(n);
printPatternNo(n);
printPattern4(n);
