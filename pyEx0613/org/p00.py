'''
Created on 2025. 6. 25.

@author: user
'''
'''
money, c500, c100, c50, c10 = [0] *5

c500 = int(input("500원 갯수 : "))
c100 = int(input("100원 갯수 : "))
c50 = int(input("50원 갯수 : "))
c10 = int(input("10원 갯수 : "))

money = 500*c500 + 100*c100 + 50*c50 + 10*c10

print("총 금액 : %d원" %money)
'''
import random

numbers1 = []
numbers2 = []

for num in range(0,2):
    numbers1.append(random.randrange(1,7))
    numbers2.append(random.randrange(1,7))
    
print("number of A", numbers1)
print("number of B", numbers2)

res1, res2 = 0, 0
res1 = numbers1[0] + numbers1[1]
res2 = numbers2[0] + numbers2[1]

if res1 > res2 :
    print("A win")
elif res1 < res2 :
    print("B win")
else:
    print("Draw")