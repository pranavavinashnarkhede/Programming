/*
    Write a program which accept temperature in Fahrenheit and convert it into
    celsius. (1 celsius = (Fahrenheit -32) * (5/9))

    Input : 10
    Output : -12.2222 (10 - 32) * (5/9)
*/


import java.util.Scanner;

class Assignment8_4
{
    static double FhtoCs(float fValue)
    {
        double dRet = 0.0;

        dRet = ((fValue - 32) * (5.0/9.0));
        return dRet;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fValue = 0.0f ;
        double dRet = 0.0 ;

        System.out.println("Enter temperature in Fahrenheit : ");
        fValue = sobj.nextFloat();

        dRet = FhtoCs(fValue );

        System.out.println("Temperature in Celsius is : "+dRet);

    }

}