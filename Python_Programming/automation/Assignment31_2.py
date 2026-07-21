import schedule 
import sys
import time

def DisplayMessage(message):
    print(message)

def main():
    if (len(sys.argv) == 2):

        message = sys.argv[1]
        schedule.every(5).seconds.do(DisplayMessage , message)

        while True:
            schedule.run_pending()
            time.sleep(1)

    else:
        print("Invalid number of arguments")
        print("Please run program as :")
        print("python filename.py TextToDisplay ")


if __name__ == "__main__":
    main()