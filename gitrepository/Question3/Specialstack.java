import java.util.*;
public class Specialstack {
   Stack<Integer> st= new Stack<>();
   Integer minval;
   public boolean isEmpty(){
       return st.isEmpty();
   }
   public boolean isFull(){
       return st.size()==Integer.MAX_VALUE;
   }
   public void push(int val){
       if(st.isEmpty()){
           minval=val;
           st.push(val);
       }
       else{
           if(val<minval){
               st.push((2*val)-minval);
               minval=val;
           }
          else st.push(val);
       }
   }
   public void pop(){
       if(st.isEmpty()){
           return;
       }
       int val=st.peek();
       if(val<minval){
           minval=(2*minval)-val;
       }
       st.pop();
   }
   public int top(){
       int val=st.peek();
       if(val<=minval){
           return minval;
       }
       return val;
   }
   public int getMin(){
       if(st.isEmpty()){
           throw new IllegalStateException("Stack is Empty");
       }
       return minval;
   }
}