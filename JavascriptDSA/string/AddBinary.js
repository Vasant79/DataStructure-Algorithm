const a = "1010";
const b = "1011";

function convertToNumeric(a) {
  //convert to numeric
  let power = 0;
  let value = 0;

  for (let i = a.length - 1; i >= 0; i--) {
    let res = 0;

    res = Number(a[i]) * 2 ** power;
    value = value + res;
    power++;
  }
  return value;
}

function convertToBinary(result) {
  let value = result;
  let bArr = [];

  if (result == 0) {
    return 0;
  }

  while (value > 0) {
    let bValue = value % 2;
    bArr.push(bValue);

    value = Math.floor(value / 2);
  }
  bArr.push(1);

  let BinaryValue = "";

  bArr.reverse();
  bArr.forEach((value) => {
    BinaryValue = BinaryValue + value;
  });

  console.log(BinaryValue);

  return BinaryValue;
}

var addBinary = function (a, b) {
  let no1 = convertToNumeric(a);
  let no2 = convertToNumeric(b);
  console.log(no1, no2);

  let result = no1 + no2;
  console.log(result);

  convertToBinary(result);
};

addBinary(a, b);
