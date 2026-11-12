// console.log("Start");
// setTimeout(() => {
//   console.log("Processing...");
// }, 2000);
// console.log("End");

async function greet() {
  setTimeout(() => console.log("Hello"), 2000);
}

// greet();
// greet();
// greet();

// console.log(greet());
// greet()
//   .then((result) => console.log(result))
//   .then((result) => console.log(result))
//   .then((result) => console.log(result));

async function first() {
  return new Promise((resolve) =>
    setTimeout(() => {
      console.log("First function");
      resolve();
    }, 2000),
  );
}
async function second() {
  return new Promise((resolve) =>
    setTimeout(() => {
      console.log("Second function");
      resolve();
    }, 2000),
  );
}
async function third() {
  return new Promise((resolve) =>
    setTimeout(() => {
      console.log("Third function");
      resolve();
    }, 2000),
  );
}

async function showData() {
  await first();
  await second();
  await third();
}

showData();

// fetch("https://fake-json-api.mock.beeceptor.com/users")
//   .then((data) => data.json())
//   .then((data) => console.log(data));

async function getData() {
  let response = await fetch("https://fake-json-api.mock.beeceptor.com/users");
  console.log(await response.json());
}

getData();
