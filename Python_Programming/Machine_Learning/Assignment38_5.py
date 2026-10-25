import pandas as pd

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

# average study hours
study_hours = df.groupby("FinalResult")["StudyHours"].mean()

# average attendace
attendance = df.groupby("FinalResult")["Attendance"].mean()             # the groupby groups according to final result

print(study_hours)
print(attendance)