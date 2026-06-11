// write a program to print multiplication table of a number .

class Logic 
{
    void printTable(int iNo)
    {
        int iCnt = 0 ;

        System.out.println("Table : ");
        for(iCnt = 1 ; iCnt <= 10 ; iCnt++)
        {
            System.out.println(iNo*iCnt);
        }
    }
}

class Question5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printTable(11 );
    }
}