import pandas as pd

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

Result_count = df["FinalResult"].value_counts()

print("Distribution of final Result ")
print(Result_count)

total_students = len(df)

total_pass = Result_count[1]
total_fail = Result_count[0]

Pass_Percent = (total_pass / total_students) * 100
Fail_Percent = (total_fail / total_students) * 100

print("Pass Percentage : ",Pass_Percent)
print("Fail Percentage : ",Fail_Percent)