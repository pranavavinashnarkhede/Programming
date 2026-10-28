# write a program which accepts a file name from the user and checks whether that file exists in the current directory or not.

import sys
import os

try:
    filename = sys.argv[1]

    if(os.path.exists(filename)):
        print(f"{filename} is exist in the current directory")
    else:
        print(f"{filename} is not exist in the current directory")

except Exception as eobj :
    print("Exception occured : ",eobj)