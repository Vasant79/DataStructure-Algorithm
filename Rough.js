// generating subarr

const array = [1, 2];

function generateSubArray(array) {
  for (let i = 0; i < array.length; i++) {
    const temp = [];
    for (let j = i; j < array.length; j++) {
      temp.push(array[j]);
      console.log(temp);
    }
  }
}

const s = "va";

function generateSubString(s) {
  for (let i = 0; i < s.length; i++) {
    let temp = "";
    for (let j = i; j < s.length; j++) {
      temp = temp + s[j];
      console.log(temp);
    }
  }
}

generateSubArray(array);
generateSubString(s);
