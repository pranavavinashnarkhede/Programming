import schedule
import time
import datetime
import os

def WriteDateTime():

    ret = False

    ret = os.path.exists("Marvellous.txt")

    if ret == False:
        fobj = open("Marvellous.txt" , "w")

    else:
        fobj = open("Marvellous.txt","a")

        ctime = datetime.datetime.now()
        ctime = ctime.strftime("%d-%m-%Y %I-%M-%S %p")

        fobj.write(f" Task executed at : {ctime} \n")


def main():

    schedule.every(5).minutes.do(WriteDateTime)

    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()