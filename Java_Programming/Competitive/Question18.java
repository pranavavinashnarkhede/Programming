// write a program to print numbers from N down to 1 in reverse order .

class Logic 
{
    void printReverse(int iNo)
    {
        int iCnt = 0  ;

        for(iCnt = iNo ; iCnt >= 1 ;  iCnt--)
        {
            System.out.println(iCnt);
        }

    }
}

class Question18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printReverse(10);
    }
}