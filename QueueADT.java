
public class QueueADT {
    private Node front;
    private Node rear;
    

    /**
     * Initializes an empty queue.
     */
    public QueueADT() {
        this.front = this.rear = null;
    }

    //It Checks if the queue is empty or not.
     
    
     /** @return true if the queue is empty, and false if its not.
      */
     
    public boolean isEmpty() {
    	
        return front == null;
    }
    
    /**
     * Dequeues an item from the front of the queue.
     * 
     * @return The dequeued item. Returns null if the queue is empty.
     */
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        String item = front.data;
        
        front = front.next;
        
        if (front == null) {
            rear = null;
        }
        return item;
    }

    /**
     * Enqueues a new item to the rear of the queue.
     * 
     * @param item The item to be enqueued.
     */
   
    public void enqueue(String item) {
    	
        Node no = new Node(item);
        
        if (rear == null) {
            front = rear = no;
            return;
        }
        rear.next = no;
        rear = no;
    }

   

    /**
     * Prints the current  queue.
     */
    public void printQueue() {
    	
        Node curent = front;
        
        
        while (curent != null) {
            System.out.print(curent.data + " -----> ");
            curent = curent.next;
            
        }
        System.out.println("Null");
    }
}
