import java.util.*;

public class Postfix {
    //method to evaluate post fix notation
    public static int evaluatePostfix(String exp){
//create a stack
Stack<Integer> stack = new Stack<>();
//Scan all the characters one by one
for(int i=0; i<exp.length();i++){
  char c = exp.charAt(i);
  //if the character is an operand push it to the stack  
  if(Character.isDigit(c)){
      stack.push(c-'0');
      
    } 
    //if the scanned character is an operator 
//pop two elements from the stack and apply operator
    else {
      int val1 = stack.pop();
      int val2 = stack.pop();

      switch(c){
        case '+':
        stack.push(val2+val1);
        break;
        case '-':
        stack.push(val2-val1);
        break;
        case '*':
        stack.push(val2*val1);
        break;
        case '/':
        stack.push(val2/val1);
        break;

      }
    }
    }

return stack.pop();
    }

    //performs the push operation
    public static void pushElement(Stack<Integer> stack1,int x){
      //invoke the stack method
      stack1.push(x);
      System.out.println("Push->"+x );
      //print the modified stack
      System.out.println("Stack" + stack1);

      }

      public static void main(String[] args){
        String exp = "23+4-";
        System.out.println(evaluatePostfix(exp));
        
      }
   
              

              
            }

         

   


