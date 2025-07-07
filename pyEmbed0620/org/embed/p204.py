'''
Created on 2025. 6. 20.

@author: user
'''

'''
tt1 = (10, 20, 30)
tt2 = list(tt1)
tt3 = tuple(tt2)

print(tt1, type(tt1))
print(tt2, type(tt2))
print(tt3, type(tt3))


tt = (10)
print(tt, type(tt))

tt1 = 10,
print(tt1, type(tt1))
'''

tt = ((1, 2, 3),
      (4, 5, 6),
      (7, 8, 9))

for i in range (0, 3):
    for j in range (0, 3):
        print(tt[i][j], end = " ")
    print()