'''
Created on 2025. 6. 19.

@author: user
'''
# 1번
for k in range(0, 10, 1): #시작, 끝 + 1, 증가
    pass

# 2번
#    4

# 3번
#    4

# 4번
#    2

# 5번
dan = 15
for i in range(9, 0, -1) :
    print("%d x %d = %3d" %(dan, i, dan*i))
    
# 6번
#    24

# 7번
#    3

# 8번
hap = 0
n = 1234

while n <= 4567 :
    if n % 444 == 0 :
        hap += n
    n += 1
        
print(hap)

# 9번

hap1 = 0

for i in range (3333,10000):
    if hap1 >= 100000 :
        break
    else :    
        if i % 1234 != 0:
            hap1 += i
        else :
            continue

print(hap1 - i)

# 10번

numStr = input("put any numbers : ")

i = 0

while True:
        
    num = int(numStr[i]) * 2
    
    for j in range(0, num):
        print("\u2605", end = "")
    print()
    
    i += 1
    
    if i >= len(numStr) :
        break
    
# 11번


for j in range (3, 100):
    #ans = True
    for i in range (2, j-1):
        if j % i == 0:
            break
    if j % i != 0 :
        print(j, end =" ")

# 12번