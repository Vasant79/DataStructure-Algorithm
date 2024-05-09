// words same when reverse

let str = "this is an amazing program";
let s = "this is an amazing program";

// console.log("converting to array using split --> ", str.split(" ")); -- each word becomes an element
// console.log("converting to array using Array.form() --> ", Array.from(str)); -- each letter becomes an element

function reverse(str) {
  let strArray = str.split(" ");

  //reverse
  let start = 0;
  let end = strArray.length - 1;

  while (start <= end) {
    //swap
    let temp = strArray[start];
    strArray[start] = strArray[end];
    strArray[end] = temp;
    start++;
    end--;
  }

  console.log(strArray.join(" "));
}

//striver solution -- optimized O(n)
function result(s) {
  let temp = "";
  let ans = "";

  let start = 0;
  let end = s.length - 1;

  while (start <= end) {
    let ch = s.charAt(start);

    if (ch != " ") {
      temp = temp + ch;
    } else if (ch == " ") {
      if (ans !== "") {
        ans = temp + " " + ans;
      } else {
        ans = temp;
      }
      temp = "";
    }
    start++;
  }

  if (temp != "") {
    if (ans != "") {
      ans = temp + " " + ans;
    }
  } else {
    ans = temp;
  }

  return ans;
}

reverse(str);
console.log(result(s));
