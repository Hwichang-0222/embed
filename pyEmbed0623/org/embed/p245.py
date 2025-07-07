'''
Created on 2025. 6. 23.

@author: user
'''


inStr = input("put string : ")
if __name__ == '__main__':
    
    if inStr.isdigit() and inStr.isspace() == False:
        print("That is no space number")
        
    elif inStr.isdigit() == True and inStr.isspace() == True:
        print("That is space number")
        
    elif inStr.isalpha() and inStr.isspace() == True:
        if inStr.isupper():
            print("That is no space upper alphabet")
        elif inStr.islower():
            print("That is no space lower alphabet")
        else:
            print("That is no space mix alphabet")

    elif inStr.isalpha() and inStr.isspace() == False:
        if inStr.isupper():
            print("That is space upper alphabet")
        elif inStr.islower():
            print("That is space lower alphabet")
        else:
            print("That is space mix alphabet")
    
    elif inStr.isalnum() and inStr.isspace() == False:
        print("That is no space combination")
        
    elif inStr.isalnum() and inStr.isspace() == True:
        print("That is space combination")
        
    else :
        print("don't know")
    
    
    