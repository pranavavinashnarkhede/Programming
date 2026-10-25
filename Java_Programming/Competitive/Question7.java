// write a program to check whether the number is prime or not.

class Logic 
{
    void checkPrime(int iNo)
    {
        int iCnt = 0 ;
        boolean bFlag = true;

        for(iCnt = 2 ; iCnt < iNo ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println(iNo +" is prime number ");
        }
        else
        {
            System.out.println(iNo +" is not prime number ");
        }

    }
}

class Question7
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.checkPrime(11);
    }
}