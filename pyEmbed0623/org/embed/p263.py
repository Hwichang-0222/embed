'''
Created on 2025. 6. 23.

@author: user
'''

def plus (n1, n2):
    res = n1 + n2
    return res

def minus (n1, n2):
    res = n1 - n2
    return res

def multi (n1, n2):
    res = n1 * n2
    return res

def div (n1, n2):
    if n2 == 0:
        print("can not divided 0")
        pass
    else :
        res = n1 / n2
        return res

if __name__ == '__main__':
    
    n1 = int(input("put num 1 : "))
    n2 = int(input("put num 2 : "))
    
    print(plus(n1, n2))
    print(minus(n1, n2))
    print(multi(n1, n2))
    print(div(n1, n2))
    