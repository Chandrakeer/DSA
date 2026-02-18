package LinkedList._01_SingleLinkedList;

// reference = pointer

public class _02_ArrayToLinkedList {

    private static Node ArrtoLL(int[] arr){

         // Step 1: Handle edge case (if array is empty)
        if (arr.length == 0) return null;
        
         // Step 2: Create head node using first element 
        Node head = new Node(arr[0]); // first node object created

        // Step 3: Reference used to traverse and build the list
        Node mover = head; // points to current last node

        // Step 4: Traverse array from index 1 and keep attaching nodes
        for ( int i = 1; i < arr.length; i++){

            Node temp = new Node(arr[i]); //new node object created
            mover.next = temp; // link current node to new node
            mover = temp; // move reference to new node
        }

         // Return head of linked list
        return head;
    }
    public static void main(String[] args){

        int[] arr = {12,20,30,40};

         Node head = ArrtoLL(arr);
         System.out.println(head.data);

    }
    
}
