
public class Node {
    public String data;
    
    public Node next;

    /**
     * Constructor to create a new node which has data.
     * 
     * @param data The data to be stored in the node.
     */
    public Node(String data) {
    	
        this.data = data;
        this.next = null;
    }
}
