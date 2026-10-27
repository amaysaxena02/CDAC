class computer:
    def __init__(self):
        self.name = "PC"
        self.ram = 16
        self.cpu = "Intel i5"

c1 = computer()
c2 = computer()

c1.name = "Laptop"
c2.name = "Desktop"

print(c1.name)    
print(c2.name)