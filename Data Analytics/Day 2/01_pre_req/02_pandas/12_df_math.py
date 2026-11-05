import pandas as pd
import numpy as np

df_orders = pd.DataFrame({
    'item_A': [2,1,4],
    'item_B': [0,3,1],
    'item_C': [5,2,0]
}, index=['Oreder_1', 'Order_2', 'Order_3'])

print(df_orders)
print("="*60)

print(df_orders.T)
print("="*60)


# Unit Prices Series
s_prices = pd.Series([10.0,25.0,5.0], index=["item_A","item_B","item_C"])

# Matrix-Vector Dot product (Order Totals)
df_totals = df_orders.dot(s_prices)
print(df_totals)
print("="*60)

df_metrics = pd.DataFrame({
    "A": np.random.randint(1,100,5),
    "B": np.random.randint(1,100,5),
    "category": ["Tech", "Finance", "Tech", "Health", "Finance"]
})
print(df_metrics)
print("="*60)

# Vectorized column assignment via eval()
df_metrics.eval("C = A * 2 + B", inplace=True)
print("|============={Evaluated Dataframe (eval())}============|")
print(df_metrics)
print("="*60)

filtered_df = df_metrics.query("C > 100 and category == 'Tech' and A > 50")
print("|============={Queried Dataframe (query())}============|")
print(filtered_df)
print("="*60)

# Illustration 3
np.random.seed(42)
df_time_series = pd.DataFrame({
    'daily_sales': [100,120,115,130,125,140,150,160,155,170],
})

# 3-Day moving average
df_time_series['3D_moving_avg'] = df_time_series['daily_sales'].rolling(window=3).mean()

# Cumulative Running total
df_time_series['running_total'] = df_time_series['daily_sales'].expanding(min_periods=1).sum()

print("|============={Time Series Dataframe}============|")
print(df_time_series)
print("="*60)

# Illustration 4
df_finance = pd.DataFrame({
    'close_price': [100.0, 102.0, 101.0, 105.0, 107.0]
})

# Lag price by 1 period 
df_finance['prev_price'] = df_finance['close_price'].shift(1)

# Calculate percentage change
df_finance['daily_return%'] = df_finance['close_price'].pct_change() * 100

# Rank daily performance
df_finance['rank'] = df_finance['daily_return%'].rank(ascending=False)

print("|============={Finance Dataframe}============|")
print(df_finance)