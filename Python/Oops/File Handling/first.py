file = open("File Handling/Test.txt", "w")
file.write("Hello World\n")

file.close()

file = open("File Handling/Test.txt", "a")
file.write("This is a new line\n")
file.close()

file = open("File Handling/Test.txt", "r+")
content = file.read()
print(content)
file.write("This line will not be written because the file is opened in read mode\n")
print(file.read())
file.close()