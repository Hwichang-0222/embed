'''
Created on 2025. 6. 17.

@author: user
'''

num=2**3
print("num(제곱)=", num)

binary1=0b1111
octet1=0o7
hex1=0xff
print("2진수=", binary1, ", 8진수=", octet1, ", 16진수=", hex1)

a=3.14
b=3.14e5
print("실수(a)=", a, "실수(b)=", b)

a, b = 9, 2

print("a=", a, "b=", b)

# **(제곱), %(나머지), //(나눈후 몫의 값에 소수점을 버린다.)
print("a/b=", int(a/b))
print("a**b=", a**b)
print("a%b=", a%b)
print("a//b=", a//b)


#문자열 처리
print("python 'study'!!")

print("python 'stu\"dy'!!")

a="""
hello
wo
r  l
d
""" #코드 영역에 쓰는대로 출력된다.
print("a=", a)