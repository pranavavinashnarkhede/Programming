import java.util.*;

class Assignment57_5
{
//--------------------------------------------------------------------//
// Function Name : CheckRotation
// Description   : Checks whether one string is a rotation of another.
// Input         : Two strings
// Output        : Boolean result
// Author        : Pranav Avinash Narkhede
// Date          : 04/08/2026
//--------------------------------------------------------------------//
    public static boolean CheckRotation(String str1 , String str2)
    {
        if(str1.length() != str2.length())
        {
            return false ;
        }

        String temp = str1 + str2;

        return temp.contains(str2); 

    }
    
//--------------------------------------------------------------------//
// Application to check whether two strings are rotations.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null ;
        String str2 = null ;
        boolean bRet = false;

        System.out.println("Enter first string : ");
        str1 = sobj.nextLine();
        
        System.out.println("Enter second string : ");
        str2 = sobj.nextLine();

        bRet = CheckRotation(str1 ,str2);

        if(bRet == true)
        {
            System.out.println("Strings are Rotation");
        }
        else
        {
            System.out.println("Strings are Not Rotation");
        }

    }
}