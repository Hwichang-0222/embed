'''
Created on 2025. 6. 24.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

wd = Tk()

if __name__ == '__main__':
    
    btnList = [None] * 3
    
    wd.geometry("400x400")
    
    for i in range(len(btnList)):
        btnList[i] = Button(wd, text= "button" + str(i+1))
        
    for btn in btnList:
        btn.pack(side= TOP, fill= X, padx=30, pady= 30)
    
    
    
    wd.mainloop()