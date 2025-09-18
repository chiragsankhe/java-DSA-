import java.util.*;

class LL_using_collection_framwork {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();

        // Add at beginning and end
        ll.addFirst("learning");
        ll.addFirst("Im");
        ll.addLast("LinkedList");

        // Print list
        System.out.println("Initial List: " + ll);

        // Remove elements safely
        while (!ll.isEmpty()) {
            ll.removeLast();
        }
        System.out.println("After removing all elements: " + ll);

        
        // Take 10 user inputs
        System.out.println("Enter 10 items:");
        for (int i = 0; i < 10; i++) {
            ll.addLast(scn.nextLine());
        }

        // Final List
        System.out.println("Final List: " + ll);

        //size()
        System.out.println("size " + ll.size());


        



        

        scn.close();
    }
}
