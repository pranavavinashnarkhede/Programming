// Write java program to accept directory name from user and write data of all files into one newly created file named as “Marvellous.txt”.

import java.util.Scanner;
import java.io.*;

class Assignment47_3
{

    static void Copy_File_Content(String directory_name) throws IOException
    {
       File fobj = new File(directory_name);
        String str = null;
        byte buffer[] = new byte[1024];
        int iRet = 0 ;

       if(fobj.exists() && fobj.isDirectory())
       {
            File arr[] = fobj.listFiles();

            FileOutputStream fos = new FileOutputStream("Marvellous.txt");
            
            for(int i = 0 ; i < arr.length ; i++)
            {
                str = arr[i].getName();

                if(str.equals("Marvellous.txt"))
                {
                    continue;
                }

                if(arr[i].isFile())
                {
                    System.out.println("Copying : " + arr[i].getName());
                    FileInputStream fis = new FileInputStream(arr[i].getAbsolutePath());

                    while(true)
                    {
                        iRet = fis.read(buffer);
                        if(iRet == -1)
                        {
                            break;
                        }
                        fos.write(buffer , 0 , iRet);
                    }

                    fos.write(System.lineSeparator().getBytes());

                    fis.close();

                }
            }
            fos.close();
            
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

        Copy_File_Content(sName);

        sobj.close();
        
    }
}