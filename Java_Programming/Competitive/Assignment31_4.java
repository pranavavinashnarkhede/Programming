/*
   Write a program which accept string from user and check whether
    it contains vowels in it or not.

    Input : “marvellous”

    Output : TRUE

    Input : “Demo”

    Output : TRUE

*/

import java.util.Scanner;

class Assignment31_4
{
    static boolean Difference(String str)
    {
        char cArr[] = str.toCharArray();              
        int i = 0 ;

        for(i = 0 ; i < cArr.length ; i++)
        {
            if(cArr[i] == 'a' || cArr[i] == 'e' || cArr[i] == 'i' || cArr[i] == 'o' || cArr[i] == 'u' 
              || cArr[i] == 'A' || cArr[i] == 'E' || cArr[i] == 'I' || cArr[i] == 'O' || cArr[i] == 'U')
            {
                break;
            }  
        }
        
        if(i < cArr.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter any string : ");
        str = sobj.nextLine();

        System.out.println(Difference(str));

    }
}