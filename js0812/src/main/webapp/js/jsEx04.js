/**
 * 
 */

let urlParams = new URLSearchParams(window.location.search);
let id = urlParams.get('id');
let pwd1 = urlParams.get('pwd1');
let pwd2= urlParams.get('pwd2');
let name = urlParams.get('name');
let phone = urlParams.get('phone');
let mail = urlParams.get('mail');
let birthday = urlParams.get('birthday');
let site = urlParams.get('site');
let gneder = urlParams.get('gender');

	
console.log("ID : " + id);
console.log("PW1 : " + pwd1);
console.log("PW2 : " + pwd2);
console.log("Name : " + name);
console.log("Phone : " + phone);
console.log("Email : " + mail);
console.log("Brith : " + birthday);
console.log("Web : " + site);
console.log("Gender : " + gneder);
	
document.getElementById('id').innerHTML = "ID : " + id;
document.getElementById('pwd1').innerHTML = "PW1 : " + pwd1;
document.getElementById('pwd2').innerHTML = "PW2 : " + pwd2;
document.getElementById('name').innerHTML = "Name : " + name;
document.getElementById('phone').innerHTML = "Phone : " + phone;
document.getElementById('mail').innerHTML = "Email : " + mail;
document.getElementById('birthday').innerHTML = "Birth : " + birthday;
document.getElementById('site').innerHTML = "Web : " + site;
document.getElementById('gender').innerHTML = "Gender : " + gneder;
