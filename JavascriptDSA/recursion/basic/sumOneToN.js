// print sum of 1 to n

function printSum(start, end, sum) {
  if (start > end) {
    console.log("sum of one to N ", sum);
    return;
  }

  sum = sum + start;

  printSum(start + 1, end, sum);
}

function printSum2(startingPoint, sum) {
  if (startingPoint < 1) {
    console.log("Another way ", sum);
    return;
  }
  sum = sum + startingPoint;
  printSum2(startingPoint - 1, sum);
}

printSum(1, 4, 0);
printSum2(4, 0);
