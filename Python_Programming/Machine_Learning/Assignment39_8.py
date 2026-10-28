import pandas as pd
from sklearn.model_selection  import train_test_split
from sklearn.tree import DecisionTreeClassifier
import matplotlib.pyplot as plt

from sklearn.metrics import accuracy_score , confusion_matrix 


Datapath = "student_performance_ml.csv"

Border = "-"*80

######################################################################################
#   Step 1 : Dataset loading
######################################################################################

print(Border)
print("Dataset loading")
print(Border)

df = pd.read_csv(Datapath)

print("Dataset loaded successfully")


######################################################################################
#   Step 2 : Data Analysis
######################################################################################

print(Border)
print("Data Analysis")
print(Border)

print("Null Values : \n",df.isnull().sum())

print("Shape of dataset : ",df.shape)

print("Columns names : ",df.columns)

print("Statistical report of dataset : ")
print(df.describe())

######################################################################################
#   Step 3 : Visualisation
######################################################################################

print(Border)
print("Visualisation")
print(Border)

plt.hist(df["StudyHours"])

plt.title("Histogram of Study Hours")
plt.xlabel("Study Hours")
plt.ylabel("No of Students")

plt.grid(True)

plt.show()

######################################################################################
#   Step 4 : Train test split
######################################################################################

print(Border)
print("Train test split")
print(Border)

features = ["StudyHours", "Attendance", "PreviousScore", "AssignmentsCompleted","SleepHours"]

# deciding independent and dependent variables

X = df[features]
Y = df["FinalResult"]

# spliting the dataset for training and testing 

X_train ,X_test ,Y_train ,Y_test = train_test_split(X , Y , test_size=0.2 , random_state=49)

print("X_train : ",X_train.shape)  
print("X_test : ",X_test.shape)     

print("Y_train : ",Y_train.shape)   
print("Y_test : ",Y_test.shape)

######################################################################################
#   Step 5 : Model Training
######################################################################################

print(Border)
print("Model Training")
print(Border)

# create the model object 

model = DecisionTreeClassifier()

model.fit(X_train , Y_train)

######################################################################################
#   Step 6 : Model Prediction
######################################################################################

print(Border)
print("Model Prediction")
print(Border)

predict = model.predict(X_test)

result = pd.DataFrame(
    {
        "Actual": Y_test.values ,
        "Predicted":predict
    }
)

print(result)

######################################################################################
#   Step 7 : Accuracy Calculation
######################################################################################

print(Border)
print("Accuracy Calculation")
print(Border)

accuracy = accuracy_score(Y_test , predict)

print("Accuracy of model is : ",accuracy*100)

######################################################################################
#   Step 8 : Confusion Matrix generation
######################################################################################

print(Border)
print("Confusion Matrix generation")
print(Border)

cm = confusion_matrix(Y_test , predict)

print("Confusion Matrix : \n",cm)

######################################################################################
#   Step 9 : Final conclusion
######################################################################################

print(Border)
print("Final conclusion")
print(Border)


print("Model trained successfully")
print("Testing accuracy : ",accuracy*100)
