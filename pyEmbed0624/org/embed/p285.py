'''
Created on 2025. 6. 24.

@author: user
'''

def hap(n1, n2):
    res = n1 + n2
    return res

hap2 = lambda n1, n2 : n1 + n2

if __name__ == '__main__':
    print(hap(10, 20))
    print(hap2(20, 30))