import java.util.*;
public class Main {
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
	int currsize;

	public Main()
	{
		currsize = 0;
	}

	void remove()
	{
		if (q1.isEmpty())
			return;

		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}


		q1.remove();
		currsize--;

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	void add(int x)
	{
		q1.add(x);
		currsize++;
	}

	int top()
	{
		if (q1.isEmpty())
			return -1;

		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}

		int temp = q1.peek();

		q1.remove();
		q2.add(temp);

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return temp;
	}

	int size()
	{
		return currsize;
	}

	public static void main(String[] args)
	{
		Main s = new Main();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);

		System.out.println(s.size());
		System.out.println(s.top());
		s.remove();
		System.out.println(s.top());

	}
}