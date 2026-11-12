import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

cricket_stats = {
    "cricketers": [
        "Virat Kohli",
        "Rohit Sharma",
        "MS Dhoni",
        "Sachin Tendulkar",
        "AB de Villiers",
        "Chris Gayle",
        "Kane Williamson",
        "Joe Root",
        "Babar Azam",
        "Shubman Gill"
    ],
    "fifties": [
        139, 110, 108, 164, 53,
        88, 73, 63, 35, 22
    ],
    "hundreds": [
        84, 50, 16, 100, 47,
        42, 33, 33, 31, 16
    ]
}

df_cricket = pd.DataFrame(cricket_stats)
print(df_cricket)
print("-"*60)

df_cricket.style.set_properties(subset=["cricketers"], **{"text-align": "left"})
print(df_cricket)
print("-"*60)


# Unpivot the dataframe
df_long = df_cricket.melt(id_vars="cricketers", var_name="Score Type", value_name="Count")
print(df_long)
print("-"*60)


# Visualization
plt.figure(figsize=(10,5))
sns.barplot(x="cricketers", y="Count", hue="Score Type", data=df_long)
plt.legend(title="Score Type")
plt.xticks(rotation=45, ha="right")
plt.xlabel("Cricketers")
plt.ylabel("Score Count")
plt.title("Cricket performance: Fifties VS Hundreds")
plt.tight_layout()
plt.show()