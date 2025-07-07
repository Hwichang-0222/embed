'''
Created on 2025. 6. 18.

@author: user
'''

sel, ans, numStr, n1, n2 = [0]*5

sel = int(input("1. calculate  2. sum between a to b : "))

if sel == 1:
    numStr = input("Put your expression : ")
    ans = eval(numStr)
    if ans == int(numStr):
        print("put expression not only number")
    else :
        print("%s of answer : %5.2f" %(numStr, ans))
        exit()
elif (sel == 2):
    n1 = int(input("put n1 : "))
    n2 = int(input("put n2 : "))
    if n1 > n2 :
        for i in range(n1, n2-1, -1):
            ans += i
        print("%d+...+%d is %d" %(n1, n2, ans))
    else :
        for i in range(n1, n2+1):
            ans += i
        print("%d+...+%d is %d" %(n1, n2, ans))
        
else:
    print("please put the number only 1 or 2")
    exit()

'''    
elif sel == 2:
    n1 = int(input("put n1 : "))
    n2 = int(input("put n2 : "))
    if n1 >= n2 :
        print("n1 has to bigger than n2")
        exit()
    else :
        for i in range(n1, n2+1):
            ans += i
        print("%d+...+%d is %d" %(n1, n2, ans))
'''