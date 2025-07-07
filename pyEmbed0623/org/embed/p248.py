'''
Created on 2025. 6. 23.

@author: user
'''
'''
#    1번    2,4,5
ss = 'IT_CookBook'
print(ss[1:2])

#    2번
ss = 'Python'
print(ss[0])        #P
print(ss[1:2])      #y
print(ss[-3:-1])    #ho
print(ss[3:])       #hon

#    3번
str1 = 'Hanbit'
str2 = 'Network'
print(str1 + str2)  #HanbitNetwork
print(2 * str1)     #HanbitHanbit
#print(str1 * str2)
#print(str1 / str2)
#print(str1 - str2)

#    4번
inStr = 'IT_CookBook_Python'
outStr = ''

for i in range(0, len(inStr)):
    if i % 2 == 0:
        outStr += inStr[-i-1]
    else :
        outStr += '#'
    
print(inStr)    
print(outStr)

#    5번
ss = 'Python'

for i in range(0, len(ss)):
    print(ss[i] + '$', end = "")

print()    
print('$'.join(ss))
    
#    6번    title, upper, swapcase, lower

#    7번
str1 = '코딩 중에서 파이썬 코딩이 가장 즐거운 코딩'
print(len(str1))
print(str1.count('코딩'))         # 3
print(str1.rfind('코딩'))         # 22
print(str1.startswith('코딩'))    # True
print(str1.find('파이썬'))         # 7

#    8번    2
ss = "Python 파이썬"

print(ss.replace('파이썬', 'Python'))

#    9번
inStr, outStr = "Python", ""

for i in range(0, len(inStr)):
    outStr += inStr[-i-1]
print(outStr)

#    10번    1
ss = 'IT_CookBook'

print('#'.join(ss))

#    11번
inStr = input("put any sentence : ")
outStr = ''

for ch in inStr:
    if ch.isalpha():
        outStr += ch
        
print('clear :',outStr) 
'''
#    12번
inStr = input("put any sentence : ")
numStr, upperStr, lowerStr, korStr, etcStr = [''] * 5

for ch in inStr:
    if ch.isupper():
        upperStr += ch
        
    elif ch.islower():
        lowerStr += ch
        
    elif ch.isdigit():
        numStr += ch
        
    #elif ch.isalpha(): 
    elif ('가' <= ch <= '힣') or ('ㄱ' <= ch <= 'ㅣ') :
        korStr += ch
        
    else :
        etcStr += ch
        
print('upper :', upperStr)
print('lower :', lowerStr)
print('num :', numStr)
print('kor :', korStr)
print('etc :', etcStr) 

