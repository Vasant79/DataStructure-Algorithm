// store all the zeros at back also mantain the order

function zeroAtBack(array) {
  const resultArray = [];
  let nonZeroCount = 0;

  for (let i = 0; i < array.length; i++) {
    if (array[i] != 0) {
      resultArray.push(array[i]);
      nonZeroCount++;
    }
  }

  //populating zero
  for (let i = nonZeroCount; i < array.length; i++) {
    resultArray[i] = 0;
  }

  return resultArray;
}

console.log(`zerp pushed to back of [ 1,2,0,1,0,4,0 ]`);
console.log(zeroAtBack([1, 2, 0, 1, 0, 4, 0]));
