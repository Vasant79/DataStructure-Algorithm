// find the largest odd number

const num = "35427";
// const num = "4206";
// const num = "52";

function largestOddNumber(num) {
  let index;
  const len = num.length;

  let result = "";

  for (let i = len - 1; i >= 0; i--) {
    let number = Number(num.charAt(i));

    if (number % 2 !== 0) {
      index = i + 1;
      break;
    }
  }
  console.log("index --> ", index);

  if (index) {
    for (let i = 0; i <= index - 1; i++) {
      result = result + num.charAt(i);
    }
  }
  console.log(result);
}

largestOddNumber(num);
