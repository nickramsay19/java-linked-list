public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        setHead(head);
    }

    public LinkedList() {
        setHead(null);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int get(int n) {
        return 0;
    }

    /**
     * Append a value into a linked list.
     * @param value The integer to be appended to the back of the LinkedList.
     * @return true If the value is appended successfully.
     * @return false If the value cannot be appended successfully.
     */
    public boolean append(int value) {

        // check if head is tail
        if (head == null) {
            // then set head
            head = new Node(value);
            return true;
        }

        // otherwise, find the tail
        Node node = head;

        while(node.getNext() != null) {
            node = node.getNext();
        }

        // node is now the tail
        node.setNext(new Node(value));

        return true;
    }

    /**
     * Insert a value into a linked list.
     * @param value The integer to be inserted into the LinkedList.
     * @param n The place where the value will be inserted.
     * @return true If the value is inserted successfully.
     * @return false If the value cannot be inserted successfully.
     * @throws Exception If n is non-negative.
     */
    public boolean insert(int value, int n) throws Exception {

        // first we check if n is non-neg
        if (n < 0) {
            throw new Exception("Integer n must be non-neg.");
        }

        // check if head is tail
        if (head == null && n == 0) {
            // then set head
            head = new Node(value);
            return true;
        } else if (head == null) {
            return false;
        } else if (n == 0) {
            head = new Node(value, head);
            return true;
        }

        // otherwise, find the tail
        Node node = head;
        int i = 0;

        while(node.getNext() != null) {
            // get the next node
            node = node.getNext();

            // check if i at n
            if (++i == n) {
                Node newNext = new Node(node.getValue(), node.getNext());
                node.setValue(value);
                node.setNext(newNext);
                System.out.println("2");
                return true;
            }
        }

        // node is now the tail
        if (i + 1 == n) {

            //node.setNext(new Node(value));
            System.out.println("1");
            //node.setValue(value); 
            //node.setNext(null);

            node.setNext(new Node(value, null));
            return true;
            //Node newNext = new Node(node.getValue(), null);
            //node.setValue(value);
            //node.setNext(newNext);
        }

        return false;
        
    }

    /**
     * Gets the amount of items in the LinkedList.
     */
    public int length() {

        // check if head is tail
        if (head == null) {
            return 0;
        }

        // otherwise, find the tail
        //System.out.println("head: " + String.valueOf(head.getValue()));
        Node node = head;
        int i = 1;
        
        while(node.getNext() != null) {
            node = node.getNext();
            i++;
             
        }

        return i;
    }

    /**
     * Returns a string representation of the LinkedList showing all items within.
     */
    public String toString() {

        // check if head is tail
        if (head == null) {
            return "[]";
        }

        

        // otherwise, find the tail
        //System.out.println("head: " + String.valueOf(head.getValue()));
        Node node = head;
        String s = String.valueOf(node.getValue());
        
        while(node.getNext() != null) {
            node = node.getNext();
            //System.out.print(node.getValue());
            //System.out.print(", ");
            s += ", " + String.valueOf(node.getValue());
            //System.out.print(", " + String.valueOf(node.getValue()));
             
        }
        //System.out.println("");
        return s;
    }
    
}