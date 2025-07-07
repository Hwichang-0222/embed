'''
Created on 2025. 6. 19.

@author: user
'''

hap, a, b = [0] * 3

print("if you want to close press 0")
'''
while True:
    a = int(input("put number A : "))

    if a == 0:
        break
    
    b = int(input("put number B : "))
    
    hap = a + b
    print("%d + %d = %d" %(a, b, hap))
    
print("Shutdown program")
'''
a = input("put number A : ")
b = input("put number B : ")

while True:
    if a == "$" or b == "$":
        break
    
    hap = int(a) + int(b)
    print("%s + %s = %d" %(a, b, hap))
    
print("Shutdown program")