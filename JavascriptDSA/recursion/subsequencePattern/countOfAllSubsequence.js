// print the count of all subsequence where sum ==k

const sub = [1, 2, 3, 4, 5];
const k = 5;

function countOfSubsequence(index, arr, sub, k, sum) {
  if (index >= sub.length) {
    if (sum === k) {
      return 1;
    }
    return 0;
  }

  sum = sum + sub[index];
  let left = countOfSubsequence(index + 1, arr, sub, k, sum);

  sum = sum - sub[index];
  let right = countOfSubsequence(index + 1, arr, sub, k, sum);

  return left + right;
}

let result = countOfSubsequence(0, [], sub, k, 0);
console.log(result);
