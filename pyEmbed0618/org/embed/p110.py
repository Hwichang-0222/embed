'''
Created on 2025. 6. 18.

@author: user
'''

a = ord("A")
mask = 0x0f

print("%x & %x = %x" %(a, mask, a & mask))
print("%x | %x = %x" %(a, mask, a | mask))

mask = ord("a") - ord("A")

b = a ^ mask
print("%c ^ %d = %c" %(a, mask, b))
a = b ^ mask
print("%c ^ %d = %c" %(b, mask, a))

print(bin(ord("A")))
print(bin(ord("a")))


a = 5
print(a, ~a+1, a+(~a))