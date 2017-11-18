package trees;

public class Driver
{
	public static void main(String [] args)
	{
		Node<String> a,b,c,d;
		a = new Node<String>("Cat");
		b = new Node<String>("Dog");
		c = new Node<String>("Rabbit");
		d = new Node<String>("Cow");
		BinaryTree<String> bt = new BinaryTree<String>(a);
		bt.addNode(b);
		bt.addNode(c);
		bt.addNode(d);
		System.out.println("**************************************FIRST TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
		System.out.println();
		bt.removeNode(b);
		System.out.println("**************************************SECOND TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
		System.out.println();

		bt.removeNode(d);
		System.out.println("**************************************THIRD TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
		System.out.println();
		System.out.println("**************************************FOURTH TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
		System.out.println();
		bt.removeNode(c);
		System.out.println("**************************************FIFTH TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
		System.out.println();
		bt.removeNode(a);
		System.out.println("**************************************FIFTH TRAVERSAL**************************************\n");
		bt.inorderTraverseTree();
	}
}
