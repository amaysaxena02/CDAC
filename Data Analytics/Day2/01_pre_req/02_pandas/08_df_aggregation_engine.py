import pandas as pd
import numpy as np

df_drinks = pd.read_csv("drinks.csv")
print(df_drinks.head())
print("-"*60)

# Split-apply-combine workflow
continent_stats = df_drinks.groupby("continent").agg(
    avg_beer = ("beer_servings", "mean"),
    max_wine = ("wine_servings", "max"),
    total_pure_alcohol = ("total_litres_of_pure_alcohol", "sum"),
    country_count = ("country", "count")
)

print("{+}=========={Continental drink aggregate}=========={+}")
print(continent_stats)

continent_stats_2 = df_drinks.groupby("continent").agg({
    "beer_servings" : ["mean", "max", "std"],
    "wine_servings" : ["sum"],
    "country" : ["count"]
})

print("{+}=========={Continental drink aggregate 2}=========={+}")
print(continent_stats_2)