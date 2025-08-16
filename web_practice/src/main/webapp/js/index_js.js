(function(){
	// 이메일 CTA
	const email = document.getElementById('email');
	const cta = document.getElementById('cta');
	if (email && cta) {
		cta.addEventListener('click', () => {
			if (!email.value || !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email.value)) {
				alert('올바른 이메일을 입력해 주세요.');
				email.focus();
				return;
			}
		alert('가입 절차 예시: 입력하신 주소로 안내 메일을 보냅니다.');
		});
	}

	// 키보드로 가로 스크롤
	document.querySelectorAll('.rail').forEach(rail => {
		rail.addEventListener('keydown', (e) => {
			if (e.key === 'ArrowRight') rail.scrollBy({left: 280, behavior:'smooth'});
			if (e.key === 'ArrowLeft') rail.scrollBy({left: -280, behavior:'smooth'});
		});
		rail.tabIndex = 0; // 포커스 가능
	});
})();