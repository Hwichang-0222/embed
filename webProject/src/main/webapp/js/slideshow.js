/**
 * 
 */

let slides = document.querySelectorAll("#slide > img");
let prev = document.querySelector("#prev");
let next = document.querySelector("#next");

let current = 0;

showSlides(current);
prev.onclick = prevSlide;
next.onclick = nextSlide;

function showSlides(n) {
	for (let i = 0; i < slides.length; i++) {
		slides[i].style.display = "none";
	}
	slides[n].style.display = "block";	
}

function prevSlide() {
	if (current > 0 ){ current -= 1;}
	else { current = slides.length - 1;}
	showSlides(current);
}

function nextSlide() {
	if (current < slides.length - 1 ){ current += 1;}
	else { current = 0;}
	showSlides(current);
}