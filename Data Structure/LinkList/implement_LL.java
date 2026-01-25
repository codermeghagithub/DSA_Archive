public class implement_LL {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
  }
  
  public  static void main(String[] args){
   Node n1=new Node(1); 
   System.out.println(n1.next); // o/p=null

  }
}
