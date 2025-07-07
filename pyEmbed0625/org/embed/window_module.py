'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from org.embed.menu_module import menuTotal

# 새 창 생성 함수
def openNew(root):
       
    new_win = Toplevel(root)
    new_win.geometry("500x500")
    new_win.title("Image Viewer")

    # 기본 이미지 객체 (비어 있음)
    photo = PhotoImage()
    pLabel = Label(new_win, image=photo)
    pLabel.image = photo  # 가비지 컬렉션 방지
    fLabel = Label(new_win, text="filename")

    # 레이아웃 배치
    pLabel.pack(expand=1)
    fLabel.pack(expand=1, anchor=S)

    # 위젯 참조를 창 객체에 속성으로 저장
    new_win.pLabel = pLabel
    new_win.fLabel = fLabel

    # 메뉴 바 생성
    menuTotal(new_win, root)