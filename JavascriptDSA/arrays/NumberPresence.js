// find the element that appers only once

const array = [4, 1, 2, 1, 2];

//approch - store element & freq in map see which element have freq 1

let map = new Map();

function elementAndFreq(array) {
  for (let i = 0; i < array.length; i++) {
    if (map.get(array[i])) {
      map.set(array[i], map.get(array[i]) + 1);
    } else {
      map.set(array[i], 1);
    }
  }

  return map;
}

function elementOccuringOnce(array) {
  const map = elementAndFreq(array);

  map.forEach((value, key) => {
    if (value == 1) {
      console.log(key);
    }
  });
}

elementOccuringOnce(array);
