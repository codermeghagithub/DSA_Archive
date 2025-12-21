//  **HOLLOW RECTANGLE
import java.util.Scanner;
public class Pattern1
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and column:");
	int  r=sc.nextInt();
	int c=sc.nextInt();
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        if(i==j||i==(r-1)||(j==0)||(j==c-1)){
	        System.out.print("*");
	        }else{
	             System.out.print(" ");
	        }
	    }
	    System.out.println("");
	}

}
}
// *
// **
// ***
// ****
// import java.util.Scanner;
// import java.lang.Math; 

// public class Pattern1
// {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
// 	System.out.println("Enter the number of rows and column:");
// 	int  r=sc.nextInt();
// 	int c=sc.nextInt();
// 	for(int i=0;i<r;i++){
// 	    for(int j=0;j<i;j++){
	        
// 	    System.out.print("*");
// 	}
// 	   System.out.println("");  
// 	}

// }
// }


// import java.util.Scanner;

// public class Main
// {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
// 	System.out.println("Enter the number of rows and column:");
// 	int  r=sc.nextInt();
// 	int c=sc.nextInt();
// // 	****
// // 	 ***
// // 	  **
// // 	   *
// 	for(int i=r;i>0;i--){
// 	    for(int j=0;j<i;j++){  // *i=4,j=4 4>=4 3>=4 i=3 
	        
// 	    System.out.print("*");
// 	}
// 	   System.out.println("");  
// 	}

// }
// }
