import pandas as pd

dataset = "student_performance_ml.csv"

df = pd.read_csv(dataset)

print("First 5 records : \n",df.head())

print("Last 5 records : \n",df.tail())

print("Total number of rows and columns : \n",df.shape)

print("List of column names : \n",df.columns)
print(df.dtypes)                # the dtype method gives all the list of datatypes present in csv files