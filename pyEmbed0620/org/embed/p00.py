'''
Created on 2025. 6. 20.

@author: user
'''

import random

numList = []
i, num = 0, 0

if __name__ == '__main__':
    
    for j in range(0, 100):
        numList = []
        while True:
            num = random.randrange(1,46)
            if numList.count(num) == 1 :
                continue
            else :
                numList.append(num)
            
            if len(numList) > 5:
                break
        
        numList.sort()
  
        print(numList)