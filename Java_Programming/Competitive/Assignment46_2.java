// Write java program to accept file name from user and check whether that file is regular file or not...

import java.util.Scanner;
import java.io.*;

class Assignment46_2
{
    static void Check_FileType(String fName)throws IOException
    {
        File fobj = new File(fName);

        if(!(fobj.exists()))
        {
            System.out.println("File does not exists");
        }
        else
        {
            if(fobj.isFile())
            {
                System.out.println("File is normal File");
            }
            else
            {
                System.out.println("File is not a normal File");
            }
        }

    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String fName = null;
        
        System.out.println("Enter the File Name : ");
        fName = sobj.nextLine();

        Check_FileType(fName);

        sobj.close();

    }
}