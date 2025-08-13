/**
 * 
 */

let num = prompt("몇 까지의 3의 배수를 찾을까요?");
let str = "";
let j = 0;

for (let i = 3; i <= parseInt(num); i += 3){
	if (i % 3 == 0){
		str += i + ", ";
		j++;
	}
}

document.write(str);
document.write(`<p>${num}까지의 3의 배수의 갯수 : ${j} `);