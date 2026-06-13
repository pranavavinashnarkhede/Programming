// write a program to print all odd numbers upto N .

class Logic 
{
    void printOddNumbers(int iNo)
    {
        int iCnt = 0 ;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt = iCnt + 2)
        {
            System.out.println(iCnt);
        }
    }
}

class Question9
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj. printOddNumbers(31);
    }
}