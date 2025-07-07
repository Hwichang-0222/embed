'''
Created on 2025. 6. 24.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

def click(event):
    txt = ''
    if event.num == 1:
        txt += "Right click "
    elif event.num == 3:
        txt += "left click "
    
    txt += str(event.y)+","+str(event.x)+" is on"
    lb1.configure(text= txt)

def rel(event):
    txt = ''
    txt += str(event.y)+","+str(event.x)+" was released"
    lb1.configure(text= txt)

if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("400x400")
    
    lb1 = Label(wd, text= "change area")
    
    wd.bind("<Button>",click)
    wd.bind("<ButtonRelease>",rel)
    
    lb1.pack(expand = 1, anchor = CENTER) 
    
    
    
    wd.mainloop()