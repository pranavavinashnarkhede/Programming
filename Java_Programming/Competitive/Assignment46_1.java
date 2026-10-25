// Write java program to accept two file names from user and open first file and create new file
// (Second name) and copy the data from first file into newly created file.

import java.util.Scanner;
import java.io.*;

class Assignment46_1
{
    static void Copy_Content(String fName1 , String fName2)throws IOException
    {
        byte buffer[] = new byte[100];
        int iRet = 0 ;

        File fobj = new File(fName1);

        if(!(fobj.exists()))
        {
            System.out.println("File does not exists");
        }

        FileInputStream fis = new FileInputStream(fName1);
        FileOutputStream fos = new FileOutputStream(fName2);         
        while(true)
        {
            iRet = fis.read(buffer);

            if(iRet == -1)
            {
                break;
            }

            fos.write(buffer , 0 , iRet);
        }

        fis.close();
        fos.close();
        System.out.println("Contents successfully written in new file");

    }

    public static void main(String A[])throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String fName1 = null;
        String fName2 = null;

        System.out.println("Enter the File Name : ");
        fName1 = sobj.nextLine();

        System.out.println("Enter the name to create new file : ");
        fName2 = sobj.nextLine();

        Copy_Content(fName1 , fName2);

        sobj.close();

    }
}