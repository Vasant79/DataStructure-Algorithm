/**
 Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".


Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
 */

const words = ["Hello", "Alaska", "Dad", "Peace"];

function checkMap(map) {
  //checks if all value in same string
  let set = new Set();

  map.forEach((values, keys) => {
    set.add(values);
  });

  let val = set.size;
  return val;
}

function findWords(words) {
  let result = [];

  for (let j = 0; j < words.length; j++) {
    let map = new Map();
    let word = words[j];
    for (let i = 0; i < words[j].length; i++) {
      let ch = words[j][i].toLowerCase();

      if ("qwertyuiop".includes(ch)) {
        map.set(ch, "s1");
      } else if ("asdfghjkl".includes(ch)) {
        map.set(ch, "s2");
      } else if ("zxcvbnm".includes(ch)) {
        map.set(ch, "s3");
      }
    }
    let res = checkMap(map);
    if (res == 1) {
      result.push(word);
    }
    map.clear();
  }
  console.log(result);
}

findWords(words);
