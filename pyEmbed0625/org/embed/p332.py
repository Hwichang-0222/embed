'''
Created on 2025. 6. 25.

@author: user
'''

# 1번
#    1. title
#    2. geometry
#    3. resizeable
#    4. pack
#    5. mainloop

# 2번
#    3. command= click_button

# 3번
#    1. var.get()
#    2. IntVar()
#    3. var

# 4번
#    1. LEFT
#    2. RIGHT
#    3. TOP
#    4. BOTTOM

# 5번
''' 1.
    num += 1
    if num > 8 :
        num = 0
    2.
    num -= 1
    if num < 0 :
        num = 0
'''
# 6번    2, 4, 5

# 7번    3

# 8번    1

# 9번    
'''
totalMenu.add_casecade(label= "상위메뉴", menu = upMenu)
upMenu.add_command(label= "하위메뉴1")
upMenu.add_seperate
upMenu.add_command(label= "하위메뉴1")
'''
# 10번

from tkinter import *
from tkinter import messagebox as mbox
from tkinter.filedialog import *
from tkinter.simpledialog import *

def open_file():
    global pho
    file_name = askopenfilename(parent= wd, filetypes= (("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
    pho = PhotoImage(file= file_name)
    phoLabel.configure(image= pho)
    phoLabel.image= pho
    
def zoom(event):
    global pho, v1, v2
    copy_pho = pho
    if event.keycode == 38:
        pho = copy_pho.zoom(2,2)
        if copy_pho.height() == pho.height():
            copy_pho = pho
    elif event.keycode == 40:
        pho = copy_pho.subsample(2,2)
        if copy_pho.height() == pho.height():
            copy_pho = pho
    phoLabel.configure(image= copy_pho)
    phoLabel.image= copy_pho
#    print(copy_pho.height())
#    print(copy_pho.width())
    if copy_pho.height() == pho.height():
        copy_pho = pho

if __name__ == '__main__':
    
    wd = Tk()
    wd.geometry("400x400")
    
    pho = PhotoImage()
    phoLabel = Label(wd, image= pho)
    
    phoLabel.pack(expand= 1, anchor= CENTER)
    
    main_menu = Menu(wd)
    wd.config(menu= main_menu)
    file_menu = Menu(main_menu)
    
    main_menu.add_cascade(label= "File",menu= file_menu)
    file_menu.add_command(label= "Open", command= open_file)
    file_menu.add_separator()
    file_menu.add_command(label= "Exit", command= exit)
    
    wd.bind("<Up>", zoom)
    wd.bind("<Down>", zoom)   
    
    wd.mainloop()