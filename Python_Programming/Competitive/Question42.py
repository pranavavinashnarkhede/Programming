'''
        write a lambda function using filter() which accepts a list of strings and return a list having lenght greater than 5
'''

ChkLength = lambda text : len(text) > 5 

def main():
    size = int(input("Enter number of elements : "))

    string = list()

    for i in range(size):
        text = input("Enter string : ")
        string.append(text)

    Ret = list(filter(ChkLength , string))

    print(Ret)

if __name__ == "__main__":
    main()