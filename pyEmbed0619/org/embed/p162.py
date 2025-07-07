'''
Created on 2025. 6. 19.

@author: user
'''

i, j, line = 0, 0, ""

for i in range(2, 10):
    line = line + ("#   %d    # " %i)

print(line)

for i in range(1, 10):
    #line = ""
    
    for j in range(2, 10):
        #line = line + ("%d x %d = %2d " %(j, i, j*i))
        print("%d x %d = %2d " %(j, i, j*i), end = "")
    print("")    
    #print(line)