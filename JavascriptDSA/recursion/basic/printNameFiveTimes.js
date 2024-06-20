/**
 print name 5 time
 */

function printName(name, count) {
  if (count == 5) {
    return;
  }

  console.log(name);
  count++;

  printName(name, count);
}

const result = printName("Vasant", (count = 0));
