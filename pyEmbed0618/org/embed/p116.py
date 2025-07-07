'''
Created on 2025. 6. 18.

@author: user
'''


# 1번
#    1). =
#    2). /
#    3). %
#    4). **

# 2번
n1, n2, n3 = (1, 2, 3)
print(n1 + n2 * n3)      # 1). 7
print(n1 * n2 + n3)      # 2). 5
print(n1 - n2 * n3)      # 3). -5
print(n1 * n2 - n3)      # 4). -1

# 3번
#    1). int()
#    2). float()
#    3). str()

# 4번
num = 100
num += 1
num -= 1
num *= 1
num /= 1
num = int(num)
print(num)      #  100

# 5번
num1, num2 = -100, 100
print(num1 == num2)  #    1). False
print(num1 >= num2)  #    2). False
print(num1 <= num2)  #    3). True
print(num1 != num2)  #    4). True

# 6번
print((num1 == num2) and (num1 != num2))    #    1). False
print((num1 == num2) or (num1 != num2))     #    2). True
print((num1 >= num2) and (num1 <= num2))    #    3). False
print((num1 >= num2) or (num1 <= num2))     #    4). True

# 7번 
n1, n2 = 6, 1
print(n1 & n2)   #    1). 0
print(n1 | n2)   #    2). 7
print(n1 >> n2)  #    3). 3
print(n1 << n2)  #    4). 12

# 8번
#    () + << & >= == and
money, c500, c100, c50, c10 = [0] *5

c500 = int(input("500원 갯수 : "))
c100 = int(input("100원 갯수 : "))
c50 = int(input("50원 갯수 : "))
c10 = int(input("10원 갯수 : "))

money = 500*c500 + 100*c100 + 50*c50 + 10*c10

print("총 금액 : %d원" %money)