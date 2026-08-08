// Write java program to accept directory name from user and write names of all files from that directory
//  into one newly created file named as “Marvellous.txt”.

import java.util.Scanner;
import java.io.*;

class Assignment47_2
{

    static void Display_File_Names(String directory_name) throws IOException
    {
       File fobj = new File(directory_name);
        int i = 0 ;
        String str = null;

       if(fobj.exists() && fobj.isDirectory())
       {
            File arr[] = fobj.listFiles();

            FileOutputStream fos = new FileOutputStream("Marvellous.txt",true);
            
            for(i = 0 ; i < arr.length ; i++)
            {
                if(arr[i].isFile())
                {
                    str = arr[i].getName();
    
                    fos.write(str.getBytes());                  // convert string into bytes and write data into file
                    fos.write(System.lineSeparator().getBytes());       // add new line in the file

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