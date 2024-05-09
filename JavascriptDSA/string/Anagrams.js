// Problem Statement: Given two strings, check if two strings are anagrams of each other or not.

const word1 = "anagram";
const word2 = "nagaram";

//assuming it to be case sensetive

function comapre(map1, map2) {
  for (let i of map1.keys()) {
    if (map1.get(i) != map2.get(i)) {
      return false;
    }
  }
  return true;
}

function findAnagram(word1, word2) {
  if (word1.length != word2.length) {
    return false;
  }

  let map1 = new Map();
  let map2 = new Map();

  const len = word1.length;

  for (let i = 0; i < len; i++) {
    if (map1.has(word1.charAt(i))) {
      map1.set(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
    } else {
      map1.set(word1.charAt(i), 1);
    }
  }

  for (let i = 0; i < len; i++) {
    if (map2.has(word2.charAt(i))) {
      map2.set(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
    } else {
      map2.set(word2.charAt(i), 1);
    }
  }

  console.log(map1);
  console.log(map1);
  const result = comapre(map1, map2);
  console.log("result --> ", result);
}

findAnagram(word1, word2);
