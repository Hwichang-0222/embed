'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from tkinter.filedialog import *

window = Tk()
window.geometry("400x100")

label1 = Label(window, text = "선택된 파일 이름 ")
label1.pack()

#filename = askopenfilename(parent = window, filetypes = (("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
saveFp = asksaveasfile(parent = window, mode='w', defaultextension = ".jpg", filetypes= (("jpg 파일", "*.jpg;*.jpeg"), ("모든 파일", "*.*")))
label1.configure(text=saveFp)
saveFp.close()
window.mainloop()
