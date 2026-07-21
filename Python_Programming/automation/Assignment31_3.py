import schedule 
import sys
import os
import time
import datetime

def ScanDirectory(Directory_Name):

    ret = CheckDirectory(Directory_Name)

    if ret == False:
        print("Directory Scan Error : The Directory Does not Exists")

    else:
        total_subfolder = 0 
        total_files = 0 

        for FolderName , SubFolder , FileName in os.walk(Directory_Name):
            for folder in SubFolder:
                total_subfolder = total_subfolder +1
            
            for file in FileName:
                total_files = total_files + 1
        
        timestamp = datetime.datetime.now()
        final_time = timestamp.strftime("%d-%m-%Y %I-%M-%S %p")
        final_time = final_time.replace("-" , "_")
        
        print("Directory Scanned : ",Directory_Name)
        print("Total Files : ",total_files)
        print("Total Subdirectories : ",total_subfolder)
        print("Scan Time : ",final_time )

        print("Waiting for next schedule ...")

def CheckDirectory(Directory_Name):
    ret = False

    ret = os.path.exists(Directory_Name)

    if ret == True:
        ret = os.path.isdir(Directory_Name)

    return ret

def main():
    if (len(sys.argv) == 2):

        print("Directory Scan Application is Running....")

        schedule.every().minutes.do(ScanDirectory , sys.argv[1])

        while True:
            schedule.run_pending()
            time.sleep(1)

    else:
        print("Invalid number of arguments")
        print("Please run program as :")
        print("python filename.py DirectoryName ")


if __name__ == "__main__":
    main()