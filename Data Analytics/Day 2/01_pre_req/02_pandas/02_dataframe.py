import numpy as np
import pandas as pd

df_football = pd.DataFrame({
    "name": ["Lionel Messi", "Cristiano Ronaldo", "Neymar", "Kylian Mbappe", "Erling Haaland"],
    "age": [39, 41, 34, 27, 26],
    "gender": ["Male", "Male", "Male", "Male", "Male"]
})

print("|=========={In-Memory Dataframe}==========|")
print(df_football)

print("-"*60)

print("Extract the ae column as Series: ")
age_series = df_football["age"]
print(age_series)
print(type(age_series))

print("-"*60)

print("Describe age column: \n", age_series.describe())
print("Info abouth the Dataframe: ", df_football.info())
print("Shape of the Dataframe: ", df_football.shape)
print("Data type of a column: ", df_football["age"].dtype)