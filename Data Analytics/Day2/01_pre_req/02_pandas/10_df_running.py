lazy import numpy as np
lazy import pandas as pd

np.random.seed(42)

dates = pd.date_range(start="2026-01-01", periods=100, freq="D")
prices = 150 + np.random.randn(100)

df_stock = pd.DataFrame({"Date": dates, "Close": prices}).set_index("Date")
print(df_stock.head())
print("-"*60)

# Rolling Window
df_stock["7D_MA"] = df_stock["Close"].rolling(window=7).mean()
df_stock["7D_STD"] = df_stock["Close"].rolling(window=7).std()
print(df_stock.head(10))
print("-"*60)
