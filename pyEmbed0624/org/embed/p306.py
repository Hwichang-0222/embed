'''
Created on 2025. 6. 24.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

def myFunc():
    mbox.showinfo("Dog Button", "message")

wd = Tk()

if __name__ == '__main__':
    
    photo = PhotoImage(file="image/GIF/dog2.gif")
    wd.geometry("300x300")
    
    bt1 = Button(wd, image= photo, command= myFunc)
    bt1.pack()
    
    wd.mainloop()