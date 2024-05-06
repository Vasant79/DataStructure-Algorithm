// count od maximum consecutive one

const array = [1, 1, 0, 1, 1, 1];

let max = 0;

function getMaxConsecutiveOne(array) {
  let current = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] == 1) {
      current++;
      max = Math.max(max, current);
    } else {
      current = 0;
    }
  }
  return max;
}

console.log("Max consecutive 1 is --> ", getMaxConsecutiveOne(array));
