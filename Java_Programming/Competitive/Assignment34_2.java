
import java.util.Scanner;

class Assignment34_2
{
//--------------------------------------------------------------------//
// Function Name : StrNCpyX
// Description   : Copies specified characters from one string to another.
// Input         : Source string, StringBuilder, and number of characters
// Output        : Copied string
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static void StrNCpyX(String str1 , StringBuilder sb , int iSize)
    {
        if( str1 == null || str1.length() == 0)
        {
            return ;
        }

        if(iSize > str1.length())
        {
            iSize = str1.length();
        }

        char cArr[] = str1.toCharArray();

        for(int i = 0 ; i < iSize ; i++)
        {
            sb.append(cArr[i]);
        }

    }
    
//--------------------------------------------------------------------//
// Application to copy specified characters from one string into another.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;
        StringBuilder sb = new StringBuilder();
        int iSize = 0 ;

        System.out.println("Enter any string : ");
        str1 = sobj.nextLine();

        System.out.println("Enter how many characters you want to copy : ");
        iSize = sobj.nextInt();

        StrNCpyX(str1 , sb, iSize);

        System.out.println("Result is : "+sb);
    }
}