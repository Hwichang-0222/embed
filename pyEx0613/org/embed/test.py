import requests

url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst'
params ={'serviceKey' : 'TzrEgElfEdgapknosLF4VG9uixmVzQlM/kBL4BxLG72p9VMtoYYn60b9ZepYKzqzLSdKDr9Wlj97caEd3C3DXg==',
         'pageNo' : '1',
         'numOfRows' : '1000', 
         'dataType' : 'XML', 
         'base_date' : '20250729', 
         'base_time' : '0600', 'nx' : '55', 'ny' : '127' }

response = requests.get(url, params=params)
print(response.content)

