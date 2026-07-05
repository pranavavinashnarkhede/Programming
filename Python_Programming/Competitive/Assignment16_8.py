'''
        write a program which accept number from user and print that number of "*" on screen.
'''

def Display(No):
    for i in range(No):
        print("*")

def main():
    value = int(input("Enter number : "))

    Display(value)

if __name__ == "__main__":
    main()