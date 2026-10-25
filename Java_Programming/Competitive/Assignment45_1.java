// Write java program to accept file name from user and open that file.

import java.util.Scanner;
import java.io.*;

class Assignment45_1
{

    static void Open_File(String file_name) throws IOException
    {
        FileInputStream fis = new FileInputStream(file_name);

        fis.close();
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;

        System.out.print("Enter the file name : ");
        sName = sobj.nextLine();

        Open_File(sName);

        System.out.println("File gets opened successfully");

        sobj.close();
        
    }
}