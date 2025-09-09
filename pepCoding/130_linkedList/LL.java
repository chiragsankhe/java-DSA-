class LL {
    // Head of linked list
    Node head;
    private int size;

    LL(){
        this.size = size;
       }
    // Node class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    

    // Add node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) { // If list is empty
            head = newNode;
            return;
        }

        newNode.next = head; // Point new node to old head
        head = newNode;      // Update head
    }

    // Add node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) { // If list is empty
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) { // Traverse till last node
            currentNode = currentNode.next;
        }
        currentNode.next = newNode; // Link last node to new node
    }

    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("null");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // delete first 
    public void deleteFirst(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last 
    public void deleteLast(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
             head = null;
             return;
        }

        Node currentNode = head;
        while(currentNode.next.next !=null){
            currentNode = currentNode.next;
        }

        currentNode.next = null;

    }
    
    // size 
    public int getSize(){
        return size;
    }

    // Main method to test
    public static void main(String args[]) {
        LL list = new LL();

        // Add at beginning
        list.addFirst("a");
        list.addFirst("is");

        // Print linked list
        list.printList();

        // Add at end
        list.addLast("Linked");
        list.addLast("List");

        // Print linked list
        list.printList();
        
        list.addFirst("this");

        // Print linked list
        list.printList();

        // deleteFirst
        list.deleteFirst();

        // Print linked list
        list.printList();

        // deleteLast 
        list.deleteLast();

        // Print linked list
        list.printList();

        // get size
        int getSize =  list.getSize();
        System.out.println("size of List -> " + getSize);

        // Print linked list
        list.printList();

        
    }
}
