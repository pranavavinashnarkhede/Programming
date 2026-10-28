import pandas as pd
import matplotlib.pyplot as plt

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

plt.hist(df["StudyHours"])          # it draws the histogram

plt.title(" Distribution of Study Hours")
plt.xlabel("Study Hours")
plt.ylabel("Number of students")

plt.show()          # displays the graph