import numpy as np

x = np.array([[1.0, 2.0], [3.0, 4.0]], dtype=np.float64)
y = np.array([[5.0, 6.0], [7.0, 8.0]], dtype=np.float64)

print("X: \n", x)
print("Y: \n", y)

# Addition

print("Operator Used: \n", x + y) #element-wise addition
print("Function Used: \n", np.add(x, y)) #element-wise addition

# Subtraction

print("Operator Used: \n", x - y) #element-wise subtraction
print("Function Used: \n", np.subtract(x, y)) #element-wise subtraction

# Multiplication

print("Operator Used: \n", x * y) #element-wise multiplication
print("Function Used: \n", np.multiply(x, y)) #element-wise multiplication

# Division & square root

print("Operator Used: \n", x / y) #element-wise division
print("Function Used: \n", np.divide(x, y)) #element-wise division
print("Square Root of X: \n", np.sqrt(x)) #square root of each element in x

print("-"*60)

raw_signal = np.array([-1.7, 2.5, -3.6, 4.8, -5.9])
print("Raw Signal: ", raw_signal)

# floor, ceil and round
print("Floor of Raw Signal: ", np.floor(raw_signal)) #floor of each element in raw_signal
print("Ceil of Raw Signal: ", np.ceil(raw_signal)) #ceil of each element
print("Round of Raw Signal: ", np.round(raw_signal)) #round of each element

print("-"*60)

dataset = np.array([[10,20,30],
                    [40,50,60],
                    [70,80,90]])

print("Dataset: \n", dataset)
# Global Reduction Operations
print("Global Sum: ", np.sum(dataset)) #sum of all elements in dataset
print("Global Mean: ", np.mean(dataset)) #mean of all elements in dataset

print("-"*60)

# axis=0: Operations collapse rows, computing stats FOR EACH COLUMN
print("Column-wise Sum: ", np.sum(dataset, axis=0)) #sum of each column
print("Column-wise Mean: ", np.mean(dataset, axis=0)) #mean of each

print("-"*60)

# axis=1: Operations collapse columns, computing stats FOR EACH ROW
print("Row-wise Sum: ", np.sum(dataset, axis=1)) #sum of each row
print("Row-wise Mean: ", np.mean(dataset, axis=1)) #mean of each row

raw_features = np.arrray([[150.0, ]])