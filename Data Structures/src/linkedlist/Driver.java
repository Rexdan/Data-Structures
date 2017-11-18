package linkedlist;

public class Driver <T> {
	
	Node <T> head;
	
	public boolean isEmpty(Node head)
	{
		return (head ==  null);
	}
	/*Adding to a CLL*/
	public void addNode(T item)
	{
		head = new Node<T>(item, head);
	}

	public static void main(String[] args) 
	{
		Node <String> sHead;
		Node <Integer> iHead;
		Node <Double> dHead;
		Node <Character> cHead;
		
		String [] sArr = new String [10];
		Integer [] iArr = new Integer [10];
		Double [] dArr = new Double [10];
		Character [] cArr = new Character [10];
		
		for(int i = 0; i < 10; i++)
		{
			iArr[i] = (int)(Math.random()*100);
			dArr[i] = (Math.random()*100);
			int temp = 'A' + (int)(Math.random()*100);
			if (temp > 26) temp -= 26;
			//cArr[i] = 'A' + temp;
		}
		
	}

}
