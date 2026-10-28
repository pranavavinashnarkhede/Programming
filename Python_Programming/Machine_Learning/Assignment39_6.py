import pandas as pd
from sklearn.model_selection  import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score , confusion_matrix 

Dataset = "student_performance_ml.csv"

df = pd.read_csv(Dataset)

features = ["StudyHours", "Attendance", "PreviousScore", "AssignmentsCompleted","SleepHours"]

# deciding independent and dependent variables

X = df[features]
Y = df["FinalResult"]

# spliting the dataset into training and testing 

X_train , X_test , Y_train , Y_test = train_test_split(X , Y , train_size=0.8 , random_state= 44)

# buliding the model

model = DecisionTreeClassifier(max_depth=None)

# training the model

model.fit(X_train , Y_train)

# testing the model

model_predict = model.predict(X_test)

print("Final Result is : ")
result = pd.DataFrame(
    {
        "Actual" : Y_test,
        "Predicted" : model_predict
    }
)

print(result)

accuracy = accuracy_score(Y_test , model_predict)

print("Accuracy of model is : ",accuracy*100)

cm = confusion_matrix(Y_test , model_predict)
print("Confusion Matrix is : \n",cm)

training_accuracy = model.score(X_train , Y_train)
testing_accuracy = model.score(X_test , Y_test)

print("Training Accuracy is : ",training_accuracy*100)
print("Testing Accuracy is : ",testing_accuracy*100)

# the model is overfitting because the model learn training data to closely and
# perform very well on the training data but perform poorly on new testing data.
