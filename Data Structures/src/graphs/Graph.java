package graphs;
/**
 * This graph will be a weighted, undirected graph.
 * To be used with any kind of object.
 * 
 * @author Andre Pereira
 *
 */
public class Graph <T>
{
	Vertex<T> vertex;
	
	/**
	 * A constructor for graph data structure.
	 * Takes no arguments.
	 * 
	 */
	public Graph()
	{
		
	}
	
	/**
	 * Constructor for graph data structure. 
	 * 
	 * @param vertex A starting vertex.
	 */
	public Graph(Vertex<T> vertex)
	{
		this.vertex = vertex;
	}
}
