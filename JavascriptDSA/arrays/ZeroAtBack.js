// store all the zeros at back also mantain the order

const array = [1, 2, 0, 1, 0, 4, 0];

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

// my optimized approch -- two pointer approch
function moveZeroToBack(array) {
  let i = 0;
  for (let j = 0; j < array.length; j++) {
    if (array[i] != 0) {
      i++;
    } else if (array[i] == 0 && array[j] != 0) {
      //swap
      let temp = array[i];
      array[i] = array[j];
      array[j] = temp;

      i++;
    }
  }

  console.log("optimized solution --> ", array);
}

console.log(`zerp pushed to back of [ 1,2,0,1,0,4,0 ]`);
console.log(zeroAtBack([1, 2, 0, 1, 0, 4, 0]));

moveZeroToBack(array);
