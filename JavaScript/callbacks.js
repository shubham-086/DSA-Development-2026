function welcome() {
  console.log("Welcome to JavaScript");
}

function greet(callback, name = "User") {
  console.log("Hello ", name);
  callback();
}

greet(welcome, "Rohit");
greet(welcome);

const add = (a, b) => {
  console.log("Sum: ", a + b);
};

const multiply = (a, b) => {
  console.log("Multiply: ", a * b);
};

const calculate = (a, b, callback) => {
  callback(a, b);
};

// calculate(10, 12, add);
// calculate(10, 12, multiply);

// setTimeout(() => {
//   console.log("Hello");
// }, 2000);

let id = setInterval(() => {
  console.log("Hello");
}, 2000);

setTimeout(() => {
  clearInterval(id);
}, 6000);

let person = {
  name: "Shubham",
  age: 20,
};

const address = {
  location: "Lucknow",
  state: "UP",
  piconde: 226016,
};

// Rest Operator
const { name, ...remaining } = person;
console.log(name, remaining);

// Spread Operator
let arr1 = [10, 20, 30];
let arr2 = [...arr1, 40, 50];

console.log(arr2);

person = { ...person, address };

console.log(person);
