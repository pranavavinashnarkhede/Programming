/*
    Write a program which accept width & height of rectangle from user and calculate
    its area. (Area = Width * Height)

    Input : 5.3 9.78
    Output : 51.834
*/


import java.util.Scanner;

class Assignment8_2
{
    static double RectArea(float fWidth , float fHeight)
    {
        double dArea = 0.0 ;

        dArea = fWidth * fHeight ;

        return dArea;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fValue1 = 0.0f ;
        float fValue2 = 0.0f ;
        double dRet = 0 ;

        System.out.println("Enter width : ");
        fValue1 = sobj.nextFloat();

        System.out.println("Enter height : ");
        fValue2 = sobj.nextFloat();


        dRet = RectArea(fValue1 , fValue2);

        System.out.println("Area of Rectangle is : "+dRet);

    }

}