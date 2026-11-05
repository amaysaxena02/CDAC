import pandas as pd
import numpy as np

df_drinks = pd.read_csv("drinks.csv")

print(df_drinks.info())

print("-"*60)

print("Index Object\n", df_drinks.index)

print("-"*60)

print("Column Names\n", df_drinks.columns)

print("-"*60)

print("Data types\n", df_drinks.dtypes)

print("-"*60)

print("Shape: ", df_drinks.shape, "\nAxes: ", df_drinks.axes)

print("-"*60)

print(df_drinks.describe().T[["mean", "std", "min", "max"]])

print("-"*60)

df_subset = df_drinks[["country", "total_litres_of_pure_alcohol", "continent"]].copy()
print(df_subset.head(3))

print("-"*60)

df_subset["status"] = "Evaluated"
print(df_subset.head(3))

print("-"*60)

df_subset.insert(1, "region_category", value="Standard market")
print(df_subset.head(3))

print("-"*60)

df_subset["boosted_litres"] = df_subset["total_litres_of_pure_alcohol"].add(2.5)
print(df_subset.head(3))

print("-"*60)