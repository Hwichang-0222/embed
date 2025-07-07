'''
Created on 2025. 6. 23.

@author: user
'''
'''
coffee = int(input("choose your coffee (1: Normal 2: Black 3: Sugar) : "))

print()
print("step 1. boiling water")
print("step 2. prepare a cup")

if coffee == 1:
    print("step 3. put a normal coffee in the cup")
elif coffee == 2:
    print("step 3. put a black coffee in the cup")
elif coffee == 3:
    print("step 3. put a sugar coffee in the cup")
else :
    print("step 3. put a coffee in the cup")

print("step 4. put the water in the cup")
print("step 5. whip the coffee with spoon")
print()
print("step 6. server the coffee for customer")
'''

def coffee_machine(butten):
    
    print()
    print("grinding a coffee")
    print("make the espresso")
    print("prepare the cup")
    if butten in [1, 2, 3]:
        hi = int(input("hot(1) or ice(2)? "))
        print()
        
        if hi == 1 :
            print("put the coffee into cup")
            if butten == 1:
                print("put the hot water into the cup")
            elif butten == 2:
                print("make a steam milk and put in the cup")
            else :
                print("make a cafuccino milk and put in the cup")
        
        elif hi == 2 :
            print("put the ice into cup")
            if butten == 1:
                print("put the coffee and water into the cup")
            elif butten == 2:
                print("make a coffee and milk put in the cup")
            else :
                print("make a coffee and steam milk and put in the cup")
        
        else:
            print("error!!! shutdown!!!")
            exit()
        
        print("serve the coffee for customer")
               
    elif butten == 4:
        print("put the coffee into small cup and serve.")
        pass
    
    
if __name__ == "__main__":
    
    while True :
        
        butten = int(input("choose your coffee (1: americano 2: latte 3: caffucino 4: espresso 0: shutdown) : "))
        
        if butten == 0 :
            break
        
        elif butten > 4:
            print("put 0, 1, 2, 3, 4")
            continue
        
        else :
            coffee_machine(butten)
            
        print()
        
    print("shutdown")
    
    
    