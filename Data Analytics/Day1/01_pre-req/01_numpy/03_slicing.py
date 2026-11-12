'''
Numpy slicing is a powerful feature that allows you to extract specific portions of an array.
Advantage of numpy slicing inludes:
1. Zero-copy views: sharong underlying buffer memory with the original array, which svaes memory and improves performance.
2. FLexible indexing: Returns a view of the original array
3. Boolean indexing: Allows you to filter elements based on conditions, making it easy to extract relevant data.
'''
import numpy as np

sensor_reading = np.arange(9)
print("Original array: ", sensor_reading)

sensor_reading[3] = 999
print("Modified array: ", sensor_reading)

sensor_reading[3] = 3
print("Slices array: ", sensor_reading[2:5]) #slicing from index 2 to 4 (5 is exclusive)

# tensor change
sensor_reading[2:5] = 100
print("Modified array after slicing: ", sensor_reading)

print("-"*60)

values = np.arange(10, 101, 10)
print("Original array: ", values)
print("Values[2]: ", values[2])
print("Values[2:5]: ", values[2:5]) #slicing from index 2 to 4 (5 is exclusive)
print("Values[2:]: ", values[2:]) #slicing from index 2 to the end
print("Values[:5]: ", values[:5]) #slicing from the start to index 4 (5 is exclusive)
print("Values[1:8:2]: ", values[1:8:2]) #slicing from index 1 to 7 with a step of 2
print("Values[::2]: ", values[::2]) #slicing with a step of 2 (every second element)
print("Values[-1]: ", values[-1]) #slicing the last element
print("Values[-2]: ", values[-2]) #slicing the second last element
print("Values[-3]: ", values[-3]) #slicing the third last element
print("Values[-3:]: ", values[-3:]) #slicing the last three elements
print("Values[:-3]: ", values[:-3]) #slicing all elements except the last three
print("Values[-5:-2]: ", values[-5:-2]) #slicing from the fifth last element to the third last element (exclusive)
print("Values[-2:-5:-1]: ", values[-2:-5:-1]) #slicing from the second last element to the fifth last element (exclusive) in reverse order
print("Values[-2::-1]: ", values[-2::-1]) #slicing from the second last element to the start in reverse order
print("Values[::-1]: ", values[::-1]) #slicing in reverse order (reversing the array)

print("-"*60)

feature_matrix = np.array([[1, 2, 3, 4], 
                           [5, 6, 7, 8], 
                           [9, 10, 11, 12],
                           [13, 14, 15, 16]])
print("Original Matrix: \n", feature_matrix)

print("Feature Matrix[1]: \n", feature_matrix[1]) #slicing the second row
print("Feature Matrix[1, 2]:\n ", feature_matrix[1, 2]) #slicing the element at row 1, column 2
print("Feature Matrix[:1]: \n", feature_matrix[:1]) #slicing the first row
print("Feature Matrix[:2]: \n", feature_matrix[:2]) #slicing first two rows
print("Feature Matrix[1:3]: \n", feature_matrix[1:3]) #slicing rows 1 and 2 (3 is exclusive)

print("Feature Matrix[:, 2]: \n", feature_matrix[:, 2]) #slicing the third column
print("Feature Matrix[:, 1:3]: \n", feature_matrix[:, 1:3]) #slicing columns 1 and 2 (3 is exclusive)
print("Feature Matrix[1:3, 2:4]: \n", feature_matrix[1:3, 2:4]) #slicing rows 1 and 2 and columns 2 and 3 (4 is exclusive)

print("-"*60)

matrix = np.array([[1, 2, 3, 4],
                   [5, 6, 7, 8],
                   [9, 10, 11, 12],
                   [13, 14, 15, 16]])

row_rank1 = matrix[1, :] #1D array
row_rank2 = matrix[1:2, :] #2D array

print(f"Row with rank 1: \n {row_rank1} shape: {row_rank1.shape}")
print(f"Row with rank 2: \n {row_rank2}\n shape: {row_rank2.shape}")
