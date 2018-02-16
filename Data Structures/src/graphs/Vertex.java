package graphs;

public class Vertex<T> implements Comparable<Vertex<T>>
{
	private Vertex<T> parent;
	private Neighbor<T> neighbors;
	private T data;
	
	public Vertex()
	{
		this.parent = this;
	}
	
	public Vertex<T> data(T data) {
		this.data = data;
		this.parent = this;
		return this;
	}
	
	public Vertex<T> neighbors(Neighbor<T> neighbors)
	{
		this.neighbors = neighbors;
		this.parent = this;
		return this;
	}
	
	public Vertex<T> getParent() {
		return this.parent;
	}
	
	public Neighbor<T> getNeighbors() {
		return this.neighbors;
	}
	
	public T getData() {
		return this.data;
	}

	@Override
	public int compareTo(Vertex<T> o)
	{
		return 0;
	}
}
