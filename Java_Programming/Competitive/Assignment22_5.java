/*
    Accept number from user and display below pattern.
    Input : 8
    Output : 2 4 6 8 10 12 14 16
*/

import java.util.Scanner;

class Assignment22_5
{
    static void Pattern(int iNo)
    {
        for(int i = 2 ; i <= iNo*2 ; i = i+2)
        {
            System.out.print(i+"\t");

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