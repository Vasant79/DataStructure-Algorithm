// subsequence power set

const arr = [1, 2, 3];
let str = "abc";
let index = 0;
let ds = [];
let res = "empty"; // results storing all subsequence

//print all the sub sequence of str

function subsequence(str, index, ds, res) {
  if (index >= str.length) {
    res = ds.join("") + " ";
    // console.log(res);
    return res;
  }

  let f1 = subsequence(str, index + 1, ds, res);

  ds.push(str[index]);
  let f2 = subsequence(str, index + 1, ds, res);
  ds.pop();

  return `${f1} ${f2}`;
}

let result = subsequence(str, index, ds, res);
console.log(result);
