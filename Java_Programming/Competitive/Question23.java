// write a program to count how many even and odd numbers are present between 1 to N .

class Logic 
{
    void countEvenOddRange(int iNo)
    {
        int iCountEven = 0 , iCountOdd = 0 , iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }

        System.out.println("Count of even numbers is : " + iCountEven);
        System.out.println("Count of odd numbers is : " + iCountOdd);

    }
}

class Question23
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countEvenOddRange(50);
    }
}