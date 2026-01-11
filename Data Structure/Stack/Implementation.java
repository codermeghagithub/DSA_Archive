

// ** Stack implementation using array .I need array iterator/ variable who travel full stack or i can say array so that we can know size.
public class  Implementation{
  public static class Stack{
private int[] arr=new int[5];
  private int idx=-1;
  
void push(int val){
arr[++idx]= val;
idx++;    
  }

  int pop(){  // **ARRAY BYDEFAULT VALUES ARE 0 In JAVA 
    if(arr[idx]==-1){
      System.out.println("Array is underflow");
      return 0;
    }
    int top=arr[idx];
    arr[idx]=0;
    idx--;
return top;
    // top=0;
    // idx--;
  }
  int  peek(){
      if(arr[idx]==-1){
    System.out.println("Array is underflow");

      }
      return arr[idx];
    //   System.out.println(arr[idx]);

  }
  void display(){
      for(int i=0;i<idx;i++){
          System.out.print(arr[i]);
      }
System.out.println("");
  }
  int size(){
      return  idx;
  }
}
  public static void main(String[] args){
    Stack st=new Stack();
    st.push(4);
    st.push(6);
    st.push(9);
    st.display();// 4,5,6
st.pop();
st.display();//4,5
  }
}
