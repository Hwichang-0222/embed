'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from tkinter import messagebox as mbox
from tkinter.filedialog import *

wList = []
count = 0

def openNew():
    new_wd = Toplevel(wd)
    new_wd.geometry("400x400")
    menuTotal(new_wd)  # 새 창에도 메뉴 달기
    wList.append(new_wd)

def openFile(window):
    f = askopenfile(parent=window, filetypes=(("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
    if f:
        mbox.showinfo("파일 열기", f"{f.name}을(를) 열었습니다.")

def menuTotal(window):
    mMenu = Menu(window)
    window.config(menu=mMenu)

    # File 메뉴 구성
    fMenu = Menu(mMenu, tearoff=0)
    oMenu = Menu(fMenu, tearoff=0)
    mMenu.add_cascade(label="File", menu=fMenu)
    fMenu.add_cascade(label="Open", menu=oMenu)
    oMenu.add_command(label="new", command=openNew)
    oMenu.add_command(label="saved", command=lambda: openFile(window))
    fMenu.add_command(label="Save")
    fMenu.add_separator()
    fMenu.add_command(label="Exit", command=exit)

    # Edit 메뉴 구성
    eMenu = Menu(mMenu, tearoff=0)
    cMenu = Menu(eMenu, tearoff=0)
    mMenu.add_cascade(label="Edit", menu=eMenu)
    eMenu.add_command(label="copy")
    eMenu.add_command(label="paste")
    eMenu.add_command(label="back")
    eMenu.add_command(label="front")
    eMenu.add_separator()
    eMenu.add_cascade(label="color", menu=cMenu)
    cMenu.add_command(label="red")
    cMenu.add_command(label="blue")
    cMenu.add_command(label="yellow")

if __name__ == '__main__':
    wd = Tk()
    wd.geometry("400x400")
    menuTotal(wd)
    wd.mainloop()