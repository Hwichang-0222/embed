'''
Created on 2025. 6. 18.

@author: user
'''

a = 20

if a > 50 :
    if a < 100 :
        print("50보다 크고 100보다 작군요.")
    else :
        print("와~~ 100보다 크군요.")
else :
    print("에고~ 50보다 작군요.")

#============================================
score = int(input("점수를 입력하세요 : "))

if score >= 90 :
    print("A")
else :
    if score >= 80 :
        print("B")
    else :
        if score >= 70 :
            print("C")
        else :
            if score >= 60 :
                print("D")
            else :
                print("F")

print("학점입니다. ^^")
