'''
Created on 2025. 6. 24.

@author: user
'''

from tkinter import *
from tkinter import messagebox as mbox

def clickLeft(event):
    mbox.showinfo("Mouse Event", "Left Button of Mouse is clicked")

if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("200x200")
    
    wd.bind("<Button-1>",clickLeft)
    
    
    wd.mainloop()