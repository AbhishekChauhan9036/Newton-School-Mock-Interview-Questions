import java.util.*;
class Main {
	
	private final int V;
	private final List<List<Integer>> adj;

	public Main (int V)
	{
		this.V = V;
		adj = new ArrayList<>(V);
		
		for (int i = 0; i < V; i++)
			adj.add(new LinkedList<>());
	}
	
	private boolean isCyclicUtil(int i, boolean[] arr,boolean[] brr)
	{
		if (brr[i])
			return true;

		if (arr[i])
			return false;
			
		arr[i] = true;

		brr[i] = true;
		List<Integer> children = adj.get(i);
		
		for (Integer c: children)
			if (isCyclicUtil(c, arr, brr))
				return true;
				
		brr[i] = false;

		return false;
	}

	private void addEdge(int source, int dest) {
		adj.get(source).add(dest);
	}

	private boolean isCyclic()
	{
		
		boolean[] arr = new boolean[V];
		boolean[] brr = new boolean[V];
		
		for (int i = 0; i < V; i++)
			if (isCyclicUtil(i, arr, brr))
				return true;

		return false;
	}
	public static void main(String[] args)
	{
		Main graph = new Main(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't "+ "contain cycle");
	}
}