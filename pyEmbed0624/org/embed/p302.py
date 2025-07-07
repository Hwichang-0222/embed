'''
Created on 2025. 6. 24.

@author: user
'''

from tkinter import *

if __name__ == '__main__':
    
    window = Tk()
    
#    print(window, type(window))

    window.title("Python Grapic")
    window.geometry("400x400")
    window.resizable(width = False, height = True)
    
    label1 = Label(window, text="python letter")
    
    #label1.pack()
    label1.grid(row = 0, column = 0)
    #label1.place(x = 200, y = 200)
    
    
    
    
    window.mainloop()