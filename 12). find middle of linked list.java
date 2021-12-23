class Main{
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
         
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                                slow_ptr.data + "] \n");
         
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node curr = head;
        Node Next = null;
        while(curr != null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        node = prev;
        return node;
    }
    
    void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        Main list = new Main();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        System.out.println("Given Linked list");
        list.printList(head);
       // head = list.reverse(head);
        System.out.println("");
       // System.out.println("Reversed linked list ");
        list.printMiddle();
    }
    
}