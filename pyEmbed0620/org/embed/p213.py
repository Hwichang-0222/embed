'''
Created on 2025. 6. 20.

@author: user
'''

animals = {"닭":"병아리",
           "개":"강아지",
           "곰":"능소니",
           "고등어":"고도리",
           "명태":"노가리",
           "말":"망아지",
           "호랑이":"개호주"}
 
while (True) :
    myAnimal = input(str(list(animals.keys())) + " 중 새끼 이름을 알고 싶은 동물은?")
    if myAnimal in animals :
        print("<%s>의 새끼는 <%s>입니다." % (myAnimal, animals.get(myAnimal)))
    elif myAnimal == "끝" :
        break
    else :
        print("확인되지 않습니다.")
