/*
    Accept number from user and display below pattern.
    Input : 4
    Output : # 1 * # 2 * # 3 * # 4 *
*/

import java.util.Scanner;

class Assignment22_4
{
    static void Pattern(int iNo)
    {
        for(int i = 1 ; i <= iNo ; i++)
        {
            System.out.print("#\t"+i+"\t*\t");

        }
        
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0 ;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}