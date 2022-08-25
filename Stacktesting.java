import  java.util.*;

public class Stacktesting {
     //pushing element on top of the stack
  

    public static void main(String[] args){
        //creating an instance of  a stack
        Stack<Integer> stack1 = new Stack<Integer>();
        //check if the stack is  empty or not
        System.out.println("Stack" + stack1);
       for(int i=0; i<15;i++){
        pushElement(stack1,i);
       }
        for(int i=0; i<8;i++){
            popElement(stack1);
        }
        
    }

    //performs the push operation
    public static void pushElement(Stack<Integer> stack1,int x){
        //invoke the stack method
        stack1.push(x);
        System.out.println("Push->"+x );
        //print the modified stack
        System.out.println("Stack" + stack1);

        }
        //performing the pop operations
        public static void popElement(Stack<Integer> stack1){
          System.out.println("pop->");
          //invoking pop operation
          Integer x = (Integer) stack1.pop();
          System.out.println(x);
          //display the updated stack
          System.out.println("stack"+stack1);
        }
    }
    

