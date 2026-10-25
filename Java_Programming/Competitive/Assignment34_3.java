
import java.util.Scanner;

class Assignment34_3
{

//--------------------------------------------------------------------//
// Function Name : StrCpyCap
// Description   : Copies capital characters from one string to another.
// Input         : Source string and StringBuilder
// Output        : String containing capital characters
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static void StrCpyCap(String str1 , StringBuilder sb )
    {
        if(str1 == null || str1.length() == 0)
        {
            return;
        }

        char cArr[] = str1.toCharArray();

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'A' && cArr[i] <= 'Z')
            {
                sb.append(cArr[i]);
            }
        }

    }
    
//--------------------------------------------------------------------//
// Application to copy capital characters from one string into another.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;
        StringBuilder sb =  new StringBuilder() ;

        System.out.println("Enter any string : ");
        str1 = sobj.nextLine();

        StrCpyCap(str1 , sb );

        System.out.println("Result is : "+sb);


    }
}