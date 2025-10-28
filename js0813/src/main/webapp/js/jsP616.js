
function openPopup() {
	let newWin = window.open("htmlP604.html", 'pop', 'width=500, height=400');
	if(newWin == null){
		alert("팝업이 차단되어 있습니다. 팝업차단을 해제하여 주세요.")
	}
}