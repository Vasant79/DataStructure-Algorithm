// no of subsequence
const arr = [1, 2, 4];
function countOfSubsequence(index, ds, arr) {
  if (index >= arr.length) {
    return 1;
  }

  ds.push(arr[index]);
  let fx = countOfSubsequence(index + 1, ds, arr);
  ds.pop();
  let fy = countOfSubsequence(index + 1, ds, arr);

  return fx + fy;
}

console.log(countOfSubsequence(0, [], arr));
