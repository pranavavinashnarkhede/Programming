import sys
import os
import schedule
import datetime
import time
import shutil

def FileBackup(Source_path , Destination_path):
    
    border = "="*70

    ret = False 
    ret = ValidateSourcePath(Source_path)

    if ret == False:
        print("File Backup Error : The Source path does not exists")
        return

    ret = ValidateSourceFile(Source_path)
    
    if ret == False:
        print("File Backup Error : The entered source path is invalid")
        return

    ret = ValidateDestinationPath(Destination_path)
    if ret == False:
        print("File Backup Error : The destination path does not exists")
        return

    ret = ValidateDestinationDirectory(Destination_path)
    if ret == False:
        print("File Backup Error : The entered path is not an directory")
        return

    timestamp = GenerateTimestamp()

    b_name = GenerateBackupName(timestamp , Source_path)

    Complete_path = CopyFile(Destination_path, Source_path , b_name)

    WriteLog(Destination_path , Source_path ,Complete_path, timestamp , border)

    DisplaySuccess()

    
def ValidateSourcePath(Source_path):

    ret = os.path.exists(Source_path)
    return ret 


def ValidateSourceFile(Source_path):
        
    ret = os.path.isfile(Source_path)

    return ret 
        

def ValidateDestinationPath(Destination_path):
    
    ret = os.path.exists(Destination_path)
    return ret
            
def ValidateDestinationDirectory(Destination_path):
    ret = os.path.isdir(Destination_path)
    return ret
         

def GenerateTimestamp():
        timestamp = datetime.datetime.now()
        timestamp = timestamp.strftime("%d-%m-%Y %I-%M-%S %p")
        timestamp = timestamp.replace(" ","_")
        timestamp = timestamp.replace("-","_")

        return timestamp

def GenerateBackupName(timestamp , Source_path):
    filename = os.path.basename(Source_path)
    name , extension = os.path.splitext(filename)

    filename = f"{name}_{timestamp}{extension}"

    return filename

def CopyFile(Destination_path , Source_path ,filename):

    complete_path = os.path.join(Destination_path , filename)
    shutil.copy2(Source_path , complete_path)

    return complete_path

def WriteLog(Destination_path , Source_path , complete_path , timestamp  , border):
    log_file = os.path.join(Destination_path , "backup_log.txt")
    fbackup = open(log_file,"a")
    fbackup.write(border+"\n")
    fbackup.write(f"Source File :  {Source_path} \n")
    fbackup.write(f"Backup File :  {complete_path} \n ")
    fbackup.write(f"Backup Time : { timestamp} \n ")
    fbackup.write(f"Backup Size : {os.path.getsize(complete_path)} bytes \n")
    fbackup.write(border+"\n")

    fbackup.close()

def DisplaySuccess():

    print("Backup Successful")
    print("Waiting for next schedule ....")


def main():
    if(len(sys.argv) == 3):

        border = "="*70

        print(border+"\n")
        print("Marvellous Backup Utility")
        print(border+"\n")

        schedule.every().minutes.do(FileBackup ,sys.argv[1] , sys.argv[2])

        print("Backup Started......")
        print("Press CTRL + C to stop...")


        while True:
            schedule.run_pending()
            time.sleep(1)

    else:
        print("Please enter the path of destination directory path after file name")



if __name__ == "__main__":
    main()