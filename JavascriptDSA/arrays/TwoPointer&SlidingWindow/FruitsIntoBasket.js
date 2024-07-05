const arr = [0, 1, 2, 2, 2, 2];
// const arr = [2, 1, 2];

function getMax(map) {
  const maxArr = [];
  let max1 = 0;
  let max2 = 0;
  for (let [key, value] of map) {
    if (value > max1) {
      max2 = max1;
      max1 = value;
    } else if (value > max2 && value < max1) {
      max2 = value;
    }
  }
  maxArr.push(max1);
  maxArr.push(max2);
  console.log(maxArr);
  return maxArr;
}

function fruitsIntoBaseket(arr) {
  //store tree with their frequnecy
  const map = new Map();

  for (let i = 0; i < arr.length; i++) {
    map.set(arr[i], (map.get(arr[i]) || 0) + 1);
  }
  // we have 2 basket get max and 2nd max -- considering basekt to be fixed integer
  let [basket1, basket2] = getMax(map);

  //totatl trees= basket sum
  return basket1 + basket2;
}

const result = fruitsIntoBaseket(arr);
console.log(result);
