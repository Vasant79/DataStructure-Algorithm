/**
 print 1 to n
 */

function printOneToN(start, n) {
  if (start > n) {
    return;
  }

  console.log(start);
  start++;

  printOneToN(start, n);
}
console.log("Printing 1 to N using recursion");
const result = printOneToN(1, 5);

/**
 print n to 1
 vice versa of above
 */

function printNTo1(start) {
  if (start < 1) {
    return;
  }

  console.log(start);
  start--;

  printNTo1(start);
}

console.log("Printing N to 1 using recursion");
printNTo1(5);
