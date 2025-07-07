'''
Created on 2025. 6. 24.

@author: user
'''

#    1번    1,3

#    2번    매개변수, 반환값

#    3번

def plus(v1, v2, v3):
    rse = v1 + v2 + v3
    return rse
print(plus(100, 200, 300))

#    4번    100, 10

#    5번    1, 3

#    6번    3

#    7번    1, 3, 4

#    8번

def myFunc(p1 = 1, p2 = 2, p3 = 3):
    ret = p1 + p2 + p3
    return ret
print(myFunc())
print(myFunc(1))
print(myFunc(1, 2))
print(myFunc(1, 2, 3))

#    9번    2, 4, 5

#    10번
#    7번 라인에서 오류 func2 는 정의 안됨 함수 내의 함수

# 11번
def addNumber(num):
    if num <= 1:
        return num
    else :
        return num + addNumber(num-1)
print(addNumber(100))

#    12번
def base2(n):
    if n == 0 :
        return ""
    else :
        s = base2(n // 2)
        return str(s) + str(' ') + str(n % 2)
    
def base8(n):
    if n == 0 :
        return ""
    else :
        s = base8(n // 8)
        return str(s) + str(' ') + str(n % 8)
    
def base16(n):
    def alch(i):
        key = {10:'A', 11:'B', 12:'C', 13:'D', 14:'E', 15:'F'}
        if i < 10:
            return i
        else :
            return key.get(i)
    if n == 0 :
        return ""
    else :
        s = base16(n // 16)
        return str(s) + str(' ') + str(alch(n % 16))
    
n = int(input("10진수 입력 : "))

print(" 2진수 :",base2(n))
print(" 8진수 :",base8(n))
print("16진수 :",base16(n))

