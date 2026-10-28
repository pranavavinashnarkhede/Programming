/*
    Accept N numbers from user and return product of all odd elements.
    
    Input : N : 6
    Elements :15 66 3 70 10 88
    Output : 45

*/


import java.util.Scanner;

class Assignment15_5
{
    public static int Product(int Arr[])
    {
        int iCnt = 0 ;
        int iMult = 1 ;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0 )
            {
                iMult = iMult * Arr[iCnt];
            }
        }
        return iMult;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 ;
        int []p = null;
        int iCnt = 0 ;
        int iRet = 0 ;

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();
   
        p = new int[iSize];

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" element : ");
            p[iCnt] = sobj.nextInt();
        }

        iRet = Product(p);

        System.out.println("Product is : "+iRet);

    }
}