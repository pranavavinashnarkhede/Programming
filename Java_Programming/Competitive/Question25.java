// write a program to count total number of factors of a given number .

class Logic 
{
    void countFactors(int iNo)
    {
        int iCnt = 0 , iCounter = 0 ;;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iCounter++;      
            }
            
        }

        System.out.println("Number of factors : "+iCounter);  
    }
}

class Question25
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.countFactors(20);
    }
}