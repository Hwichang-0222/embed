'''
Created on 2025. 6. 19.

@author: user
'''

aa = []
bb = []
val = 0

for i in range(0, 200):
    aa.append(val)
    val += 3
    
print(aa)

for i in range(199, -1, -1):
    bb.append(aa[i])
    
print(bb)