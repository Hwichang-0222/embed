'''
Created on 2025. 6. 18.

@author: user
'''
import random

# 6번
numbers = []

for num in range(0,20):
    numbers.append(random.randrange(1,21))
    
print(numbers)
    
for num in range(1,21):
    if num in numbers :
        print("%d is in numbers" %num)
        
        
# 7번
numbers1 = []
numbers2 = []

for num in range(0,2):
    numbers1.append(random.randrange(1,7))
    numbers2.append(random.randrange(1,7))
    
print("number of A", numbers1)
print("number of B", numbers2)

res1, res2 = 0, 0
res1 = numbers1[0] + numbers1[1]
res2 = numbers2[0] + numbers2[1]

if res1 > res2 :
    print("A win")
elif res1 < res2 :
    print("B win")
else:
    print("Draw")