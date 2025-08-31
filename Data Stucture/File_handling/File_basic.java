import java.io.File;
import java.io.IOException;
public class File_basic {
public static void main(String[] args) {
File myFile=new File("FileH_demo.txt");  // * Create new file 
try {
     myFile.createNewFile();
} catch (IOException e) {
  System.out.println("Uable to read this file");
  e.printStackTrace();
 } 
 
//   ** code to write  to file
}

}
