
public class Queue {
	
	//Define the data members
    private Node front;
    private Node rear;
    private int size;


	public Queue() {
		//Implement the Constructor
        front=null;
        rear=null;
        size=0;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node newNode=new Node(data);
        if (front==null)
        {
            front=newNode;
            rear=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }
        size=size+1;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if (front!=null)
        {
            int temp=front.data;
            front=front.next;
            size=size-1;
            return temp;
            
        }
        else
        {
            return -1;
        }
    }


    public int front() {
    	//Implement the front() function
        if (front!=null)
        {
            return front.data;
        }
        else
        {
            return -1;
        }
        
    }
}
