def dangleInside(x, y):
    if (x > 0):
        if (y > 0):
            print("hello")
        else:
            print("world")

def dangleOutside(x, y):
    if (x > 0):
        if (y > 0):
            print("hello")
    else:
        print("world")

print("If/Else inside If:")
print("x = 0, y = 0")
dangleInside(0, 0)
print("x = 1, y = 0")
dangleInside(1, 0)
print("x = 1, y = 1")
dangleInside(1, 1)

print("\nIf/Else outside If:")
print("x = 0, y = 0")
dangleOutside(0, 0)
print("x = 1, y = 0")
dangleOutside(1, 0)
print("x = 1, y = 1")
dangleOutside(1, 1)
