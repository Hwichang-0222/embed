'''
Created on 2025. 6. 24.

@author: user
'''
'''
myList = [1, 2, 3, 4, 5]

def add10(n1):
    return n1+10

if __name__ == '__main__':
    for i in range(len(myList)):
        myList[i] = add10(myList[i])
    
    print(myList)
'''

myList = [1, 2, 3, 4, 5]

add10 = lambda num : num + 10

myList = list(map(add10, myList))
print(myList)