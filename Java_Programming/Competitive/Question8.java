// write a program to print all even numbers upto N .

class Logic 
{
    void printEvenNumbers(int iNo)
    {
        int iCnt = 0 ;

        for(iCnt = 2 ; iCnt <= iNo ; iCnt = iCnt + 2)
        {
            System.out.println(iCnt);
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj. printEvenNumbers(32);
    }
}