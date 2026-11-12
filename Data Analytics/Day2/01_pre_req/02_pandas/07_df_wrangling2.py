import pandas as pd
import numpy as np

df = pd.read_csv("titanic.csv")

print("-"*60)
print(df.head(3))

print("-"*60)
print(df.isna().sum())

print("-"*60)
df["Age_Imputed"] = df["Age"].fillna(df["Age"].median())
df["Cabin_filled"] = df["Cabin"].fillna("Unknown")
print(df.isna().sum())

print("-"*60)
print(df.head()[["Age", "Age_Imputed", "Cabin", "Cabin_filled"]])

print("-"*60)
df_cleaned = df.copy()
df_cleaned["Age"] = df_cleaned["Age_Imputed"]
df_cleaned["Cabin"] = df_cleaned["Cabin_filled"]
df_cleaned = df_cleaned.drop(columns=["Age_Imputed", "Cabin_filled"])
print(df_cleaned.head())
print(df_cleaned.info())