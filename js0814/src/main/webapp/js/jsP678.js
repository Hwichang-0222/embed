function drawTable() {
	let rCount = document.querySelector('#rCount').value;
	let cCount = document.querySelector('#cCount').value;
	
	let table = document.createElement("table");
	
	for (let i = 0; i < rCount; i++){
		let tr = document.createElement("tr");
		for (let j = 0; j < cCount; j++){
			let text = document.createTextNode(i + ", " + j);
			let td = document.createElement("td");
			td.appendChild(text);
			tr.appendChild(td);
		}
		table.appendChild(tr);
	}
	
	let contents = document.querySelector('#contents')
	contents.appendChild(table);
	
}