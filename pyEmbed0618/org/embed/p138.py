'''
Created on 2025. 6. 18.

@author: user
'''

n1, n2, i, ans = [0] *4

n1 = int(input("put n1 : "))
n2 = int(input("put n2 : "))
i = int(input("put addnum : "))

if n1 > n2 :
    for j in range(n1, n2-1, -i):
        ans += j
        print(j, end=',')
    print("%d+...+%d is %d" %(n1, n2, ans))
else :
    for j in range(n1, n2+1, i):
        ans += j
        print(j, end=',')
    print("%d+...+%d is %d" %(n1, n2, ans))