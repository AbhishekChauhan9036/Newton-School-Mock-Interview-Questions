import java.util.Stack;
class Queue<T> {
    private Stack<T> s;
 
    Queue() {
        s = new Stack<>();
    }
 
    public void enqueue(T data)
    {
        s.push(data);
    }
 
    public T dequeue()
    {
        if (s.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        T top = s.pop();
 
        if (s.isEmpty()) {
            return top;
        }
 
        T item = dequeue();
        s.push(top);
        return item;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };
        Queue<Integer> q = new Queue<Integer>();
 
        for (int key: keys) {
            q.enqueue(key);
        }
 
        System.out.println(q.dequeue());   
        System.out.println(q.dequeue());
    }
}