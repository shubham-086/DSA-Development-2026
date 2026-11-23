// document.children[0].children[1].children[0].innerHTML = "Hello Vinay";
// document.children[0].children[1].children[0];

// document.getElementById("title").innerHTML = "Hello Aditya";
// id

// console.log(document.getElementsByClassName("heading").innerHTML);
// class

// console.log(document.getElementsByTagName("h1"));
// tag

// console.log(document.querySelector("#title"));
// console.log(document.querySelectorAll(".heading"));
// console.log(document.querySelectorAll("h1"));
// universal

// innerHTML
// innerText
// textContent

let p = document.getElementById("message");
// console.log(p.innerText);
// console.log(p.innerHTML);

let box = document.getElementById("myBox");
// console.log(box.innerHTML);
// console.log(box.innerText);
// console.log(box.textContent);

// p.innerText = "We are learning JS DOM";
// p.innerHTML = "We are learning <b>JS DOM</b>";
// p.textContent = "We are learning JS DOM";

// console.log(box.classList);
let item = box.classList.item(6);
box.classList.remove(item);
box.classList.add("shadow");
// console.log(box.classList);

// function changeText() {
//   p.innerText = "External JavaScript: Amigo India";
// }
// let changeTextBtn = document.getElementById("changeTextBtn");
// changeTextBtn.onclick = function () {
//   let p = document.getElementById("message");
//   p.innerText = "External JavaScript: Welcome to Amigo India";
// };

function changeColor() {
  let h2 = document.getElementById("heading");
  //   h2.style.color = "red";
  h2.classList.add("text-red");
}

function toggleClass() {
  box.classList.toggle("highlight");
}

function showName() {
  let input = document.getElementById("username");
  let output = document.getElementById("output");
  output.innerText = input.value;
}

function addTask() {
  // select input
  let taskInput = document.getElementById("taskInput");
  // select list
  let taskList = document.getElementById("taskList");

  // create list item
  let li = document.createElement("li");
  // update item text
  li.innerText = taskInput.value;
  li.style.listStyle = "none";
  li.style.textAlign = "left";

  // insert item inside list
  taskList.append(li);

  // Clear input
  taskInput.value = "";
}

// append, appendChild, prepend, before, after, insertBefore
let myBox = document.getElementById("myBox");

function createNode() {
  let h2 = document.createElement("h2");
  h2.innerText = "New Element";

  // myBox.append(h2);
  // myBox.prepend(h2);
  // myBox.before(h2);
  myBox.after(h2);
}

createNode();

let input = document.getElementById("username");
let val = input.getAttribute("placeholder");
console.log(val);
input.setAttribute("placeholder", "Enter username");

// Inline JS < Internal JS < External JS

// myBox.onmouseover = () => {
//   myBox.style.backgroundColor = "green";
// };
