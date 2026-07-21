import schedule
import time

def Display():
    print("Coding Kar..!")

def main():

    schedule.every(30).seconds.do(Display)

    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()