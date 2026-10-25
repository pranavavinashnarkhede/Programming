// write a program to calculate the product of digits of a numbers . 

class Logic 
{
    void productOfDigit(int iNo)
    {
        int iDigit = 0 ,iProduct = 1 ;

        while(iNo != 0)
        {
            iDigit = iNo % 10 ; 
            iProduct = iProduct * iDigit;
            iNo = iNo / 10 ;
        }

        System.out.println("Product of digits is : "+iProduct);

    }
}

class Question22
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.productOfDigit(234);
    }
}