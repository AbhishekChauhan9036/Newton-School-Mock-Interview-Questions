// Stack using Queue....
import java.io.*;
import java.util.*;
class Stack<T>{

	Queue<T> q1,q2;
	public Stack(){
		q1=new ArrayDeque<>();
		q2=new ArrayDeque<>();
	}

	void add(T data){
		q1.add(data);
	}

	public T poll(){
		if(q1.isEmpty()){
			System.out.println("flow of stack");
			System.exit(0);
		}

		T front=null;

		while(!q1.isEmpty()){
			if(q1.size()==1){
				front=q1.peek();
			}else{
				q2.add(q1.peek());
			}

			q1.poll();
		}


		while(!q2.isEmpty()){
			q1.add(q2.peek());
			q2.poll();
		}
		return front;
	}

}
public class Main{

	public static void main(String[] args) {
		int elements[]={1,2,3,4,5};

		Stack<Integer> s1=new Stack<>();

		for(int key:elements){
			s1.add(key);
		}

		for(int i=0;i<=elements.length;i++){
			System.out.println(s1.poll());
		}
	}
}