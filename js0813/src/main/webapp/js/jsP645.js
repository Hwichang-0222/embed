let cat = document.querySelector("#cat");

/*cat.onclick = () => cat.src = "images/kitty-2.png"*/

cat.onclick = changePic;
function changePic() {
	cat.src = "images/kitty-2.png"
}

let container = document.querySelector('.container');
container.onclick = (event)	=> {
	alert(`event happen: ${event.pageX}, ${event.pageY}`)
}
