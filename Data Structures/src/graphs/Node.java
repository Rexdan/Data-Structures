package graphs;

import java.util.ArrayList;

public class Node<T> implements Comparable<Node<T>>
{
	ArrayList<Node<T>> neighbors;
	T data;
	
	public Node()
	{
		
	}
	
	public Node(T data)
	{
		this.data = data;
	}

	@Override
	public int compareTo(Node<T> o)
	{
		return 0;
	}
}
