// removing duplicate from arr -- array is sorted -- tc On -- Sc Om+n

const array = [1, 1, 2, 2, 2, 3, 3];
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

// striver solution -- two pointer -- intitution two pointer generally in case of sorted array
function removeDuplicateInPlace(array) {
  let i = 0;

  for (let j = 1; j < array.length; j++) {
    if (array[i] != array[j]) {
      i++;
      array[i] = array[j];
    }
  }

  console.log(array);
}

// console.log(
//   "removing duplicates from sorted array ",
//   removeDuplicate([1, 1, 2, 2, 2, 3, 3])
// );

removeDuplicateInPlace(array);
