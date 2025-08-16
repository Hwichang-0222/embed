let is24HourFormat = true;
let currentThemeName = 'theme-blue';

const themeInfo = {
	'theme-blue': { name: '🔵 파랑 테마', btnId: 'blue-btn' },
	'theme-pink': { name: '🌸 핑크 테마', btnId: 'pink-btn' },
	'theme-green': { name: '🌿 그린 테마', btnId: 'green-btn' },
	'theme-dark': { name: '⚫ 다크 테마', btnId: 'dark-btn' },
	'theme-sunset': { name: '🌅 선셋 테마', btnId: 'sunset-btn' }
};
        
function updateTime() {
	const now = new Date();
	            
	// 시간 포맷
	let hours = now.getHours();
	let minutes = now.getMinutes();
	let seconds = now.getSeconds();
	let ampm = '';
	            
	if (!is24HourFormat) {
		ampm = hours >= 12 ? ' PM' : ' AM';
		hours = hours % 12;
		hours = hours ? hours : 12; // 0시는 12시로 표시
	}
	            
	// 앞에 0 붙이기
	hours = hours.toString().padStart(2, '0');
	minutes = minutes.toString().padStart(2, '0');
	seconds = seconds.toString().padStart(2, '0');
	            
	// 깜빡이는 콜론 효과
	const colon = seconds % 2 === 0 ? ':' : ' ';
	
	const timeString = `${hours}${colon}${minutes}${colon}${seconds}${ampm}`;
	document.getElementById('timeDisplay').textContent = timeString;
	
	// 날짜 포맷
	const year = now.getFullYear();
	const month = now.getMonth() + 1;
	const date = now.getDate();
	const dayNames = ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'];
	const dayName = dayNames[now.getDay()];
	
	const dateString = `${year}년 ${month}월 ${date}일 ${dayName}`;
	document.getElementById('dateDisplay').textContent = dateString;
	}
	        
function setTimeFormat(is24Hour) {
	is24HourFormat = is24Hour;
	
	// 버튼 활성화 상태 변경
	document.getElementById('format24').classList.toggle('active', is24Hour);
	document.getElementById('format12').classList.toggle('active', !is24Hour);
	
	// 정보 텍스트 변경
	document.getElementById('formatInfo').textContent = 
	is24Hour ? '24시간 형식' : '12시간 형식 (AM/PM)';
}

function changeTheme(themeName) {
	// 이전 테마 버튼의 활성화 상태 제거
	if (themeInfo[currentThemeName]) {
		document.getElementById(themeInfo[currentThemeName].btnId).classList.remove('active');
	}
	
	// 모든 테마 클래스 제거
	document.body.className = '';
	// 새 테마 적용
	document.body.classList.add(themeName);
	
	// 현재 테마 업데이트
	currentThemeName = themeName;
	
	// 새 테마 버튼 활성화
	document.getElementById(themeInfo[themeName].btnId).classList.add('active');
	
	// 테마 상태 표시 업데이트
	document.getElementById('currentTheme').textContent = themeInfo[themeName].name;
}

// 1초마다 시간 업데이트
setInterval(updateTime, 1000);

// 페이지 로드 시 즉시 시간 표시
updateTime();

// 페이지 포커스 시 시간 동기화 (다른 탭에 있다가 돌아왔을 때)
window.addEventListener('focus', updateTime);