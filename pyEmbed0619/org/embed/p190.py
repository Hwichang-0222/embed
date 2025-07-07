'''
Created on 2025. 6. 19.

@author: user
'''

aa = []

for i in range (0, 4):
    aa.append(0)
    print(len(aa))

hap = 0

for i in range(0, 4):
    aa[i] = int(input(str(i + 1) + "번 숫자 입력 : "))

#for i in range(0, 4):
    hap += aa[i]
    
print("total :", hap)
