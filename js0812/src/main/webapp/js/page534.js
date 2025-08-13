/**
 * 
 */

let session = prompt("관심 세션을 선택해 주세요(1-마케팅, 2-개발 3-디자인) : ");

switch(session){
	case "1":
		document.getElementById("place").innerHTML = "201호";
		break;
	case "2":
		document.getElementById("place").innerHTML = "203호";
		break;
	case "3":
		document.getElementById("place").innerHTML = "205호";
		break;
	default:
		alert("잘못 입력했습니다.");
}