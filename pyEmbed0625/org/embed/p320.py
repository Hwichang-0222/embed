'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

def keyEvent(event):
    la1.configure(text= str(int(event.keycode)))

if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("400x400")
    
    la1 = Label(text= "keycode")
    
    la1.pack(expand = 1, anchor = CENTER)
    wd.bind("<Key>", keyEvent)
    
    
    
    
    wd.mainloop()