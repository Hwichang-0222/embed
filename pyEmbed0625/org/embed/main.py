'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter import *
from org.embed.window_module import openNew

# 진입점: 메인 Tk 윈도우는 숨기고 새 Toplevel 창을 엽니다
if __name__ == "__main__":
    root = Tk()
    root.withdraw()         # 루트 창 숨김 (mainloop는 여전히 유지됨)
    openNew(root)           # 첫 번째 이미지 창 띄우기
    root.mainloop()