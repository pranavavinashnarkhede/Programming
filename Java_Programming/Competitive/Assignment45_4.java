// Write java program to accept file name from user and create new file of that name if it is not existing.

import java.util.Scanner;
import java.io.*;

class Assignment45_4
{

    static void Create_File(String file_name) throws IOException
    {
        File fobj = new File(file_name);

        if(fobj.createNewFile())
        {
            System.out.println("File Created Successfully");
        }
        else
        {
            System.out.println("File already exists");
        }
        
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;

        System.out.print("Enter the file name : ");
        sName = sobj.nextLine();

        Create_File(sName);

        sobj.close();
        
    }
}