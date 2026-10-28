//////////////////////////////////////////////////////////////////////////////////
//
// Include required header files 
//
//////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

//////////////////////////////////////////////////////////////////////////////////
//
//  Function name : AddTwoNumbers
//  Input :         float , float
//  Output :        float
//  Description :   Performs addition of 2 floats
//  Date :          08/05/2026
//  Author :        Pranav Avinash Narkhede
//
/////////////////////////////////////////////////////////////////////////////////

float AddTwoNumbers(
                        float fNo1 ,                        // first input 
                        float fNo2                          // second input
                   )
{
    float fAns = 0.0f;                                      // variable to store result 

    fAns = fNo1 + fNo2;                                     // perform addition

    return fAns;                                            

}
/////////////////////////////////////////////////////////////////////////////////
//
//  Application to perform Addition of 2 float values
//
/////////////////////////////////////////////////////////////////////////////////


int main()
{ 
    
    float fValue1 = 0.0f;                                   // To store the first input
    float fValue2 = 0.0f ;                                  // To store the second input 
    float fResult = 0.0f ;                                  // To store the result

    printf("Enter first number:\n");
    scanf("%f",&fValue1);

    printf("Enter second number:\n");
    scanf("%f",&fValue2);

    fResult = AddTwoNumbers(fValue1 , fValue2);            // to store the result

    printf("Addition is : %f\n",fResult);

    return 0 ;
}

/////////////////////////////////////////////////////////////////////////////////
//
// Input :      10.0   11.0
// Output :     21.0
//
/////////////////////////////////////////////////////////////////////////////////
