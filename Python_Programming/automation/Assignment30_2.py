import schedule 
import datetime
import time

def DisplayTime():
    current_time = datetime.datetime.now()
    print(current_time.strftime("%d-%m-%Y %I-%M-%S %p"))
def main():

    schedule.every(1).minutes.do(DisplayTime)

    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()