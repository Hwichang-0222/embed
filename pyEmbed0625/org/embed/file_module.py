'''
Created on 2025. 6. 25.

@author: user
'''
from tkinter.filedialog import askopenfilename
from tkinter import PhotoImage

# 이미지 열기 함수
def func_open(window):
    filename = askopenfilename(parent=window, filetypes=(("GIF 파일", "*.gif"), ("모든 파일", "*.*")))
    if filename:
        photo = PhotoImage(file=filename)
        window.pLabel.configure(image=photo)
        window.pLabel.image = photo
        window.fLabel.config(text=filename)
        window.original_image = photo.copy()  # 리셋용 원본 저장

# 창 종료 함수
def func_exit(window):
    window.destroy()

# 필터 적용 함수 (red, green, blue, gray)
def apply_filter(window, mode):
    if not hasattr(window, "original_image"):
        return

    # 원본 이미지에서 새롭게 복사
    photo = window.original_image.copy()

    width = photo.width()
    height = photo.height()

    for y in range(height):
        for x in range(width):
            try:
                r, g, b = photo.get(x, y)
            except:
                continue

            if mode == "red":
                color = f"#{r:02x}0000"
            elif mode == "green":
                color = f"#00{g:02x}00"
            elif mode == "blue":
                color = f"#0000{b:02x}"
            elif mode == "gray":
                gray = int((r + g + b) / 3)
                color = f"#{gray:02x}{gray:02x}{gray:02x}"
            else:
                color = f"#{r:02x}{g:02x}{b:02x}"

            photo.put(color, (x, y))

    window.pLabel.configure(image=photo)
    window.pLabel.image = photo

# 이미지 초기화 (원본으로 복원)
def reset_image(window):
    if hasattr(window, "original_image"):
        photo = window.original_image.copy()
        window.pLabel.configure(image=photo)
        window.pLabel.image = photo