'''
Created on 2025. 6. 20.

@author: user
'''

# 1번
#    2

# 2번
#    nn.append(num)
#    nn[i]
import random

nn = []

for _ in range(10):
    num = random.randrange(1,100)
    nn.append(num)
print(nn)    
hap = 0
for i in range(10):
    num = nn[i]
    hap += num
print(hap)
print()

# 3번
#    1,2,3,4

# 4번
ary1 = [1, 2, 3, 4]
ary2 = []
for i in range(3, -1, -1): #    2. 3, -1, -1
    ary2.append(ary1[i])
print(ary1)
print(ary2)
print()

# 5번
nn = [100, 200, 300, 400, 500]

print(nn[4])        #    1. 500
print(nn[-1])       #    2. 500
print(nn[-2])       #    3. 400
print(nn[1:4])      #    4. [200, 300, 400]
print(nn[0:1])      #    5. [100]
print(nn[2:-1])     #    6. [300, 400]
print(nn[0::2])     #    7. [100, 300, 500]
print(nn[::-1])     #    8. [500, 400, 300, 200, 100]
print(nn[::-2])     #    9. [500, 300, 100]
print()

# 6번
nn = [100, 200, 300, 400, 500]
nn[1] = 777
print(nn)           #    1. [100, 777, 300, 400, 500]

nn = [100, 200, 300, 400, 500]
nn[1] = [444, 555]
print(nn)           #    2. [100, [444, 555], 300, 400, 500]

nn = [100, 200, 300, 400, 500]
nn[1:4] = [444, 555]
print(nn)           #    3. [100, 444, 555, 500]

nn = [100, 200, 300, 400, 500]
nn[2:] = []
print(nn)           #    4. [100, 777]
print()

# 7번
#    1. len()
#    2. extend()
#    3. pop()
#    4. index()
#    5. count()

# 8번
#    2

# 9번
myList = [[1, 2, 3, 4],
          [5, 6, 7, 8],
          [9, 10, 11, 12]]

print(myList[0][1]) #    1. 2
print(myList[1][3]) #    2. 8
print(myList[2])    #    3. [9, 10, 11, 12]
print()

# 10번
#    4, 5

# 11번
#    3, 5

# 12번
#    1. a = [] list
#    2. b = () tuple
#    3. c = {} dic
#    4. d = none common

# 13번
#    1, 4, 5

# 14번

myData = [[n*m for n in range(1,3)] for m in range(2,4)]

print(myData)


