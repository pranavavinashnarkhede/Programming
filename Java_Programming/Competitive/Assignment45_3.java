// Write java program to accept file name from user and open that file in write mode and write some data at the end of file.

import java.util.Scanner;
import java.io.*;

class Assignment45_3
{

    static void Write_Content(String file_name) throws IOException
    {
        String str = " Marvellous Infosystems";

        FileOutputStream fos = new FileOutputStream(file_name , true);      // if file exists it open it or if not create a new file in append mode

        fos.write(str.getBytes());                  // it does not write string directory . need to convert string into bytes

        fos.close();
        
    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;

        System.out.print("Enter the file name : ");
        sName = sobj.nextLine();

        Write_Content(sName);

        sobj.close();
        
    }
}