// remove outer most paranthesis

// const str = "(()())(())";
const str = "(()())(())(()(()))";
// const str = "()()";

// intitution - use stack
function removeOuterParanthesis(str) {
  let stack = new Array();
  let result = "";

  const len = str.length;

  for (let i = 0; i < len; i++) {
    let bracket = str.charAt(i);
    if (bracket == "(") {
      if (stack.length > 0) {
        result = result + bracket;
      }
      stack.push(bracket);
    } else {
      stack.pop();
      if (stack.length > 0) {
        result = result + bracket;
      }
    }
  }

  console.log(result);
}

removeOuterParanthesis(str);
