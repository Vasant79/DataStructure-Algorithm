/**
 There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

Example 1:
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
 */

// const cardPoints = [1, 2, 3, 4, 5, 6, 1];
// const k = 3;

const cardPoints = [9, 7, 7, 9, 7, 7, 9];
const k = 7;

function maximumPoint(cardPoints, k) {
  let left = k - 1;
  let right = cardPoints.length - 1;

  let sum = 0;
  let maxSum = 0;

  for (let i = 0; i <= left; i++) {
    sum = sum + cardPoints[i];
  }

  maxSum = Math.max(maxSum, sum);

  while (left >= 0) {
    sum = sum - cardPoints[left] + cardPoints[right];
    maxSum = Math.max(maxSum, sum);
    left--;
    right--;
  }
  console.log(maxSum);
}

maximumPoint(cardPoints, k);
