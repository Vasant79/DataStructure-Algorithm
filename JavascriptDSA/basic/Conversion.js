// convert to binary

const binaryNo = "1000";

function convertToNumber(binaryNo) {
  let result = 0;
  let power = 0;

  for (let i = binaryNo.length - 1; i >= 0; i--) {
    if (binaryNo[i] != 0) {
      result = result + 2 ** power;
    }
    power++;
  }

  console.log("Approch 1 for converting binary to number--> ", result);
}
convertToNumber(binaryNo);

function convertToNumber2(binaryNo) {
  let result = 0;

  for (let i = 0; i < binaryNo.length; i++) {
    result = result * 2 + Number(binaryNo[i]);
  }

  console.log("Approch 2 for converting binary to number --> ", result);
}

convertToNumber2(binaryNo);

//convert numberic to binary

const no = 8;

function numberToBinary(no) {
  let result = 0;
  let value = no;
  const resultArr = [];

  while (value > 0) {
    result = value % 2;
    resultArr.push(result);
    value = Math.floor(value / 2);
  }

  console.log("No converted to binary --> ", resultArr.reverse().join(""));
}

numberToBinary(no);
