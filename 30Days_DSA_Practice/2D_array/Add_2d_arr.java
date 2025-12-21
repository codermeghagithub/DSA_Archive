import java.util.Scanner;
public class Add_2d_arr
{
    static void Display_Matrix(int[][] sum){
        System.out.println("2Dd arr print:");


        // **🧠 Why Java does NOT allow this
// int r1;   // declared


// But you never did:

// r1 = 3;   // initialized
         for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                
                System.out.print(sum[i][j]+" ");
        
    }
         System.out.println("") ;   
         }}
    
    // static void Addition(int[][]arr1,int r1,int c1,int[][]arr2,int r2,int c2){
    // if(r1!=r2 || c1!=c2){
    //     System.out.println("Addition not possible😔");
    //     return;
    // }
    // int s1,s2;
    // int[][] sum=new int[r1][c1];
    // for(int i=0;i<r1;i++){ // ROW
    //     for(int j=0;j<c1;j++){ //COLOUMN
    //     sum[i][j]=arr1[i][j]+arr2[i][j];
    //     }
    // }
    // Display_Matrix(sum);
  
    // }
   static void Multiply(int[][]arr1,int r1,int c1,int[][]arr2,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible.❌");
        }
int[][] multi=new int[r1][c2];
for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
        for (int k=0;k<r2;k++){
        multi[i][j]+=arr1[i][k]*arr2[k][j];
        
        }
        
    }}
Display_Matrix(multi);
    }
    
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
      
        // Get dimensions from user 2st ARRAY
       System.out.print("Enter number of rows &  columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        
          int[][] arr1=new int[r1][c1];
       System.out.println("Enter the ele of arr:") ;  
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
                         }}
                         
// 2nd ARRAY  
                         
    System.out.print("Enter number of rows &  columns: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
          int[][] arr2=new int[r2][c2];
       System.out.println("Enter the ele of arr:") ;  
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
       
                         }}
     System.out.println("Matrix1 :");
    Display_Matrix(arr1);
    System.out.println("Matrix1 :");
    Display_Matrix(arr2);
// Addition(arr1,r1,c1,arr2,r2,c2);
Multiply(arr1, r1, c1, arr2, r2, c2);
 
	}
}
