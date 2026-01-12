

// **✅ Stack Implementation (Hardcoded Values, Array-Based)

// ** Stack implementation using array .I need array iterator/ variable who travel full stack or i can say array so that we can know size.
public class  StackImplementation{
  public static class Stack{
private int[] arr=new int[5];
  private int idx=-1;
  
void push(int val){
  if(IsFull()){
    System.out.println("Stack is Overflow");
    return;
  }
arr[++idx]= val;
return;
  }

  int pop(){  // **ARRAY BYDEFAULT VALUES ARE 0 In JAVA 
    if(IsEmpty()){
      System.out.println("stack is underflow");
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
      for(int i=0;i<=idx;i++){
          System.out.print(arr[i] +" ");
      }
System.out.println("");
  }
  int size(){
      return  idx+1;
  }
  
  boolean IsEmpty()
  {
      if(idx==-1){
          return true;
      }
      else{
          return false;
      }
  }
  
  boolean IsFull(){         //0  1  2 arr.length=3
      if(idx==arr.length-1) //  1  2  3  I want to enter data 
      return true;  
      else  return false;
  }
  int Capacity(){
      return arr.length;
  }
  
}
  public static void main(String[] args){
    Stack st=new Stack();
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    st.push(8);
    st.push(10);
st.display();// 4,5,6,7,8
// System.out.println(st.pop());//8
st.display();//4,5,6,7
System.out.println(st.peek()); // 
st.display();
System.out.println(st.size());
System.out.println(st.IsEmpty());
st.push(4);

System.out.println(st.IsFull());

System.out.println(st.Capacity());
  }
}
