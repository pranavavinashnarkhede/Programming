import java.util.*;

class Assignment57_3
{
//--------------------------------------------------------------------//
// Function Name : RemoveDuplicateCharacter
// Description   : Removes duplicate characters while keeping the first occurrence.
// Input         : String
// Output        : String without duplicate characters
// Author        : Pranav Avinash Narkhede
// Date          : 03/08/2026
//--------------------------------------------------------------------//
    public static String RemoveDuplicateCharacter(String str)
    {
        int i = 0 ;
        String Result = "" ;

        str = str.trim();
        str = str.replaceAll("\\s+","");

        LinkedHashSet <Character> set = new LinkedHashSet<> ();

        for(i = 0 ; i < str.length() ; i++)
        {
            set.add(str.charAt(i));
        }

        for(Charcter ch : set)
        {
            Result = Result+ch;    
        }

        return Result;
        

    }
    
//--------------------------------------------------------------------//
// Application to remove duplicate characters while keeping the first occurrence.
//--------------------------------------------------------------------//
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null ;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        if(str.length() <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        str = RemoveDuplicateCharacter(str);

        System.out.println(str);
    }
}