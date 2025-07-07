'''
Created on 2025. 6. 25.

@author: user
'''

from tkinter import *
from tkinter import messagebox as mbox

def keyEventS(event):
    txt = "Press : Shift + "
    if event.keycode == 37:
        txt += "Left arrow"
    elif event.keycode == 38:
        txt += "up arrow"
    elif event.keycode == 39:
        txt += "Right arrow"
    elif event.keycode == 40:
        txt += "Down arrow"
    else:
        txt += chr(event.keycode)
    
    lb1.config(text= txt)
#    mbox.showinfo("Keyboard Event", txt)
def keyEventC(event):
    txt = "Press : Control + "
    if event.keycode == 37:
        txt += "Left arrow"
    elif event.keycode == 38:
        txt += "up arrow"
    elif event.keycode == 39:
        txt += "Right arrow"
    elif event.keycode == 40:
        txt += "Down arrow"
    else:
        txt += chr(event.keycode)
    
    lb1.config(text= txt)
    
def keyEvent(event):
    txt = "Press : "
    if event.keycode == 37:
        txt += "Left arrow"
    elif event.keycode == 38:
        txt += "up arrow"
    elif event.keycode == 39:
        txt += "Right arrow"
    elif event.keycode == 40:
        txt += "Down arrow"
    else:
        txt += chr(event.keycode)
    
    lb1.config(text= txt)
    
if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("400x400")
    
    lb1 = Label(text= "keycode")
    
#    wd.bind("<Shift-Left>", keyEvent)
#    wd.bind("<Shift-Right>", keyEvent)
#    wd.bind("<Shift-Down>", keyEvent)
#    wd.bind("<Shift-Up>", keyEvent)
    wd.bind("<Control-Key>", keyEventC)
    wd.bind("<Shift-Key>", keyEventS)
    wd.bind("<Key>", keyEvent)
    lb1.pack(expand = 1, anchor = CENTER)
    
    wd.mainloop()