// write a program to find the sum of even numbers upto N .

class Logic 
{
    void sumEvenNumbers(int iNo)
    {
        int iCnt = 0 , iSum = 0 ;

        for(iCnt = 2 ; iCnt <= iNo ; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iSum = iSum + iCnt ; 
            }
        }

        System.out.println("Sum is : "+iSum);
       
    }
}

class Question17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.sumEvenNumbers(10);
    }
}