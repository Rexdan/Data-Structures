package trees;

public class Node<T> implements Comparable<Node<T>>
{
	T data;
	Node<T> left;
	Node<T> right;
	
	public Node()
	{
		
	}
	
	public Node(T data) 
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() 
	{
		return new StringBuilder(this.data.toString()).toString();
	}
	
	@Override
	public int compareTo(Node<T> input)
	{
		try
		{
			if(this.data instanceof String)
			{
				String toCheck = (String)input.data;
				String checkAgainst = (String)this.data;
				if(toCheck.compareTo(checkAgainst) > 0)
				{
					return -1;
				}
				else if(toCheck.compareTo(checkAgainst) == 0)
				{
					return 0;
				}
				return 1;
			}
		}catch(Exception e)
		{
			
		}
		/*Returning this means we got an error!*/
		return -2;
	}
}
