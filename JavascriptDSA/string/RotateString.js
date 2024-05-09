/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.
 */

const s = "abcde";
const goal = "cdeab";

function move(strArray) {
  const len = strArray.length;
  for (let i = len - 1; i > 0; i--) {
    strArray[i] = strArray[i - 1];
  }
  return strArray;
}

function rotateString(s, goal) {
  let rotation = s.length;

  let strArray = Array.from(s);

  for (let i = 0; i < rotation; i++) {
    temp = strArray[rotation - 1];
    console.log(temp);

    strArray = move(strArray);
    strArray[0] = temp;

    console.log(strArray);
    console.log(strArray.join(","));

    //problem converting array to string .join("") -- if you dont want anything inbetween elements
    if (strArray.join("") === goal) {
      return true;
    }
  }

  return false;
}

rotateString(s, goal);
