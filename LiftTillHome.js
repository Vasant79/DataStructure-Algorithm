// boy wants lift to go home

const totalDistance = 10;
let travelledDistance = 0;

function askLift() {
  console.log("hey give me lift");
}

function liftResponse() {
  let response = [true, false];
  let randomResponse = response[Math.floor(Math.random() * response.length)];
  console.log("lift given  ?  ", randomResponse);
  return randomResponse;
}

function move() {
  while (travelledDistance <= totalDistance) {
    askLift();
    if (travelledDistance == totalDistance) {
      console.log("reached home");
      break;
    }
    if (liftResponse()) {
      console.log("got lift reached home");
      break;
    }
    travelledDistance++;
  }
}

console.log("child going to home -- real world situation into code");
move();
