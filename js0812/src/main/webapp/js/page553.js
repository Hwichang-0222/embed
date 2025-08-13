/**
 * 
 */

let num = prompt("숫자를 입력하세요");

if(num !== null){
	if (num % 4 == 0){
		document.write(`${num}은 4의 배수입니다.`)
	} else {
		document.write(`${num}은 4의 배수가 아닙니다.`)
	}
}