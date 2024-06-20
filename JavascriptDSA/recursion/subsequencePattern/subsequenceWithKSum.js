// print subsequence with sum == k
const sub = [1, 2, 3];

function subsequenceWithSum(index, arr, sub, k, sum) {
  if (index >= sub.length) {
    if (sum === k) {
      console.log(arr);
    }
    return;
  }

  arr.push(sub[index]);
  sum = sum + sub[index];
  subsequenceWithSum(index + 1, arr, sub, k, sum);

  arr.pop();
  sum = sum - sub[index];
  subsequenceWithSum(index + 1, arr, sub, k, sum);
}

subsequenceWithSum(0, [], sub, 5, 0);
