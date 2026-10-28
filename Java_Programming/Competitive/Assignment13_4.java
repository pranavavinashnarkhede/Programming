/*
    Accept N numbers from user and display all such elements which are
    divisible by 3 and 5.
    Input : N : 6

    Elements :85 66 3 15 93 88

    Output : 15
*/


import java.util.Scanner;

class Assignment13_4
{

    public static void Display(int Arr[])
    {
        
        int iCnt = 0 ;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] % 3 == 0) && (Arr[iCnt] % 5 == 0))
            {
                System.out.print(Arr[iCnt]+"\t");
            }
            
        }

    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int iCnt = 0 ;
        int []p = null;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" Element : ");
            p[iCnt] = sobj.nextInt();
        }

        Display(p);
    }

}