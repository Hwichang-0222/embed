setInterval(displayNow, 1000);

function displayNow() {
	let now = new Date();
	let currentTime = now.toLocaleTimeString();
	document.querySelector("#current").innerHTML = currentTime;	
}
