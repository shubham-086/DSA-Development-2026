let changeTextBtn = document.getElementById("changeTextBtn");

changeTextBtn.onclick = function () {
  console.log("Function 1");
};

changeTextBtn.onclick = function () {
  console.log("Function 2");
};

changeTextBtn.addEventListener("click", function () {
  console.log("Function 1: Inside Event Listener");
});
changeTextBtn.addEventListener("click", function () {
  console.log("Function 2: Inside Event Listener");
});

document.addEventListener("keypress", (e) => {
  console.log("key Pressed!", e);
  if (e.code === "Space") {
    let h1 = document.querySelector("h1");
    if (e.shiftKey === true) {
      h1.classList.add("double-jump");
    } else {
      h1.classList.add("jump");
    }

    setTimeout(() => {
      h1.classList.remove("jump");
      h1.classList.remove("double-jump");
    }, 500);
  }
});
