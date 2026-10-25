import schedule
import time

def DisplayLunch():
    print("Lunch Time ..")

def DisplayWrapup():
    print("Wrap up work..")

def main():

    schedule.every().day.at("01:00").do(DisplayLunch)
    schedule.every().day.at("06:00").do(DisplayWrapup)

    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()