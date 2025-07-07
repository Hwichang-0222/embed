'''
Created on 2025. 6. 16.

@author: user
'''

vasue = 100

def testFuntion1():
    #global vasue #global 속성은 전역변수 선언시 값을 대입할수 없고 선언만 가능하다.
    vasue =+ 110
    return vasue

def testFuntion2():
    vasue =+ 120
    return vasue

    
print(testFuntion1())

print(vasue)

print(testFuntion2())

