function newSubject() {
	let newItem = document.createElement("li");
	let subject = document.querySelector('#subject');
	let newText = document.createTextNode(subject.value);
	
	newItem.appendChild(newText);
	
	document.querySelector('#itemlist').appendChild(newItem)
	
	subject.value = "";
}

document.addEventListener("DOMContentLoaded",function() {
	let button = document.querySelector("button");
	button.addEventListener("click", function(event) {
		event.preventDefault();
		newSubject();
	});
});
