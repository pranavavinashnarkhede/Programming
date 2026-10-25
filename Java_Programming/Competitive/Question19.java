// write a program to check whether the number is perfect number or not .

class Logic 
{
    void checkPerfect(int iNo)
    {
        int iCnt = 0  , iSumFactors = 0;

        for(iCnt = 1 ; iCnt <= iNo/2 ; iCnt++)
        {
            if((iNo % iCnt) == 0 )
            {
                iSumFactors = iSumFactors + iCnt;
            }
        }

        if(iSumFactors == iNo)
        {
            System.out.println("The entered number is perfect number");
        }
        else
        {
            System.out.println("The entered number is not perfect number");
        }
       

    }
}

class Question19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPerfect(6);
    }
}