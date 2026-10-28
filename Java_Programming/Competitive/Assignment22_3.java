/*
    Accept number from user and display below pattern.
    Input : 5
    Output : 1 * 2 * 3 * 4 * 5 *
*/

import java.util.Scanner;

class Assignment22_3
{
    static void Pattern(int iNo)
    {
        while(iNo != 0)
        {
            System.out.print(iNo+"\t*\t");
            iNo--;
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