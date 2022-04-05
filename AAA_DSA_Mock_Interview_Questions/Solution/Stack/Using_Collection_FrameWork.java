//LIFO
import java.util.Stack;
class Main
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();
 
        stack.push("A"); 
        stack.push("B");  
        stack.push("C");   
        stack.push("D");  
 

        System.out.println("The top element is " + stack.peek());
        stack.pop();       
        stack.pop();  
 
        System.out.println("The stack size is " + stack.size());
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}