/*
    Write a program which accept radius of circle from user and calculate its area.
    Consider value of PI as 3.14. (Area = PI * Radius * Radius)
    
    Input : 5.3
    Output : 88.2026
*/


import java.util.Scanner;

class Assignment8_1
{
    static double CircleArea(float fRadius)
    {
        double dArea = 0.0 ;
        double PI = 3.14 ;

        dArea = PI * fRadius * fRadius ;

        return dArea;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fValue = 0.0f ;
        double dRet = 0.0 ;

        System.out.println("Enter Radius : ");
        fValue = sobj.nextFloat();

        dRet = CircleArea(fValue);

        System.out.println("Area of circle is : "+dRet);

    }

}