'''
Created on 2025. 6. 20.

@author: user
'''

import random
'''
list1 = []
value = 0

for i in range(0, 4) :
    new_row = []
    for k in range(0, 5) :
        new_row.append(value)
        value += 3
    list1.append(new_row)
    print(new_row)

for i in range(0, 4) :
    for k in range(0, 5) :
        print("%3d" % list1[i][k], end = " ")
    print("")
    
for r in range(len(list1)) :
    print(list1[r])
'''


list2 = []
val = 0

for i in range(0, random.randrange(2,7)) :
    new_row = []
    for k in range(0, random.randrange(1,8)) :
        new_row.append(val)
        val = random.randrange(0,100)
        new_row.sort()
    list2.append(new_row)
    print(new_row)
    
for i in range(len(list2)):
    for j in range(len(list2[i])):
        print("%3d" % list2[i][j], end = " ")
    print("")
        