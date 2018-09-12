import java.io.*;
class Q1
{
  public static void main(String args[]) throws IOException
  {
    File f = new File("C:/Users/user/Desktop/Assignment/File_Handling-2/Old.txt");
   
    FileInputStream fin = new FileInputStream(f);
    
    File f1 = new File("C:/Users/user/Desktop/Assignment/File_Handling-2/New.txt");
    
    FileOutputStream fout = new FileOutputStream(f1);
 
    String s;

    int i;
            
            i=fin.read();
            
            while(i!=-1)
            {
                char ch = (char)i;
                fout.write(ch);
                i=fin.read();
            }
         
       fout.close();    
       FileInputStream fin1 = new FileInputStream(f1);
       i=fin1.read(); 
       
       while(i!=-1)
       {
          System.out.print((char)i);
          i=fin1.read();
       }
       fin.close();
       fin1.close();
       
  }
}