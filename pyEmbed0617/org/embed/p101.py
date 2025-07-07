'''
Created on 2025. 6. 17.

@author: user
'''

money, c500, c100, c50, c10 = [0] * 5

money = int(input("교환 금액 입력 : "))

c500 = money // 500
money %= 500

c100 = money // 100
money %= 100

c50 = money // 50
money %= 50

c10 = money // 10
money %= 10

print("\n500원 :", c500)
print("100원 :", c100)
print("50원 :", c50)
print("10원 :", c10)
print("나머지 잔돈 : %d원" %money)