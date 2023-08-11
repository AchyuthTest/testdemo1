/**
 * 
 */
package day1;
import java.io.*;
/**
 * @author Achyuth
 *
 */
public class file1 {

	
	public static void main(String[] args) throws IOException,FileNotFoundException  {
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt", true);    
        fout.write(67);
        fout.write(68);
        fout.flush();
        fout.close();    
        System.out.println("success...");

        FileInputStream fin = new FileInputStream("D:\\\\testout.txt");
        int totalbytes =fin.available();
        int data1 = fin.read();
        int data2 = fin.read();
        int data3 = fin.read();
        fin.close();
        System.out.println("data inside file testout.txt: " + (char)data1);
        System.out.println(totalbytes);
        System.out.println((char)data1 +""+ (char)data2 +""+ (char)data3 );
        
		
		

	}


}
