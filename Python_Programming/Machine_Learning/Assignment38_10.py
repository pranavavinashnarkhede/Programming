import pandas as pd
import matplotlib.pyplot as plt

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

Pass = df[df["FinalResult"] == 1]
Fail = df[df["FinalResult"] == 0]

plt.scatter(Pass["SleepHours"] ,Pass["FinalResult"] , color = "green" , label = "Pass" )

plt.scatter(Fail["SleepHours"] ,Fail["FinalResult"] , color = "red" , label = "Fail" )

plt.title("Relationship between SleepHours and FinalResult")
plt.xlabel("SleepHours")
plt.ylabel("Final Result")

plt.legend()
plt.grid(True)

plt.show()