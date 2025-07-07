'''
Created on 2025. 6. 19.

@author: user
'''

for i in range(0, 9) :
    if i < 5 :
        for k in range(0, 4-i):
            print(' ', end = '')
        for k in range(0, i*2+1) :
            print('\u2665',  end = '')
    else :
        for k in range(0, i-4) :
            print(' ', end = '')
        for k in range(0, (9-i)*2-1) :
            print('\u2665',  end = '')
    print()
    
