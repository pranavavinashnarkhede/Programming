// write a program to display all the factors of a given number.

class Logic 
{
    void displayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);        
            }
            
        }
    }
}

class Question24
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.displayFactors(50);
    }
}