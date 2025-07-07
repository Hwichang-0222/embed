'''
Created on 2025. 6. 24.

@author: user
'''

from tkinter import *
from tkinter import messagebox as mbox

fnList = []
for i in range (1, 10):
    fnList.append("jeju"+str(i)+".gif")
    
num = 0

def clickNext() :
    global num
    num += 1
    if num > 8 :
        num = 0
        mbox.showinfo("wrong", "Goto First photo")
    updata()
    
def clickPrev() :
    global num
    num -= 1
    if num < 0 :
        mbox.showinfo("wrong", "Goto Last photo")
        num = 8
    updata()
    
def updata():
    photo = PhotoImage(file = "image/GIF/" + fnList[num])
    label1.configure(text = fnList[num])
    pLabel.configure(image = photo)
    pLabel.image = photo
    
if __name__ == "__main__":
    
    wd = Tk()
    wd.geometry("700x550")
    wd.title("사진 앨범 보기")
    
    btnPrev = Button(wd, text = "<< 이전", command = clickPrev)
    btnNext = Button(wd, text = "다음 >>", command = clickNext)
    btnExit = Button(wd, text = "Close", command = exit)
    
    photo = PhotoImage(file = "image/GIF/" + fnList[num])
    pLabel = Label(wd, image = photo)
    label1 = Label(wd, text= fnList[num])
    
    btnPrev.place(x = 250, y = 10)
    btnNext.place(x = 400, y = 10)
    label1.place(x = 330, y = 10)
    pLabel.place(x = 15, y = 50)
    btnExit.place(x = 330, y = 500)
    
    wd.mainloop()
