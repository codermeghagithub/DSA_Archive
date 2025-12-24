// **Transpose for  square Matrix

// import java.util.Scanner;

// public class Transpose_arr {
//     static void Display_Matrix(int[][] t_arr){
//         int c1,r1;
//         System.out.println("2Dd arr print:");
// for(int i=0;i<t_arr.length;i++){
//             for(int j=0;j<t_arr.length;j++){
//     System.out.print(t_arr[i][j]+" ");            
//             }
//       System.out.println(""); 
      
//     }                 
//          }
//     static void Transpose(int[][]O_arr,int r1,int c1){
        
//         int[][] t_arr=new int [r1][c1];
//         for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
//                 t_arr[i][j]=O_arr[j][i];
//             }
//         }
//         Display_Matrix(t_arr);
//         return;
        
//     }
//      static void Transpose_With_Optimize(int[][]O_arr,int r1,int c1){
        
//         for(int i=0;i<c1;i++){
//             for(int j=i;j<r1;j++){
//                 int temp=O_arr[i][j];
//                 O_arr[i][j]=O_arr[j][i];
//                 O_arr[j][i]=temp;
//             }
//         }
        
        
        
//         Display_Matrix(O_arr);
//         return;
        
//     }
//   public static void main(String[] args){
//     Scanner sc =new Scanner(System.in);
//       System.out.print("Enter number of rows &  columns: ");
//         int r1 = sc.nextInt();
//         int c1= sc.nextInt();
//         System.out.println("Enter elements:");
//         int [][]O_arr=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//           O_arr[i][j]=sc.nextInt();
//             }
//         }
//         Display_Matrix(O_arr);
// Transpose(O_arr,r1,c1);
//   }}







  
// **Transpose for non square

// import java.util.Scanner;

// public class Transpose_arr {
//     static void Display_Matrix(int[][] O_arr){
//         int c1,r1;
//         System.out.println("2Dd arr print:");
// for(int i=0;i<O_arr.length;i++){
//             for(int j=0;j<O_arr[i].length;j++){
//     System.out.print(O_arr[i][j]+" ");            
//             }
//       System.out.println(""); 
      
//     } }
    
    //  static int[][] Rectagle_Transpose(int[][]O_arr,int r1,int c1){


//         int[][] r_arr=new int[c1][r1];
//         for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
                
//                 r_arr[i][j]=O_arr[j][i];
//             }
//         }       
        
        // return r_arr;
        
//     }
//   public static void main(String[] args){
//     Scanner sc =new Scanner(System.in);
//       System.out.print("Enter number of rows &  columns: ");
//         int r1 = sc.nextInt();
//         int c1= sc.nextInt();
//         System.out.println("Enter elements:");
//         int [][]O_arr=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//           O_arr[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Original Rectangle: ");

//         Display_Matrix(O_arr);
//         System.out.println("Transpose Rectangle: ");
        // int[][] r_arr=Rectagle_Transpose(O_arr,r1,c1);
        //         Display_Matrix(r_arr);

 
//   }}
