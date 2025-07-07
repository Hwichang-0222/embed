'''
Created on 2025. 6. 25.

@author: user
'''

from tkinter import *
from tkinter.filedialog import *

wList = []

def func_open(window, pLabel, fLabel):
    filename = askopenfilename(parent=window, filetypes=(("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
    photo = PhotoImage(file=filename)
        
    height = photo.height()
    width = photo.width()
        
    for y in range(height):
        for x in range(width):
            r, g, b = photo.get(x, y)
    
            gray = int((r + g + b) / 3)
        color = f"#{gray:02x}{gray:02x}{gray:02x}"
        photo.put(color, (x, y))

    pLabel.image = photo  # 참조 유지
    fLabel.configure(text=filename)

def func_exit(window):
    window.quit()
    window.destroy()

def openNew():
    new_wd = Toplevel(wd)
    new_wd.geometry("500x500")
    new_wd.title("새 창 - Image Viewer")
    menuTotal(new_wd)  # 메뉴 먼저 추가

    # 새로운 Label 위젯
    photo = PhotoImage()
    pLabel = Label(new_wd, image=photo)
    pLabel.image = photo  # 참조 유지
    fLabel = Label(new_wd, text="filename")
    pLabel.pack(expand=1)
    fLabel.pack(expand=1, anchor=S)

    # 메뉴 함수에서 사용할 수 있도록 위젯 저장
    new_wd.pLabel = pLabel
    new_wd.fLabel = fLabel

    wList.append(new_wd)

def menuTotal(window):
    mMenu = Menu(window)
    window.config(menu=mMenu)

    # File 메뉴
    fMenu = Menu(mMenu, tearoff=0)
    oMenu = Menu(fMenu, tearoff=0)
    mMenu.add_cascade(label="File", menu=fMenu)
    fMenu.add_cascade(label="Open", menu=oMenu)

    oMenu.add_command(label="new", command=openNew)
    oMenu.add_command(label="saved", command=lambda: func_open(window, window.pLabel, window.fLabel))
    fMenu.add_command(label="Save")
    fMenu.add_separator()
    fMenu.add_command(label="Exit", command=lambda: func_exit(window))

    # Edit 메뉴
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
    cMenu.add_command(label="gray")

if __name__ == "__main__":
    wd = Tk()
    wd.geometry("500x500")
    wd.title("Image Viewer")

    photo = PhotoImage()
    pLabel = Label(wd, image=photo)
    fLabel = Label(wd, text="filename")
    pLabel.pack(expand=1)
    fLabel.pack(expand=1, anchor=S)

    # 루트 창에도 동일한 방식으로 속성 추가
    wd.pLabel = pLabel
    wd.fLabel = fLabel

    menuTotal(wd)
    wd.mainloop()