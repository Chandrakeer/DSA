package LinkedList._01_SingleLinkedList;

public class _01_CreateLinkedList{
    public static void main(String[] args) {

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(head);
    
    }
}