class Demo:
    value = 10 

    def __init__(self , first , second):
        self.no1 = first 
        self.no2 = second 

    def Fun(self):
        print("No1 : ",self.no1)
        print("No2 : " ,self.no2)

    def Gun(self):
        print("No1 : ",self.no1)
        print("No2 : ",self.no2)

def main():

    obj1 = Demo(11,21)
    obj2 = Demo(51,101)

    obj1.Fun()
    obj2.Gun()
    obj1.Gun()
    obj2.Gun()

if __name__ == "__main__":
    main()
