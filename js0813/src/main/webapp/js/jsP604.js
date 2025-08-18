let now = new Date();
//document.write(`현재 시각 : ${now}`);
let firstDay = new Date("2025-01-01");
//document.write(`시각 : ${firstDay}`);

let toNow = now.getTime();
let toFirst = firstDay.getTime();
let passedTime = toNow - toFirst;

passedTime = Math.round(passedTime/(1000*60*60*24));

//document.getElementById('accent').innerHTML = passedTime;
document.querySelector('#accent').innerText = passedTime;

window.open("htmlP594.html", "", "width=500, height=400");