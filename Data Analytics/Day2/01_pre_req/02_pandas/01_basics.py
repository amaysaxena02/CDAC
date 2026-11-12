import pandas as pd
import numpy as np

#instantiating an empty series 
empty_s = pd.Series(dtype=np.float64) #empty series with float64 data type
print("Empty Series: \n", empty_s)

# String payload (object)
players = ["Messi", "Ronaldo", "Neymar", "Mbappe", "Lewandowski"]
players_s = pd.Series(players, name='Players')
print("\n|========={String Series}========|")
print(players_s)

print("="*60)

# Integer Payload
scores = [10, 9, 8, 7, 6]
scores_s = pd.Series(scores, name='Scores')
print("\n|========={Integer Series}========|")
print(scores_s)

print("="*60)

# Boolean Payload
flags = [True, False, True, False, True]
flags_s = pd.Series(flags, name='Flags')
print("\n|========={Boolean Series}========|")
print(flags_s)