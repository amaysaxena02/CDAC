import numpy as np

inch_measurements = np.array([1.0, 2.5, 5.0, 10.0])
cms_measuresments = inch_measurements * 2.54 #vectorization operation: element-wise multiplication

print("Inches: ", inch_measurements)
print("Centimeters: ", cms_measuresments)

feature_a = np.array([1,2,3,4])
feature_b = np.array([10,20,30,40])

print("-"*60)

print("Feature A: ", feature_a)
print("Feature B: ", feature_b)
print("Sum of features: ", feature_a + feature_b) #vectorization operation: element-wise addition
print("Difference of features: ", feature_b - feature_a) #vectorization operation: element-wise subtraction
print("Product of features: ", feature_a * feature_b) #vectorization operation: element-wise multiplication
print("Ratio of features: ", feature_a / feature_b) #vectorization operation: element-wise division

print("-"*60)

# Algorithm Rigor
rng = np.random.default_rng(seed=42) #random number generator
signal_data = rng.uniform(low=0.0, high=1.0, size=(4,4))
print("Signal Data: \n", signal_data)

# Vectorized mask
mask = signal_data > 0.3
print("Mask: \n", mask)
print("Filtered Signal Data (values > 0.3): \n", signal_data[mask]) #vectorization filtering using boolean mask

print("-"*60)

# data type rigor

int_implicit = np.array([1, 2, 3, 4]) #default data type is int64
int_explicit = np.array([1, 2, 3, 4], dtype=np.int32) #explicitly set data type to int32
print("Implicit int array: ", int_implicit, "Data type: ", int_implicit.dtype)
print("Explicit int array: ", int_explicit, "Data type: ", int_explicit.dtype)

print("-"*60)

# size of items
print("Size of implicit int array: ", int_implicit.itemsize, "bytes")
print("Size of explicit int array: ", int_explicit.itemsize, "bytes")

print("-"*60)

# numpy charactor codes for dtypes