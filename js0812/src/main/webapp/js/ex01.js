/**
 * 
 */

document.getElementById('form').addEventListener('submit', function(event) {
	event.preventDefault();
	let id = document.getElementById('id').value;
	let pwd = document.getElementById('pwd').value;
	
	let formAction = this.action + "?id=" + encodeURIComponent(id) + "&pwd=" + encodeURIComponent(pwd);
	this.action = formAction;
	this.submit();
});
		
let form = document.querySelector("form");
console.log(form.elements[1].type);
console.log(form.elements[1].value);