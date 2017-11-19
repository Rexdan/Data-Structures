package graphs;

public class Vertex<T> implements Comparable<Vertex<T>>
{
	Vertex<T> parent;
	Neighbor neighbors;
	T data;
	
	public Vertex()
	{
		
	}
	
	public Vertex(T data)
	{
		this.data = data;
		parent = this;
	}
	
	public Vertex(T data, Neighbor neighbors)
	{
		this.data = data;
		this.neighbors = neighbors;
	}
	
	class Neighbor
	{
		/**
	     * Neighboring vertex.
	     */
	    public Vertex<T> vertex;
	    
	    /**
	     * Weight of edge to neighbor.
	     */
	    public int weight;
	    
	    /**
	     * Next neighbor in the linked list of neighbors.
	     */
	    public Neighbor next;

	    /**
	     * Initializes a new Neighbor object.
	     * 
	     * @param vertex Neighbor vertex
	     * @param weight Weight of edge to neighbor.
	     */
	    Neighbor(Vertex<T> vertex, int weight) {
	    	this.vertex = vertex;
	    	this.weight = weight;
	    }
	}

	@Override
	public int compareTo(Vertex<T> o)
	{
		return 0;
	}
}
