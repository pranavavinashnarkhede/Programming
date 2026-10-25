'''
        write a program which accepts one character and check whether it is vowel or consonant

        Input : a
        Output : Vowel
'''

def ChkCharacter(Ch):
    if (    Ch == "a" or Ch == "e" or Ch == "i" or Ch == "o" or Ch == "u"
            or Ch == "A" or Ch == "E" or Ch == "I" or Ch == "O" or Ch == "U"
        ):
        return True
    else:
        return False

def main():
    value = input("Enter Character : ")

    Ret = ChkCharacter(value)

    if Ret == True:
        print("It is Vowel")
    else:
        print("It is Consonant")


if __name__ == "__main__":
    main()