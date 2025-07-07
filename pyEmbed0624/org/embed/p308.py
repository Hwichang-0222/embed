'''
Created on 2025. 6. 24.

@author: user
'''

from tkinter import *
from tkinter import messagebox as mbox

def myFunc():
    if var.get() == 1:
        print(var.get())
        lb1.configure(text= "python")
    elif var.get() == 2:
        print(var.get())
        lb1.configure(text= "C++")
    else:
        print(var.get())
        lb1.configure(text= "Java")

wd = Tk()

if __name__ == '__main__':
    
    wd.geometry("200x200")
    
    var = IntVar()
    
    rd1 = Radiobutton(wd, text="python", variable= var, value= 1, command= myFunc)
    rd2 = Radiobutton(wd, text="C++", variable= var, value= 2, command= myFunc)
    rd3 = Radiobutton(wd, text="Java", variable= var, value= 3, command= myFunc)
    
    lb1 = Label(wd, text= "choose :", fg= "red")
    
    rd1.pack()
    rd2.pack()
    rd3.pack()
    lb1.pack()
    
    wd.mainloop()