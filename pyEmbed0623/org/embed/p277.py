'''
Created on 2025. 6. 23.

@author: user
'''

import random

def getnum():
    return random.randrange(1, 46)

lotto = []
num = 0
count = 0

if __name__ == '__main__':
    
    for i in range (5):
        lotto = []
        count = 0
        while True:
            count += 1
            num = getnum()
            
            if num not in lotto:
                lotto.append(num)
            
            if len(lotto) >= 6 :
                break
            
            
        lotto.sort()
        print(lotto, count)
        #[print(n, end = ' ') for n in lotto]