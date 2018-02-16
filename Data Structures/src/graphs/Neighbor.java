package graphs;

public class Neighbor<T> {
	public Vertex<T> vertex;
    public int weight;
    public Neighbor<T> next;
    
    public Neighbor() {
    	
    }
    
    public Neighbor<T> vertex(Vertex<T> vertex) {
    	this.vertex = vertex;
    	return this;
    }
    
    public Neighbor<T> weight(int weight) {
    	this.weight = weight;
    	return this;
    }
    
    public Neighbor<T> next(Neighbor<T> next) {
    	this.next = next;
    	return this;
    }

	public Vertex<T> getVertex() {
		return this.vertex;
	}

	public int getWeight() {
		return this.weight;
	}

	public Neighbor<T> getNext() {
		return this.next;
	}
    
}
