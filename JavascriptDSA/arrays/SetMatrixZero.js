// set matrix to zero

matrix = [
  [1, 1, 1],
  [1, 0, 1],
  [1, 1, 1],
];

function setToZero(matrix) {
  let setRow = new Set();
  let setCol = new Set();

  //print matrix
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      //   console.log(matrix[i][j]);
      //check for 0
      if (matrix[i][j] == 0) {
        setRow.add(i);
        setCol.add(j);
      }
    }
  }
  console.log(setRow, setCol);

  //setting row & col to 0
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      if (setRow.has(i) || setCol.has(j)) {
        matrix[i][j] = 0;
      }
    }
  }
  console.log(matrix);
}

setToZero(matrix);
