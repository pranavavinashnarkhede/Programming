import schedule
import sys
import os
import time 
import datetime

def MonitorSize(File_Path):

    ret = CheckFileExist(File_Path)

    if ret == False:
        print("File Size Monitor Error : The file does not exists")
        return 

    else:

        if(os.path.exists("FileSizeLog.txt")):                                      # check whether the file already exists .
            fobj = open("FileSizeLog.txt" , "a")                                    # if exists the open file in append mode

        else:
            fobj = open("FileSizeLog.txt" , "w")                                    # if not then create and open an file in write mode

        c_time = datetime.datetime.now()

        fobj.write(f"File Path : {File_Path}\n")                                    # adding info into log file
        fobj.write(f"File size : {os.path.getsize(File_Path)} bytes \n")
        fobj.write(f"Date and Time : {c_time} \n")

        fobj.close()                                                                # closing the file 
    
    print("Waiting for next schedule....")


def CheckFileExist(File_Path):                                                      # check whether the entered path is valid or not
    ret = False

    ret = os.path.exists(File_Path)
    if ret == True:
        ret = os.path.isfile(File_Path)

    return ret

def main():
    if(len(sys.argv) == 2):

        print("File Size Monitoring Application is Running")
        schedule.every(30).seconds.do(MonitorSize , sys.argv[1])                    # schedule the task 

        while True:
            schedule.run_pending()                                                 
            time.sleep(1)
    else:
        print("Invalid number of arguments")
        print("Please run program as :")
        print("python filename.py filepath ")


if __name__ =="__main__":
    main()