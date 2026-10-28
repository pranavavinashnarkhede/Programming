import pandas as pd

dataset = "student_performance_ml.csv"

df = pd.read_csv(dataset)

print("Total number of students in dataset :\n ",df.value_counts().sum())

print("Total number of student passed : \n",(df["FinalResult"] == 1).sum())

print("Total number of student failed : \n",(df["FinalResult"] == 0).sum())

