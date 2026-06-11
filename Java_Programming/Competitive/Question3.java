// write a program to check whether the number is palindrome or not 

class Logic
{
    void CheckPalindrome(int iNo)
    {
        int iTemp = 0 , iDigit = 0 , iReverse = 0;

        iTemp = iNo ;
        while(iTemp != 0 )
        {
            iDigit = iTemp % 10 ;
            iReverse = iReverse * 10 + iDigit ;
            iTemp = iTemp / 10 ;
        }

        if(iNo == iReverse)
        {
            System.out.println(iNo+" is palindrome");
        }
        else
        {
            System.out.println(iNo+" is not palindrome");
        }
    }
}

class Question2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);

    }
}