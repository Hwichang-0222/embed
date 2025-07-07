'''
Created on 2025. 6. 24.

@author: user
'''
'''
def fact(n):
    if n <= 1:
        return n
    else:
        return n * fact(n-1)

if __name__ == '__main__':
    
    print(fact(4))
    print(fact(10))
'''

def genFunc():
    yield 1
    yield 2
    yield 3
    
print(list(genFunc()))