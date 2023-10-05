/**
 * Application class to simulate the queue operations in VegeBurger Palace.
 */
public class Application {
	
    private QueueADT queue;

    /**
     * Initializes the application with an empty queue.
     */
    public Application() {
    	
        this.queue = new QueueADT();
    }
    public static void main(String[] args) {

    /**
     * Main method to run the simulation.
     * 
     * @param args Command line arguments.
     */
        Application applic = new Application();
        // Enqueue and dequeue based on the queue.
        applic.enqueueline("Ronish");
        applic.enqueueline("Bill");
        applic.dequeueline();
        applic.enqueueline("Alice");
        applic.dequeueline();
    }

    /**
     * Enqueues a customer to the queue.
     * 
     * @param name The name of the customer.
     */
    public void enqueueline(String name) {
        queue.enqueue(name);
        
        System.out.println(name + " arrives.");
        printCustomers();
    }

    /**
     * Dequeues a customer from the queue and displays who was served.
     */
    public void dequeueline() {
        String served = queue.dequeue();
        
        
        if (served != null) {
            System.out.println(served + " is now served.");
            printCustomers();
        }
    }

    /**
     * Displays the current state of the queue.
     */
    public void printCustomers() {
        System.out.print(" Is currently in queue: ");
        
        queue.printQueue();
    }


}
