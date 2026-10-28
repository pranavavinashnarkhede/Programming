# write a program which accepts a file name from the user and display the contents of the file line by line on the screen

import sys
import os
try:
    filename = sys.argv[1]

    if(os.path.exists(filename)):
        fobj = open(filename , "r")

        data = 0

        while True:
            data = fobj.readline()

            if data == "":
                break 
            else:
                print(data)
            
            

        fobj.close()

    else:
        print("File is not present in current directory")

except Exception as eobj:
    print("Exception occured : ",eobj)