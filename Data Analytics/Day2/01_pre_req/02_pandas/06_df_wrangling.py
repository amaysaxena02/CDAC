import pandas as pd
import numpy as np

df = pd.read_csv("drinks.csv")

print("-"*60)
print(df.head(3))

print("-"*60)
print(df.sort_values(by="spirit_servings", ascending=False).head()[["country", "spirit_servings", "continent"]])

print("-"*60)
print(df["continent"].value_counts())

print("-"*60)
mask_europe = (df["continent"] == "Europe") & (df["spirit_servings"] > 200)
df_eu = df[mask_europe]
print(df_eu[["country", "spirit_servings", "continent"]])

print("-"*60)
mask_asaf = (df["continent"].isin(["Asia", "Africa"]))
df_asaf = df[mask_asaf]
print(df_asaf)
print("Shape: ", df_asaf.shape)

print("-"*60)