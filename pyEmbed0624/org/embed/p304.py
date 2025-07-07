'''
Created on 2025. 6. 24.

@author: user
'''

from tkinter import *

window = Tk()

if __name__ == '__main__':
    '''
    window.title("image try")
    window.resizable(width = False, height = False)
    window.geometry("300x300")
    photo = PhotoImage(file = "img/dog.gif")
    label1 = Label(window, image = photo)
    
    label1.pack()
    
    
    window.mainloop()
    '''
    
    window.title("image try")
    #window.resizable(width = False, height = False)
    #window.geometry("300x300")
    photo1 = PhotoImage(file = "img/cat.gif")
    photo2 = PhotoImage(file = "img/cat2.gif")
    label1 = Label(window, image = photo1)
    label2 = Label(window, image = photo2)
    
    label1.pack(side = LEFT)
    label2.pack(side = LEFT)
    
    
    window.mainloop()