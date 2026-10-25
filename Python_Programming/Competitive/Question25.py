'''
        write a program which accepts marks and display grade
'''

def DisplayGrade(marks):
    if marks >= 75 :
        print("Distinction")
    elif marks >= 60 :
        print("First Class")
    elif marks >= 50 :
        print("Second Class")
    else:
        print("Fail")

def main():
    value = int(input("Enter marks : "))

    DisplayGrade(value)

if __name__ == "__main__":
    main()