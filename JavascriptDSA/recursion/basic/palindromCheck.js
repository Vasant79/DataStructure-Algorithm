// check if palindrom or not

const str = "madam";

//edge case some char can upper case , first covert all to smaller case
function palindromCheck(str, left, right) {
  if (left >= right) {
    return true;
  }

  if (str[left] != str[right]) {
    return false;
  }

  return palindromCheck(str, left + 1, right - 1);
}

let result = palindromCheck(str, (left = 0), (right = str.length - 1));
console.log("is Palindrom : ", result);
