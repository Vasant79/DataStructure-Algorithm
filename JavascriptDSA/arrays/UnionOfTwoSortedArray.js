// give union of 2 sorted array -- union is mix all common and distint element

let array1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let array2 = [2, 3, 4, 4, 5, 11, 12];

let map = new Map();

//storing values in map
function storeValueInMap(array) {
  for (let i = 0; i < array.length; i++) {
    if (map.get(array[i])) {
      //update its value
      map.set(array[i], map.get(array[i]) + 1);
    } else {
      map.set(array[i], 1);
    }
  }
}

//pushing keys to array for generating union array
function unionArray(map) {
  const unionArray = [];

  map.forEach((value, keys) => {
    unionArray.push(keys);
  });

  return unionArray;
}

storeValueInMap(array1);
storeValueInMap(array2);
console.log("Union array : ", unionArray(map));
