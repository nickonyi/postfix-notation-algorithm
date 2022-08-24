public class Stack {
    private int array[];
    private int capacity;
    private int top;

    Stack(int size){
        array = new int[size];
        capacity = size;
        top = -1;
    }

    public void push (int x){
        if(isFull()){
            System.out.println("Overflow\nProgram terminated\n");
            System.exit(0);
        } else {
            array[++top] = x;
        }
    }

    public int pop(){
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
 
        // decrease stack size by 1 and (optionally) return the popped element
        return array[top--];
    }
 
    }

    //utility function to return what is at the top of the stack
    public int peek(){
        if(!isEmpty()){
            return array[top];
        } else {
            System.exit(0);
        }
         
        return -1;
    }
    //utility function to check the size of our stack
    public int size (){
        return top+1;
    }

    //utility function to check if the stack is full
    public boolean isFull(){
        return top == capacity +1;
    }
    //utility function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

}
