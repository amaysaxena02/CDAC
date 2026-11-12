import numpy as np
import sys

print(sys.version)
print(np.__version__)
print(python_version := sys.version_info)

vector_1d = np.array([1, 2, 3, 4, 5])
matrix_2d = np.array([[1, 2, 3], [4, 5, 6]])

print("-" * 100)

print("1D Vector:")
print(vector_1d)    
print("2D Matrix:")
print(matrix_2d)

print("-" * 100)

# Memory footprint comparison between Python list and NumPy array
size = 1000
python_list = list(range(size))
numpy_array = np.arange(size)
actual_size = sys.getsizeof(python_list) + sum(sys.getsizeof(item) for item in python_list)
print("Python list size:", actual_size)
print("NumPy array size:", numpy_array.nbytes)

print("-" * 100)

# list comprehension vs generator expression
# val = 100000
# list_comprehension = [val for val in range(val)]
# print("-" * 100)

# numpy tensor initialization
# tensor factorty functions

zero_matrix = np.zeros((3, 4))
one_matrix = np.ones((2,3))
constant_matrix = np.full((2, 3), 7)
ident_matrix = np.eye(3)

random_rng = np.random.default_rng(seed=42)
random_matrix = random_rng.random((2, 3))

print("Zero Matrix:")
print(zero_matrix)
print("One Matrix:")
print(one_matrix)
print("Constant Matrix:")
print(constant_matrix)
print("Identity Matrix:")
print(ident_matrix)
print("Random Matrix:")
print(random_matrix)
