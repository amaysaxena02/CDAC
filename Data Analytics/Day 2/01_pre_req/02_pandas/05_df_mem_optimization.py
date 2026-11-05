import pandas as pd
import numpy as np

# Setting up expicit index column on load
df_indexed = pd.read_csv("drinks.csv", index_col="country")
print(df_indexed.head())

print("-"*60)

# Look at ram footprint
mem_original_surface = df_indexed.memory_usage().sum()
print("Original memory used: ", mem_original_surface)
mem_original_element_level = df_indexed.memory_usage(deep=True).sum()
print("Original memory used: ", mem_original_element_level)

print("-"*60)

print(df_indexed.info())

print("-"*60)

print("{0:35}{1:15}{2:15}{3:<15}{4:<15}".format("Column Name", "Min", "Max", "Type", "Can hold"))
print("-"*100)
for col in df_indexed.select_dtypes(include=[np.number]).columns:
    dt = df_indexed[col].dtype
    max_can_hold = np.iinfo(dt).max if np.issubdtype(dt, np.integer) else np.finfo(dt).max
    print("{0:<35}{1:<15}{2:<15}{3:<15}{4:<15}".format(col.capitalize(), 
                                                    df_indexed[col].min(), 
                                                    df_indexed[col].max(),
                                                    dt.__str__(),
                                                    max_can_hold
                                                    ))
    
print("-"*60)

# Downcasting
df_optimized = df_indexed.copy()
for col in df_optimized.select_dtypes(include=["int64"]).columns:
    dt = df_optimized[col].dtype
    cast_to_str = "integer" if np.issubdtype(dt, np.integer) else "float"
    df_optimized[col] = pd.to_numeric(df_optimized[col], downcast=cast_to_str)

print("-"*60)

print(df_optimized.info())

print("-"*60)

mem_original_surface = df_optimized.memory_usage().sum()
print("Original memory used: ", mem_original_surface)
mem_original_element_level = df_optimized.memory_usage(deep=True).sum()
print("Original memory used: ", mem_original_element_level)