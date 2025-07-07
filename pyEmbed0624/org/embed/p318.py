'''
Created on 2025. 6. 24.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox

def click(event):
    mbox.showinfo("title", "message")

if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("400x400")
    
    photo = PhotoImage(file= "image/GIF/rabbit.gif")
    label1 = Label(wd, image= photo)
    
    label1.bind("<Button>", click)
    
    label1.pack(expand = 1, anchor = W)
    
    wd.mainloop()