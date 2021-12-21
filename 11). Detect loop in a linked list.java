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
    boolean hasCycle(Node node) {
       Node fast , slow;
        slow = fast = head;
        while((fast!=null) && (fast.next!=null))
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
        
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
        list.head = new Node(20);
        list.head.next = new Node(4);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(10);
        head.next.next.next.next = head;
        if (list.hasCycle(head))
         System.out.println("Loop Found");
        else
         System.out.println("No Loop");
    }
    
}