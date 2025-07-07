'''
Created on 2025. 6. 25.

@author: user
'''

from tkinter import *
from tkinter.filedialog import *

def func_open() :
    filename = askopenfilename(parent = wd, filetypes = (("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
    photo = PhotoImage(file = filename)
    pLabel.configure(image = photo)
    fLabel.configure(text = filename)
    pLabel.image = photo

def func_exit() :
    wd.quit()
    wd.destroy()

if __name__ == "__main__":
    wd = Tk()
    wd.geometry("500x500")
    wd.title("Image Viewer")
    
    photo = PhotoImage()
    pLabel = Label(wd, image = photo)
    fLabel = Label(wd, text= "filename")
    pLabel.pack(expand=1, anchor = CENTER)
    fLabel.pack(expand=1, anchor = S)
    
    mainMenu = Menu(wd)
    wd.config(menu = mainMenu)
    fileMenu = Menu(mainMenu)
    mainMenu.add_cascade(label = "File", menu = fileMenu)
    fileMenu.add_command(label = "Open", command = func_open)
    fileMenu.add_separator()
    fileMenu.add_command(label = "Close", command = func_exit)
    
    wd.mainloop()
