'''
Created on 2025. 6. 20.

@author: user
'''

aa = [10, 20, 30]
print(len(aa), aa)

# aa[1:2] = [200, 201]
# print(len(aa), aa)

aa[1] = [20, 21]
print(len(aa), aa)
del(aa[1])
print(aa)