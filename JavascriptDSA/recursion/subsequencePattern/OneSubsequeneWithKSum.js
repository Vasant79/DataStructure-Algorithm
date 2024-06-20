// print any one subsequence where sum ===k

const sub = [1, 2, 3, 4, 5];
const k = 5;

function oneSubsequenceWithSumk(index, arr, sub, k, sum) {
  if (index >= sub.length) {
    if (sum === k) {
      console.log(arr);
      return true;
    }
    return false;
  }

  arr.push(sub[index]);
  sum = sum + sub[index];
  if (oneSubsequenceWithSumk(index + 1, arr, sub, k, sum) == true) {
    return true;
  }

  arr.pop();
  sum = sum - sub[index];
  if (oneSubsequenceWithSumk(index + 1, arr, sub, k, sum) == true) {
    return true;
  }
}

oneSubsequenceWithSumk(0, [], sub, k, (sum = 0));
