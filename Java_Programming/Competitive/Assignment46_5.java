// Write java program to accept directory name from user and display all names of files from that directory and size of each file on screen.

import java.util.Scanner;
import java.io.*;

class Assignment45_5
{

    static void Display_File_Names(String directory_name) throws IOException
    {
       File fobj = new File(directory_name);
        int i = 0 ;

       if(fobj.exists() && fobj.isDirectory())
       {
            File arr[] = fobj.listFiles();
            // Returns an array of File objects representing all files and subdirectories in the directory.

            for(i = 0 ; i < arr.length ; i++)
            {
                if(arr[i].isFile())
                {
                    System.out.println("File Name : "+arr[i].getName() + "\t\tFile Size : "+arr[i].length() +" bytes");
                }
            }
       }
       else
       {
            System.out.println("There is no such directory");
       }
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;

        System.out.print("Enter the directory name : ");
        sName = sobj.nextLine();

        Display_File_Names(sName);

        sobj.close();
        
    }
}