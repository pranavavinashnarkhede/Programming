// write a program to calculate power of number using loop .

class Logic 
{
    void calculatePower(int base , int exp)
    {
        int iCnt = 0 ;
        int iPower = 1 ;

        for(iCnt = 0 ; iCnt < exp ; iCnt++)
        {
            iPower = base * iPower ; 
        }

        System.out.println("Power is : "+iPower);
       
    }
}

class Question5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.calculatePower(4,5);
    }
}