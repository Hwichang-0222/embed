'''
Created on 2025. 6. 23.

@author: user
'''

def calc (v1, v2, op):
    
    res = 0
    
    if op == '+':
        res = v1 + v2
    
    elif op == '-':
        res = v1 - v2
    
    elif op == '*':
        res = v1 * v2
    
    elif op == '/':
        res = v1 / v2
        
    elif op == '**':
        res = v1 ** v2
        
    elif op == '%':
        res = v1 % v2
        
    elif op == '//':
        res = v1 // v2
          
    return res

n1, n2, op = 0, 0, ''

if __name__ == '__main__':
    
    while True:
        print()
        print("if you want to shutdown the program press '#'")
        
        n1 = input("put first number : ")
        if n1 == '#':
            print("shutdown")
            break
        
        n1 = int(n1)
        
        op = input("choose the signal (+, -, *, /, **, %, //) : ")
        if op not in ['+', '-', '*', '/', '**', '%', '//']:
            print("--error!!--")
            continue
        
        n2 = int(input("put second number : "))
        if op in ['/', '%', '//'] and n2 == 0:
            print("--error!!--")
            continue
            
        print("##calc## %d %s %d = %.2f" %(n1, op, n2, calc(n1, n2, op)))
    
    exit() 