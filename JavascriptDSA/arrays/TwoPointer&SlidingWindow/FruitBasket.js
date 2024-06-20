/**
 Input:
fruits [ ] = { 0, 1, 2, 2, 2, 2 }
Output: 5
Explanation: It's optimal to pick from trees(0-indexed) [1,2,3,4,5].
 */

// const fruits = [0, 1, 2, 7, 2, 2, 2];
const fruits = [3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4];
// const fruits = [0, 1, 2, 2, 2, 2];
// const fruits = [2, 1, 2];

function fruitsInBasket(fruits) {
  let maxLen = 0;

  for (let i = 0; i < fruits.length; i++) {
    const set = new Set();
    for (let j = i; j < fruits.length; j++) {
      set.add(fruits[j]);

      if (set.size > 2) {
        break;
      }

      let len = j - i + 1;
      maxLen = Math.max(len, maxLen);
    }
    set.clear();
  }

  console.log("Non optimized solution ", maxLen);
}

// optimize
function fruitsInBasketOptimized(fruits) {
  let left = 0;
  let right = 0;

  let maxLen = 0;

  const set = new Set();

  while (right < fruits.length) {
    let element = fruits[right];
    set.add(element);

    if (set.size > 2) {
      set.delete(fruits[left]);
      left++;
    }

    maxLen = Math.max(maxLen, right - left + 1);
    right++;
  }

  console.log("Optimized approch ", maxLen);
}

fruitsInBasket(fruits);
fruitsInBasketOptimized(fruits);
