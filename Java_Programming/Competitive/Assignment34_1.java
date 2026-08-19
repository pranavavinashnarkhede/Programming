
import java.util.Scanner;

class Assignment34_1
{

//--------------------------------------------------------------------//
// Function Name : StrCpyX
// Description   : Copies the contents of one string into another.
// Input         : String and StringBuilder
// Output        : Copied string
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static void StrCpyX(String str , StringBuilder sb)
    {
        if( str == null || str.length() == 0)
        {
            System.out.println("Please provide valid string");
            return ;
        }

        char cArr[] = str.toCharArray();

        for(int i = 0 ; i < cArr.length ; i++)
        {
            sb.append(cArr[i]);
        }

    }

//--------------------------------------------------------------------//
// Application to copy the contents of one string into another.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        StringBuilder sb = new StringBuilder();         // stringbuilder is mutable so change made in stringbulider is visible in main

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        StrCpyX(str , sb);

        System.out.println("Copied string is : "+sb);

    }
}