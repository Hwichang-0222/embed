'''
Created on 2025. 6. 23.

@author: user
'''

ss = '###  Python is easy    ###'

if __name__ == '__main__':
    print(ss.upper())   #대문자
    print(ss.lower())   #소문자
    print(ss.swapcase())#스왑
    print(ss.title())   #첫글자 대문자
    print(ss.strip("#"))#공백제거
    print(ss.lstrip("#"))#왼쪽 공백제거
    print(ss.rstrip("#"))#오른쪽 공백제거