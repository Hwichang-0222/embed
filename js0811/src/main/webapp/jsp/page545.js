/**
 * 
 */

for (let i = 2; i <= 9; i++){
	document.write(`<div class = "times">`);
	document.write(`<h2>${i}단 </h2>`);
	for(let j = 1; j <= 9; j++){
		document.write(`${i} X ${j} = ${i * j}<br>`);
	}
}
		