// write a program to print all the numbers from 1 to N that are divisible by both 2 and 3 .

class Logic 
{
    void printDivisibleBy3and5(int iNo)
    {
        int iCnt = 0  ;

        for(iCnt = 1 ; iCnt <= iNo ;  iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
           
        }

    }
}

class Question26
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printDivisibleBy3and5(40);
    }
}