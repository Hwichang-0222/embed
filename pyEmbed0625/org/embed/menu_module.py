'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from org.embed.file_module import func_open, func_exit, apply_filter, reset_image

# 메뉴 구성 함수
def menuTotal(window, root):
    from org.embed.window_module import openNew
    
    mMenu = Menu(window)
    window.config(menu=mMenu)

    # File 메뉴 구성
    fMenu = Menu(mMenu, tearoff=0)
    oMenu = Menu(fMenu, tearoff=0)
    fMenu.add_cascade(label="Open", menu=oMenu)
    oMenu.add_command(label="New", command=lambda: openNew(root))
    oMenu.add_command(label="Open Image", command=lambda: func_open(window))

    fMenu.add_separator()
    fMenu.add_command(label="Exit", command=lambda: func_exit(window))
    mMenu.add_cascade(label="File", menu=fMenu)

    # Edit 메뉴 구성
    eMenu = Menu(mMenu, tearoff=0)
    mMenu.add_cascade(label="Edit", menu=eMenu)

    # 색상 필터 하위 메뉴
    color_menu = Menu(eMenu, tearoff=0)
    eMenu.add_cascade(label="Color Filters", menu=color_menu)
    color_menu.add_command(label="Red", command=lambda: apply_filter(window, "red"))
    color_menu.add_command(label="Green", command=lambda: apply_filter(window, "green"))
    color_menu.add_command(label="Blue", command=lambda: apply_filter(window, "blue"))
    color_menu.add_command(label="Grayscale", command=lambda: apply_filter(window, "gray"))
    color_menu.add_separator()
    color_menu.add_command(label="Reset", command=lambda: reset_image(window))