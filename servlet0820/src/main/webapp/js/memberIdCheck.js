document.addEventListener("DOMContentLoaded", function () {
	const form = document.querySelector("form");
	const checkButton = document.getElementById("idChk");
	const userIdInput = document.getElementById("id");
	const idchkInput = document.getElementById("idchk");
	const pwd1 = document.getElementById("pwd1");
	const pwd2 = document.getElementById("pwd2");
	const msgDiv = document.getElementById("pwCheckMsg");

	// 아이디 중복검사
	checkButton.addEventListener("click", function () {
		const userId = userIdInput.value.trim();
		if (!userId) {
			alert("아이디를 입력해주세요.");
			return;
		}

		const xhr = new XMLHttpRequest();
		xhr.open("GET", "checkId.do?id=" + encodeURIComponent(userId), true);
		xhr.onreadystatechange = function () {
			if (xhr.readyState === 4 && xhr.status === 200) {
				const isDuplicate = xhr.responseText === "true";
				if (isDuplicate) {
					alert("이미 사용 중인 아이디입니다.");
					idchkInput.value = "N";
				} else {
					alert("사용 가능한 아이디입니다.");
					idchkInput.value = "Y";
				}
			}
		};
		xhr.send();
	});

	// 비밀번호 일치 확인
	function checkPasswordMatch() {
		const pw1Val = pwd1.value;
		const pw2Val = pwd2.value;

		if (!pw1Val || !pw2Val) {
			msgDiv.innerText = "";
			return false;
		}
		
		if (pw1Val === pw2Val) {
			msgDiv.innerText = "일치합니다.";
			msgDiv.style.color = "green";
			return true;
		} else {
			msgDiv.innerText = "일치하지 않습니다.";
			msgDiv.style.color = "red";
			return false;
		}
	}

	pwd1.addEventListener("input", checkPasswordMatch);
	pwd2.addEventListener("input", checkPasswordMatch);

	// 폼 제출 시 최종 체크
  	form.addEventListener("submit", function (e) {
		if (idchkInput.value !== "Y") {
			alert("아이디 중복검사를 먼저 해주세요.");
			e.preventDefault();
			return;
		}
	
		if (!checkPasswordMatch()) {
			alert("비밀번호가 서로 일치하지 않습니다. 다시 확인해주세요.");
			e.preventDefault();
		}
	});
});