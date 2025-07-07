'''
Created on 2025. 6. 19.

@author: user
'''

i, dan = 0, 0

dan = int(input("단을 입력하세요 :"))

for i in range(1,10):
    print("%d * %d = %d" %(dan, i, dan*i))