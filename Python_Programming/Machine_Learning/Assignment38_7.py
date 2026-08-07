import pandas as pd
import matplotlib.pyplot as plt

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

Pass = df[df["FinalResult"] == 1]

Fail = df[df["FinalResult"] == 0]

plt.scatter(Pass["StudyHours"] , Pass["PreviousScore"], color = "green" , label = "Pass")          # it draws the scatter plot

plt.scatter(Fail["StudyHours"] , Fail["PreviousScore"], color = "red" , label = "Fail")          # it draws the scatter plot


plt.title("Study Hours vs Previous Score ")
plt.xlabel("Study Hours")
plt.ylabel("Number of students")

plt.legend()                # it display pass color and fail color
plt.grid(True)      # it displays horizontal and vertical rows

plt.show()          # displays the scatter plot