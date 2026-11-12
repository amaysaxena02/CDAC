import numpy as np

vector_a = np.array([9,10])
vector_b = np.array([11,12])

print("Vector A: ", vector_a)
print("Vector B: ", vector_b)

print("|======={Dot Product}=======|")
print("Dot Product: ", np.dot(vector_a, vector_b))
print("Ufunc (np.inner): ", np.inner(vector_a, vector_b))
print("Operator @: ", vector_a @ vector_b)

print("-"*60)

x = np.array([[1,2],[3,4]])
y = np.array([[5,6],[7,8]])

print("Matrix X: \n", x)
print("Matrix Y: \n", y)
print("Element wise Product: \n", x * y) #element-wise multiplication

print("|======={Matrix Multiplication}=======|")
print("Matrix Multiplication: \n", np.dot(x, y))
print("Operator @: \n", x @ y)

print("-"*60)

matrix = np.array([[1,2,3],
                   [4,5,6]])
print("Matrix: \n", matrix)
print("Transpose of Matrix: \n", matrix.T) #transpose of matrix)

print("-"*60)

v_1d = np.array([1,2,3])
print("1D Vector: ", v_1d)
print("1D Vector Transpose: ", v_1d.T) #transpose of 1D vector is the same as the original vector
print("1D Vector Shape: ", v_1d.shape)

print("-"*60)

scalar_bias = 5

matrix = matrix + scalar_bias #broadcasting: adding a scalar to a matrix
print("Matrix after adding scalar bias: \n", matrix)

print("-"*60)

matrix_data = np.array([[1,2,3],
                        [4,5,6],
                        [7,8,9]])

row_vector = np.array([10,20,30])
row_broadcasted = matrix_data + row_vector #broadcasting: adding a row vector to a matrix
print("Matrix Data: \n", matrix_data)
print("Row Vector: ", row_vector)
print("Matrix after adding row vector: \n", row_broadcasted)

col_vector = np.array([[100],[200],[300]])
print("Column Vector: \n", col_vector)
print("Matrix after adding column vector: \n", matrix_data + col_vector)

print("-"*60)