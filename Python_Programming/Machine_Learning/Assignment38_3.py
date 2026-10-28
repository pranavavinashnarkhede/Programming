import pandas as pd

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

print(f"Average StudyHours : {(df["StudyHours"]).mean():.3f}")           # mean is function to calculate the average

print(f"Average Attendance : {(df["Attendance"]).mean():.3f}")

print("Maximum PreviousScore : ",(df["PreviousScore"]).max())

print("Minimum SleepHours : ",(df["SleepHours"]).min())

