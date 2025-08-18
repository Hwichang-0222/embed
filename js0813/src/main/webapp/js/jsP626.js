function openCenter(doc, win, width, height) {
	let left = (screen.width - width) / 2;
	let top = (screen.height - height) / 2;
	let opt = `left=${left}, top=${top}, width=${width}, height=${height}`;
	window.open(doc, win, opt);
}
openCenter('htmlP624.html', 'ㅔㅐㅔ', 500, 400);
