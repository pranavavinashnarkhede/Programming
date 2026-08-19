
import java.util.Scanner;

class Assignment34_4
{

//--------------------------------------------------------------------//
// Function Name : StrCpySmall
// Description   : Copies small characters from one string to another.
// Input         : Source string and StringBuilder
// Output        : String containing small characters
// Author        : Pranav Avinash Narkhede
// Date          : 19-08-2026
//--------------------------------------------------------------------//

    static void StrCpySmall(String str1 , StringBuilder sb )
    {
        if(str1 == null || str1.length() == 0)
        {
            return;
        }

        char cArr[] = str1.toCharArray();

        for(int i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] >= 'a' && cArr[i] <= 'z' || cArr[i] == ' ')
            {
                sb.append(cArr[i]);
            }
        }

    }

//--------------------------------------------------------------------//
// Application to copy small characters from one string into another.
//--------------------------------------------------------------------//

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;
        StringBuilder sb =  new StringBuilder() ;

        System.out.println("Enter any string : ");
        str1 = sobj.nextLine();

        StrCpySmall(str1 , sb );

        System.out.println("Result is : "+sb);


    }
}