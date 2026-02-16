import java.io.*;
import java.util.*;

class program584
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the name of folder:");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);        // Marvellous : folder
    
        if((fobj.exists()) && fobj.isDirectory())
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();       // This is array of  File class as object

            System.out.println("Number of files in the folder are : "+fArr.length);

            for(int i = 0; i<fArr.length; i++)
            {
                System.out.println("File name : "+fArr[i].getName()+" File size : "+fArr[i].length()+" bytes");
               
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
      
    }
}