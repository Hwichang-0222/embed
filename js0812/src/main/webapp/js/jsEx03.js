/**
 * 
 */

document.getElementById('form').addEventListener('submit', function(event) {
	event.preventDefault();
	let id = document.getElementById('id').value;
	let pwd1 = document.getElementById('pwd1').value;
	let pwd2 = document.getElementById('pwd2').value;
	let name = document.getElementById('name').value;
	let phone = document.getElementById('phone').value;
	let mail = document.getElementById('mail').value;
	let birthday = document.getElementById('birthday').value;
	let site = document.getElementById('site').value;
	
	let genderInput = document.querySelector('input[name="gender"]:checked');
	let gender = genderInput ? genderInput.value : '';

	    
    let params = new URLSearchParams({
        id, pwd1, pwd2, name, phone, mail, birthday, site, gender
    });
	
	let formAction = this.action + "?" + params.toString();
	this.action = formAction;
	this.submit();
});
		
let form = document.querySelector("form");
console.log(form.elements[1].type);
console.log(form.elements[1].value);