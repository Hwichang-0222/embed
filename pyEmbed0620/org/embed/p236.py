'''
Created on 2025. 6. 20.

@author: user
'''

ch1 = '파이썬은완전재미있어요'
ch2 = ''

for i in range(0,len(ch1)):
    if i % 2 == 0:
        ch2 += ch1[i]
    else :
        ch2 += '#'
        
print(ch2)