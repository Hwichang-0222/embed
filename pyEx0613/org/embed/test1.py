import requests
from urllib.parse import unquote
from datetime import datetime, timedelta

# 1. API 기본 정보
url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst'
service_key = unquote('TzrEgElfEdgapknosLF4VG9uixmVzQlM/kBL4BxLG72p9VMtoYYn60b9ZepYKzqzLSdKDr9Wlj97caEd3C3DXg==')  # 반드시 디코딩된 키 사용

# 2. 날짜 및 시간 설정 (예보 기준: 1시간 전)
now = datetime.now()
base_date = now.strftime('%Y%m%d')
base_time = (now - timedelta(hours=1)).strftime('%H00')

# 3. 예보 지점 설정 (예: 부산 해운대구 인근)
nx = 59
ny = 127

# 4. 요청 파라미터
params = {
    'serviceKey': service_key,
    'pageNo': '1',
    'numOfRows': '1000',
    'dataType': 'JSON',
    'base_date': base_date,
    'base_time': base_time,
    'nx': str(nx),
    'ny': str(ny)
}

# 5. API 호출
response = requests.get(url, params=params)
items = response.json().get('response', {}).get('body', {}).get('items', {}).get('item', [])

# 6. 항목 추출
temperature = next((item for item in items if item['category'] == 'T1H'), None)
humidity = next((item for item in items if item['category'] == 'REH'), None)
sky = next((item for item in items if item['category'] == 'SKY'), None)
pty = next((item for item in items if item['category'] == 'PTY'), None)

# 7. 날씨 해석
print("🌤️ [기상청 초단기예보 리포트]")
print(f"📅 날짜: {base_date}")
print(f"🕒 기준 시각: {base_time}")
print(f"📍 위치: nx={nx}, ny={ny}")

# 기온
if temperature:
    print(f"🌡️ 기온: {temperature['fcstValue']}℃")

# 습도
if humidity:
    reh = int(humidity['fcstValue'])
    print(f"💧 습도: {reh}%")
    if reh < 30:
        print("🌵 매우 건조한 날씨입니다.")
    elif reh < 60:
        print("🙂 쾌적한 날씨입니다.")
    elif reh < 80:
        print("🌫️ 약간 습한 날씨입니다.")
    else:
        print("💦 매우 습한 날씨입니다.")

# 하늘 상태
if pty and pty['fcstValue'] != '0':
    print("🌧️ 비 또는 눈이 오는 중입니다.")
elif sky:
    sky_code = sky['fcstValue']
    if sky_code == '1':
        print("☀️ 맑은 날씨입니다.")
    elif sky_code == '3':
        print("⛅ 구름이 많은 날씨입니다.")
    elif sky_code == '4':
        print("☁️ 흐린 날씨입니다.")
    else:
        print("🌥️ 하늘 상태를 알 수 없습니다.")
else:
    print("🌥️ 하늘 상태 정보를 찾을 수 없습니다.")