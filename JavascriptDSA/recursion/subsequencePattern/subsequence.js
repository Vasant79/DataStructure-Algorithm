/**
  print all the subsequence
 */

const sub = [1, 2, 3];

function subsequence(index, arr, sub) {
  //base
  if (index >= sub.length) {
    console.log(arr);
    return;
  }

  // 2 option for every index - take , not take
  arr.push(sub[index]);
  subsequence(index + 1, arr, sub);
  arr.pop();
  subsequence(index + 1, arr, sub);
}

subsequence(0, [], sub);
