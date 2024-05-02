// removing duplicate from arr -- array is sorted -- tc On -- Sc Om+n

function getFrequency(array) {
  let map = new Map();

  for (let i = 0; i < array.length; i++) {
    if (map.get(array[i])) {
      map.set(array[i], map.get(array[i]) + 1);
    } else {
      map.set(array[i], 1);
    }
  }

  return map;
}

function removeDuplicate(array) {
  const resultArray = [];
  let allFrequency = getFrequency(array);

  allFrequency.forEach((values, keys) => {
    resultArray.push(keys);
  });

  return resultArray;
}

console.log(
  "removing duplicates from sorted array ",
  removeDuplicate([1, 1, 2, 2, 2, 3, 3])
);
