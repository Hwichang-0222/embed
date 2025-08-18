let numbers = ["one", "two", "three", "four"];
let chars = ['a', 'b', 'c'];
		
for (let i = 0; i < numbers.length; i++){
	document.write(`<p>${numbers[i]}</p>`);
}
	
document.write(`--------------합치고, 구분하기----------------`);
let numsChars = numbers.concat(chars);
document.write(`<p>numbers에 chars를 합치면 : ${numsChars}</p>`);
let string1 = numbers.join('#');
document.write(`<p># 구분자 지정 : ${string1}</p>`);

document.write(`--------------배열에 요소 추가하기----------------`);
let ret1 = numbers.push(4, 5);
document.write(`<p>length : ${ret1}  || Array : ${numbers}</p>`);
let ret2 = numbers.unshift(0);
document.write(`<p>length : ${ret2}  || Array : ${numbers}</p>`);

document.write(`--------------배열에서 요소 꺼내기----------------`);
let popped1 = chars.pop();
document.write(`<p>꺼낸요소 : ${popped1}  || Array : ${chars}</p>`);
let popped2 = chars.shift();
document.write(`<p>꺼낸요소 : ${popped2}  || Array : ${chars}</p>`);

document.write(`--------------splice()를 사용한 요소 추가 삭제----------------`);
let study = ["html", "CSS", "Javascript", "jquery", "react", "node.js"];
let js = study.splice(2);
document.write(`<p>Change : ${js}  || Orignal : ${study}</p>`);
let js1 = js.splice(1,1);
document.write(`<p>Change : ${js1}  || Orignal : ${js}</p>`);
let js2 = js.splice(1,0,'typescript');
document.write(`<p>Change : ${js2}  || Orignal : ${js}</p>`);

document.write(`--------------slice()를 사용한 요소 추가 삭제----------------`);
let color = ["red", "green", "blue", "white", "black"];
let sli = color.slice(2);
document.write(`<p>Change : ${sli}  || Orignal : ${color}</p>`);
let sli1 = color.slice(2, 4);
document.write(`<p>Change : ${sli1}  || Orignal : ${color}</p>`);