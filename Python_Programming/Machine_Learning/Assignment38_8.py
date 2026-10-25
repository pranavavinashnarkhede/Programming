import pandas as pd
import matplotlib.pyplot as plt

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

plt.boxplot(df["Attendance"])

plt.title("Box Plot of Attendance")
plt.ylabel("Attendance")

plt.show()