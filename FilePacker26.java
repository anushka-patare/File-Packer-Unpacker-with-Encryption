import java.io.*;
import java.util.*;

class program582
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
        }
        else
        {
            System.out.println("There is no such folder");
        }
      
    }
}