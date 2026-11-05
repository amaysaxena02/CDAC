import numpy as np

A = np.array([[1,2],[3,4]])
B = np.array([[5,6],[7,8]])

mat_mul = np.einsum('ij,jk->ik', A, B) #matrix multiplication using Einstein summation convention
print("Matrix A: \n", A)
print("Matrix B: \n", B)
print("Matrix Multiplication using Einstein Summation Convention: \n", mat_mul)

print("Transpose of Matrix A: \n", np.einsum('ij->ji', A)) #transpose of matrix A using Einstein summation convention
print("Trace of Matrix A: ", np.einsum('ii->', A)) #trace of matrix A using Einstein summation convention

print("-"*60)

# nd array to simulate pytorch tensor operations (Batch, Channels, Heights, Width)
tensor_A = np.zeros((2,3,4,4)) 
print("Shape of Tensor A: ", tensor_A.shape)
print("Tensor A: \n", tensor_A)

print("-"*60)

# Convert Axes from pytorch (NCHW) to Tensorflow (NHCW) format using einsum
tf_tensor = np.einsum('nchw->nhcw', tensor_A)
tf_tensor_np = np.transpose(tensor_A, (0,2,3,1)) # using np.transpose for comparison
print("tf_tensor shape is : ", tf_tensor.shape)
print("tf_tensor_np shape is : ", tf_tensor_np.shape)

print("-"*60)