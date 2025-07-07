'''
Created on 2025. 6. 24.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

wd = Tk()

def myFunc():
    if chk.get() == 0 :
        print("check :", chk.get())
        mbox.showinfo("", "turn off message")
    else:
        print("check :", chk.get())
        mbox.showinfo("", "turn on message")

if __name__ == '__main__':
    
    wd.geometry("200x200")
    
    chk = IntVar()
    cb1 = Checkbutton(wd, text="click", variable= chk, command= myFunc)
    
    
    cb1.pack()
    
    
    
    
    
    wd.mainloop()