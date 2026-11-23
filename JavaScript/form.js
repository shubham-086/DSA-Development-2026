let form = document.getElementById("form");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  let fname = document.getElementById("fname").value;
  let lname = document.getElementById("lname").value;
  let email = document.getElementById("email").value;
  let phone = document.getElementById("phone").value;
  let dob = document.getElementById("dob").value;
  let country = document.getElementById("country").value;

  let formData = new FormData(e.target);
  let gender = formData.get("gender");

  let data = {
    fname,
    lname,
    gender,
    email,
    phone,
    dob,
    country,
  };

  console.log(data);
});
