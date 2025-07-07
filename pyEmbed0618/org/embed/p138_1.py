'''
Created on 2025. 6. 18.

@author: user

n1 = 0
ans = True

n1 = int(input("put num : "))

for i in range (2, n1):
    if n1 % i == 0:
        ans = False

if ans == True :
    print("소수")
else:
    print("소수아님")

nums = range(1,100)
print(nums)
'''

n2 = int(input("n까지 소수 구하기 : "))


for j in range (2, n2):
    ans = True
    for i in range (2, j-1):
        if j % i == 0:
            ans = False
    if ans == True :
        print(j, end =",")