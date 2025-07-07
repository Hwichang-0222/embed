'''
Created on 2025. 6. 17.

@author: user
'''

# 1번
#    4

# 2번
print("%d / %d = %d" %(10, 5, 5/10))    # 3. 5 / 10 = 0
print("")

# 3번
print("%04d" %876)      #0876
print("%5s" %"CookBook")#CookBook
print("%1.1f" %123.45)  #123.5
print("")

# 4번
print("{2:d} {0:d} {1:d}" .format(111, 222, 333))   # 3. 333 111 222
print("")
 
# 5번
print("Hello\t World")    # \t
print("Hello\b World")    # \b
print("Hello\\ World")    # \\
print("")

# 6번
#    4

# 7번
#    2, 4

# 8번
#    a = b = c = d = 20

# 9번
#    2, 4, 5

# 10번
print(int("0011", 2))   #    1. 3
print(int("01010", 2))  #    2. 10
print(int("11", 16))    #    3. 17
print(int("17", 8))     #    4. 15
print("")

# 11번
print(0b1011)    #    1. 11
print(0x1a)      #    2. 26
print("")

# 12번
#    1. hex  2. oct  3. bin

# 13번
#    1. int('1001', 2)
#    2. int('1007', 8)
#    3. int('AAFF', 16)

# 14번
#    1, 3, 5

# 15번
num = 12345678
hex_num = hex(num)
oct_num = oct(num)
bin_num = bin(num)

print(num)
print(hex_num)
print(oct_num)
print(bin_num)
print("")

# 16번
num = input("글자 입력 :")

if ("0" <= num and num <= "1"):
    print("2진수 또는 8진수 또는 10진수 또는 16진수입니다.") 

elif ("2" <= num and num <= "7"):
    print("8진수 또는 10진수 또는 16진수입니다.") 

elif ("8" <= num and num <= "9"):
    print("10진수 또는 16진수입니다.")
    
elif ("a" <= num and num <= "f") or ("A" <= num and num <= "F"):
    print("16진수입니다.")
    
else:
    print("숫자가 아닙니다.")