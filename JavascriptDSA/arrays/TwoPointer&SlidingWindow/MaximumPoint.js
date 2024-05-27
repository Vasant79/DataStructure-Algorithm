/**
 There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

Example 1:
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
 */

const cardPoints = [1, 12, 3, 4, 5, 6, 1];
const k = 3;

function maximumPoint(cardPoints, k) {
  let maxPoint = 0;
  let point = 0;

  //forward k
  for (let i = 0; i < k; i++) {
    point = point + cardPoints[i];
    maxPoint = Math.max(maxPoint, point);
  }

  //last k
  let start = cardPoints.length - k;
  point = 0;
  for (let i = start; i < cardPoints.length; i++) {
    point = point + cardPoints[i];
    maxPoint = Math.max(maxPoint, point);
  }

  //incase combination
  let left = 0;
  let right = 0;
  point = 0;

  for (let i = 0; i < k; i++) {
    if (cardPoints[left] < cardPoints[right]) {
      point = point + cardPoints[right];
      right--;
    } else if (cardPoints[left] > cardPoints[right]) {
      point = point + cardPoints[left];
      left++;
    }

    maxPoint = Math.max(maxPoint, point);
  }

  console.log(maxPoint);
}

maximumPoint(cardPoints, k);
