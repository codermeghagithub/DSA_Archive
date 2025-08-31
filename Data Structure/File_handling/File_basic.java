import java.io.File;

public class File_basic {

    public static void main(String[] args) {
// File myFile=new File("FileH_demo.txt");  // * Create new file 
// try {
//      myFile.createNewFile();
// } catch (IOException e) {
//   System.out.println("Uable to read this file");
//   e.printStackTrace();
//  } 

//   ** code to write  to file
        //    try {
        //        FileWriter my_fileWrite = new FileWriter("FileH_demo.txt");
        //        my_fileWrite.write("This is a our first file from this file handling topic ");
        //        my_fileWrite.close();
        //    } catch (IOException e) {
        //        e.printStackTrace();
        //    }
        //   ** code to write  to file
     //    File my_fileRead = new File("this.txt");
     //    try {
     //        Scanner sc = new Scanner(my_fileRead);
     //        while (sc.hasNextLine()) {
     //            String line = sc.nextLine();
     //            System.out.println(line);
     //        }
     //        sc.close();
     //    } catch (FileNotFoundException err) {
     //        err.printStackTrace();

     //    }

//   ** code to delete a file

          File myfile=new File("FileH_demo.txt");
          if(myfile.delete()){
               System.out.println("I have deleted:"+myfile.getName());

          }
          else{
               System.out.println("Some error occured while deleting the file  ");
          }


    }
}
