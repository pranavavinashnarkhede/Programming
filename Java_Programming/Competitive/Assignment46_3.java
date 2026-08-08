// Write java program to accept directory name from user and create that directory.

import java.util.Scanner;
import java.io.*;

class Assignment46_3
{
    static void Create_Directory(String dName)throws IOException
    {
        File fobj = new File(dName);
        
        if(!(fobj.exists()))
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create Directory ");
            }
        }
        else
        {
            System.out.println("Directory already exists");
        }
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String dName = null;
        
        System.out.println("Enter the directory Name : ");
        dName = sobj.nextLine();

        Create_Directory(dName);

        sobj.close();

    }
}