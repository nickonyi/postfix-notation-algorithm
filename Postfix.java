import java.util.*;

public class Postfix {
  String currentExpr;
  public static void main (String[] args){
    Postfix evalPostfix = new Postfix();
    evalPostfix.setCurrentExpr(evalPostfix.getUserString());
    System.out.println("We are evaluating "+evalPostfix.currentExpr);
    evalPostfix.controller(evalPostfix.currentExpr);
  }

  String getUserString(){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the postfix expression you want to evaluate");
    String strExpr = in.nextLine();
    in.close();

    return strExpr;
  }
private void setCurrentExpr(String enteredExpression){
      currentExpr = enteredExpression;
}

void controller (String postFixExpr){
Stack<String> myStack1 = tokenizeExpr(postFixExpr);
System.out.println(myStack1);
Stack<String> mystack2 = new Stack<>();//for storing intermediate results
}

private Stack<String> tokenizeExpr(String prfev){
  prfev.trim();//removing white spaces in our evaluation
  Stack<String> rtnStack = new Stack<>();
  //store the contents of the string in reverse order
  for(int i=prfev.length(); i>0; i--){
      rtnStack.push(prfev.substring(i-1,i));

  }

  return rtnStack;
}

void evaluatePostfix(Stack<String> myStack1,Stack<String> myStack2){
  //this method will recursively call itself until it has evaulated the entered expression
  if(myStack1.size()==0 && myStack2.size()==1){
      System.out.println("Result is " + myStack2);
  } else {
    //read the element from the string and see if it can be an operand
    String itemPicked = myStack1.pop();
  }

 

}
private String checkType(String pop){
    String foundType = "";
    try {
      int var = Integer.parseInt(pop);
      foundType = "opd";
    } catch(Exception e){
      foundType = "opr";
      System.out.println("Error in number format"+e.toString());
    }

    return foundType;
}
}