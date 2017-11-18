package linear;

public class LLApp {

	public static IntNode deleteFront(IntNode front) {
		if (front == null) {
			System.out.println("Empty list, nothing to delete");
			return front;
		}
		front = front.next;
		return front;
	}
	
	
	public static IntNode addToFront(IntNode front, int item) {

		return new IntNode(item, front);
	}
	
	public static boolean search(IntNode front, int target) {
		for (IntNode ptr=front; ptr != null; ptr=ptr.next) {
			if (target == ptr.data) {
				return true;
			}
		}
		return false;
	}
	
	public static void traverseInt(IntNode front) {
		if (front == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.print(front.data);  // first item
		IntNode ptr=front.next;    // prepare to loop starting with second item
		while (ptr != null) {
			System.out.print("->" + ptr.data);
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	public static void traverseString(StringNode front) {
		if (front == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.print(front.data);  // first item
		StringNode ptr=front.next;    // prepare to loop starting with second item
		while (ptr != null) {
			System.out.print("->" + ptr.data);
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	public static IntNode addBefore(IntNode front, int target, int newItem)
	{
		
		IntNode prev = null; //just setting previous node to target as null, just in case
		IntNode ptr = front; //want the index to be at the front of the linked list
		
		while( ptr != null && ptr.data != target) //runs through list to check target and place pointer behind
		{
			prev = ptr;
			ptr = ptr.next;
		}
		
		if( ptr == null ) return null; //account for if target not reached.
		
		IntNode temp = new IntNode(newItem, ptr); //need a temporary node to hold int in place
		
		if( prev == null ) return temp; //if the target is in the beginning
		
		prev.next = temp; //plugs node before temp in front of temp, which carries front with it
		
		return front; //returns front either modified or not
	}
	
	public static void deleteEveryOther(IntNode front)
	{
		if(front == null || front.next == null) return; //if empty, do nothing.

		IntNode prev = null;
		IntNode ptr = front;
		int count = 0; //counter to count for odds since we're deleting every other one
		
		while( ptr != null )//while loop works best here
		{
			if(count %2 == 0) //if it's even, then it's being removed
			{
				prev = ptr;
				ptr = ptr.next;

			}
			else //we keep the odd numbered ones and slap them onto prev
			{
				prev.next = ptr.next;
				ptr = prev.next;

			}
			count++;
		}
		
		/* it is still printing out everything that front is pointing to 
		 * because front is pointing at whatever is in prev.
		 */
	}
	
	public static int numberOfOccurrences(StringNode front, String target) {
		
		int count = 0;
		
		for(StringNode ptr = front; ptr!= null; ptr = ptr.next){
			if(ptr.data.equals(target)) count++;
		}
		
		return count;
  }
	
	public static StringNode addString(StringNode front, String s){
		return new StringNode(s,front);
	}
	
	public static void main(String[] args) {
		
		IntNode front = new IntNode( 0 ,null );

		front = addToFront(front,9);
		traverseInt(front);
		front = addToFront(front,4);
		traverseInt(front);
		front = addToFront(front,6);
		traverseInt(front);
		front = addToFront(front,8);
		traverseInt(front);
		front = addToFront(front,77);
		traverseInt(front);
		front = addToFront(front,55);
		traverseInt(front);
		front = addToFront(front,897);
		traverseInt(front);
		front = addToFront(front,888);
		traverseInt(front);
		/*front = deleteFront(front);
		traverseInt(front);
		front = deleteFront(front);
		traverseInt(front);
		front = deleteFront(front);
		traverseInt(front);
		front = deleteFront(front);
		traverseInt(front);
		
		front = addBefore(front,4,99);
		traverseInt(front);*/
		
		deleteEveryOther(front);
		traverseInt(front);
		
		/*StringNode front = new StringNode("",null);
		
		front = addString(front,"hi");
		traverseString(front);
		front = addString(front,"hi");
		traverseString(front);
		front = addString(front,"hi");
		traverseString(front);
		front = addString(front,"hi");
		traverseString(front);
		
		System.out.println();
		System.out.println(numberOfOccurrences(front, "hi"));*/
		
		

	}

}
