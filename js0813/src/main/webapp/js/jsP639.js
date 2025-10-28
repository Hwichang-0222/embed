let heading = document.querySelector("#heading");
let cup = document.querySelector("#cup");

heading.onclick = () => heading.innerText = "추천! 오늘의 커피"
cup.onclick = () => cup.src = "images/coffee-blue.jpg"

let small = document.querySelectorAll('.small');

small[0].onclick = () => cup.src = "images/coffee-pink.jpg";
small[1].onclick = () => cup.src = "images/coffee-blue.jpg";
small[2].onclick = () => cup.src = "images/coffee-gray.jpg";

let view = document.querySelector("#view");
let detail = document.querySelector("#detail");

view.onclick = () => document.getElementById("detail").style.display = "block";