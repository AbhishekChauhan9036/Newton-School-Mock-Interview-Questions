import java.util.*;
public class Main{
	public static void nextGreaterElement(int arr[])
	{
		Stack<Integer> s = new Stack<>();
		int arr2[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--)
		{
			if (!s.empty())
			{
				while (!s.empty()
					&& s.peek() <= arr[i])
				{
					s.pop();
				}
			}
			arr2[i] = s.empty() ? -1 : s.peek();
			s.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " -------> " + arr2[i]);
	}

	public static void main(String[] args)
	{
        int arr[] = { 11, 13, 21, 3 };
		nextGreaterElement(arr);
	}
}