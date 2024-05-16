// Sort Characters By Frequency
/**
 * Input: s = "tree"
    Output: "eert"
 */

const str = "Aabb";

function getKeys(map, searchValue) {
  for (const [key, value] of map.entries()) {
    if (value === searchValue) {
      return key;
    }
  }
}

function sortCharByFreq(str) {
  let result = "";
  let map = new Map();

  for (let i = 0; i < str.length; i++) {
    let ch = str[i];

    if (map.has(ch)) {
      map.set(ch, map.get(ch) + 1);
    } else {
      map.set(ch, 1);
    }
  }

  while (map.size > 0) {
    let maxValue = Math.max(...map.values());
    let key = getKeys(map, maxValue);

    if (maxValue > 1) {
      let count = 0;
      while (count < maxValue) {
        result = result + key;
        count++;
      }
    } else {
      result = result + key;
    }

    map.delete(key);
  }

  console.log(result);
}

sortCharByFreq(str);
