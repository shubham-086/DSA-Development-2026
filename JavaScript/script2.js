// let str = "Hello";

// console.log(str.trim());
// console.log(str.toUpperCase());
// console.log(str.toLowerCase());
// console.log(str.slice(1, 4));
// console.log(str.slice(1, 4).repeat(2));
// console.log(str.repeat(2));
// console.log(str.replace("l", "ab"));
// console.log(str.replaceAll("l", "ab"));
// console.log(str.endsWith("lo"));
// console.log(str.includes("ll"));
// console.log(str.padStart(10, "xl"));

let arr = [10, 20, "Hello", [30, 40], false, { a: 10, b: 20 }];
// console.log(arr);

let nums = [];

nums.push(10);
nums.push(20);
nums.push(30);
nums.push(40);
// nums.pop();
nums.unshift(5);
// nums.shift();
// nums.splice(2, 1, 60);
// nums.splice(2, 0, 60, 65, 80);
// [indexOf, includes, concat, reverse, slice, splice, sort];

// for (let i = 0; i < nums.length; i++) {
//   console.log(nums[i]);
// }

// for (let n of nums) {
//   console.log(n);
// }

let persons = [
  {
    name: "Shubham",
    gender: "Male",
    age: 25,
    phone: 7894651320,
    hobbies: ["Cricket", "Video Game", "Gym"],
    address: {
      area: "Indira Nagar, sector 18",
      houseNo: 187,
      city: "Lucknow",
      picode: 226016,
    },
  },
  {
    name: "Vishal",
    gender: "Male",
    age: 25,
    phone: 7894651320,
    hobbies: ["Cricket", "Video Game", "Gym"],
    address: {
      area: "Indira Nagar, sector 18",
      houseNo: 187,
      city: "Lucknow",
      picode: 226016,
    },
  },
  {
    name: "Aditya",
    gender: "Male",
    age: 25,
    phone: 7894651320,
    hobbies: ["Cricket", "Video Game", "Gym"],
    address: {
      area: "Indira Nagar, sector 18",
      houseNo: 187,
      city: "Lucknow",
      picode: 226016,
    },
  },
];

// console.log(person.address.city);
// console.log(person["gender"]);
// console.log(persons[1].name);

// console.log(Math.PI);
// console.log(Math.floor(Math.PI));
// console.log(Math.ceil(Math.PI));
// console.log(Math.floor(Math.random() * 100) + 1);

function greet() {
  console.log("Hello & Welcome!");
  return "Hi";
}

// let msg = greet();
// console.log(greet());

function sum(a, b, ...c) {
  let sum = 0;
  for (let n of c) {
    sum += n;
  }
  return a + b + sum;
}

console.log(sum(10, 20, 30, 5));
