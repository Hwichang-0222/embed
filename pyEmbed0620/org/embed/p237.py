'''
Created on 2025. 6. 20.

@author: user
'''

inStr = input("put any sentence : ")
outStr = ""

print(inStr[::-1])


inStr = list(inStr)
inStr.reverse()

outStr = str(inStr)

print(outStr, type(outStr), len(outStr))


'''
for i in range(0, len(inStr)):
    outStr += inStr[len(inStr)-1-i]
    
print(outStr)
'''