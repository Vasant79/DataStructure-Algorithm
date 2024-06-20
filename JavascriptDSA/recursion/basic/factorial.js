// factotrial using recursion

function factorial(value, product) {
  if (value == 0) {
    console.log("factorial of given value is : ", product);
    return;
  }

  product = product * value;
  value--;
  factorial(value, product);
}

factorial(3, 1);
