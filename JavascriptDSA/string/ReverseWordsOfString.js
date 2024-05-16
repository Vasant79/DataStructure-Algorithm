/**
 * 
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

const s = "a good   example";

function reverseWords(s) {
  let str = s.trim();

  let strArray = str.split(" ");

  //reverse the array
  let left = 0;
  let right = strArray.length - 1;

  while (left <= right) {
    //swap
    let temp = strArray[left];
    strArray[left] = strArray[right];
    strArray[right] = temp;

    left++;
    right--;
  }

  let result = "";

  for (let i = 0; i < strArray.length; i++) {
    if (strArray[i] != "") {
      result = result + strArray[i] + " ";
    }
  }

  console.log(result);

  return result.trim();
}
