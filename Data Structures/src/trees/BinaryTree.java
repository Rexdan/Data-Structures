package trees;

public class BinaryTree<T>
{
	Node<T> root;
	int size;
	
	public BinaryTree()
	{
		
	}
	
	public BinaryTree(Node<T> root)
	{
		this.root = root;
		this.size++;
	}
	
	public Node<T> getRoot()
	{
		return this.root;
	}
	
	public void addNode(Node<T> input)
	{
		try
		{
			this.root = insertRec(this.root, input);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.size++;
	}
	
	public void removeNode(Node<T> input)
	{
		try
		{
			removeRec(this.root, input);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    /* A recursive function to insert a new node in BST */
    public Node<T> insertRec(Node<T> root, Node<T> input)
    {
        /* If the tree is empty, return a new node */
        if (root == null) 
        {
            root = input;
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (input.compareTo(root) <= 0)
        	root.left = insertRec(root.left, input);
        else if (input.compareTo(root) >= 0)
        	root.right = insertRec(root.right, input);
 
        /* return the (unchanged) node pointer */
        return root;
    }
    
    /* A recursive function to insert a new node in BST */
    public void removeRec(Node<T> root, Node<T> input)
    {
		try
		{
			/*If node to be deleted is root.*/
			if (input.compareTo(root) == 0)
			{
				this.root = null;
				this.size--;
				return;
			}
			/*If the node to be deleted is to the right or the left of the current root.*/
			if (input.compareTo(root.left) == 0 || input.compareTo(root.right) == 0) 
			{
				/*Case for when node to be deleted has no children.*/
				if(input.left == null && input.right == null)
				{
					if(input.compareTo(root.left) == 0)
						root.left = null;
					else
						root.right = null;
				}
				
				/*Case for when node to be deleted has two children.*/
				if(input.left != null && input.right != null)
				{
					Node<T> temp = input;
					
					if(input.compareTo(root.right) == 0)
						root.right = temp.left;
					else
						root.left = temp.left;
					
					root.right.right = temp.right;
					this.size--;
					return;
				}
				
				/*Case for when node to be deleted has one or more children.*/
		    	if(input.left != null || input.right != null)
		    	{		    		
		        	if(input.left != null)
		        	{
		        		if(input.compareTo(root.left) == 0)
		        			root.left = input.left;
		        		else
		        			root.right = input.left;
		        	}
		        	
		        	if(input.right != null)
		        	{
		        		if(input.compareTo(root.left) == 0)
		        			root.left = input.right;
		        		else
		        			root.right = input.right;
		        	}
		    	}
	    	this.size--;
			return;
			}
		
		} catch (Exception e)
		{
			
		}
    	
    	try
    	{
    		/* Otherwise, recur down the tree */
	        if (input.compareTo(root) <= 0)
	        	removeRec(root.left, input);
	        else if (input.compareTo(root) >= 0)
	        	removeRec(root.right, input);
    	} catch (Exception e)
    	{
    		
    	}
    }
    
    // This method mainly calls InorderRec()
    public void inorderTraverseTree()
    {
    	inorderTraverseTreeRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    private void inorderTraverseTreeRec(Node<T> root)
    {
        if (root != null) {
        	inorderTraverseTreeRec(root.left);
            System.out.println(root.data);
            inorderTraverseTreeRec(root.right);
        }
    }
}
