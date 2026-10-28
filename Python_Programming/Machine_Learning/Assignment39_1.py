import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier


Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

print("Columns names : ",df.columns)

# deciding independent and dependent variables

feature_cols= ["StudyHours", "Attendance", "PreviousScore", "AssignmentsCompleted","SleepHours" ]

X = df[feature_cols]
Y = df["FinalResult"]

print("X shape : ",X.shape)
print("Y shape : ",Y.shape)

# spliting the dataset into training and testing

X_train , X_test , Y_train , Y_test = train_test_split(X, Y , test_size=0.2 , random_state = 45)

print("Shape of X_train : ",X_train.shape)
print("Shape of X_test : ",X_test.shape)

print("Shape of Y_train : ",Y_train.shape)
print("Shape of Y_test : ",Y_test.shape)

# build the model

model = DecisionTreeClassifier()

# train the model

model.fit(X_train , Y_train)

print("Model trained successfully")