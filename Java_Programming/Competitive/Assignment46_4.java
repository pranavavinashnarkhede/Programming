// Write java program to accept file name from user calculate checksum of that file and display on screen.

import java.util.Scanner;
import java.io.*;
import java.security.*;

class Assignment46_4
{
   public static void Calculate_CheckSum(String fName)throws Exception
    {
        byte buffer[] = new byte[100];
        int iRet = 0 ;

        File fobj = new File(fName);

        if(!(fobj.exists()))
        {
            System.out.println("File does not exists");
        }

        FileInputStream fis = new FileInputStream(fName);
        MessageDigest md = MessageDigest.getInstance("MD5");

        while(true)
        {
            iRet = fis.read(buffer);
            
            if(iRet == -1)
            {
                break;
            }
            md.update(buffer , 0 , iRet);

        }

        byte checksum[] = md.digest();              // I have finished giving you all the file data. Now calculate the final MD5 checksum."

        System.out.print("Checksum is : ");
        for(byte b : checksum)
        {
            System.out.printf("%02x", b);
        }

        fis.close();


    }

    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String fName = null;
        
        System.out.println("Enter the File Name : ");
        fName = sobj.nextLine();

        Calculate_CheckSum(fName);

        sobj.close();



    }
}