/**
  recursion is fn calling itself till it meets base case
  backtracking what you do once base case is met and you are going back
 */

function printOneToN(start, n) {
  if (start < 1) {
    return;
  }
  printOneToN(start - 1, n);
  console.log(start);
}

console.log("printing 1 to n using bactracking");
printOneToN(5, 5);

// print nto 1 using backtracking

function printNToOne(start, n) {
  if (start > n) {
    return;
  }

  printNToOne(start + 1, n);
  console.log(start);
}

console.log("printing n to 1 using bactracking");
printNToOne(1, 4);
