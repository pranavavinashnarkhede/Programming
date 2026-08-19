
import java.util.Scanner;

class Assignment34_5
{

//--------------------------------------------------------------------//
// Function Name : StrCatX
// Description   : Concatenates the second string after the first.
// Input         : Two StringBuilder objects
// Output        : Concatenated string
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static void StrCatX(StringBuilder str1 , StringBuilder str2 )
    {
        if(str1 == null || str1.length() == 0 )
        {
            return;
        }

        char cArr[] = str2.toString().toCharArray();

        str1.append(' ');

        for(int i = 0 ; i < cArr.length ; i++)
        {
            str1.append(cArr[i]);
        }

    }

//--------------------------------------------------------------------//
// Application to concatenate two strings.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter any string : ");
        StringBuilder str1 = new StringBuilder(sobj.nextLine());

        System.out.println("Enter any string : ");
        StringBuilder str2 =  new StringBuilder(sobj.nextLine()) ;

        StrCatX(str1 , str2 );

        System.out.println("Result is : "+str1);


    }
}