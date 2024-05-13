// longest common prefix
/**
 * Input: strs = ["flower","flow","flight"]
    Output: "fl"


    algo -- 1st loop for grabing & comparing ch of flowers.
    2nd loop for comapring the 1st ch of every other ele
    increment the ch that need to be compared
 */

const str = ["flower", "flow", "flight"];

function longestPrefix(str) {
  let tracker = "";
  let word = "";

  let count = 0;

  while (count < str[0].length) {
    tracker = word;
    word = word + str[0][count];

    for (let i = 1; i < str.length; i++) {
      if (str[i][count] !== word[count]) {
        console.log(word);
        return tracker;
      }
    }
    count++;
  }
}
longestPrefix(str);
