// Write java program to accept file name from user and open that file and display the contents on screen.

import java.util.Scanner;
import java.io.*;

class Assignment45_2
{

    static void Display_Content(String file_name) throws IOException
    {
        byte buffer[] = new byte[100];                  // create byte array to store data read from file
        int iRet = 0 ;                                  // to store how many bytes read successfully

        FileInputStream fis = new FileInputStream(file_name);               // creates a object of FileInputStream for reading the data from file

        iRet = fis.read(buffer);

        while(iRet != -1)
        {
            System.out.print(new String(buffer , 0 , iRet));
            iRet = fis.read(buffer);
        }

        fis.close();
        
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;

        System.out.print("Enter the file name : ");
        sName = sobj.nextLine();

        Display_Content(sName);

        sobj.close();
        
    }
}