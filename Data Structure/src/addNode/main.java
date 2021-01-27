public class main {

    Node head;  // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public Node append(int new_data)
    {
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null)
        {
            return head = new_node;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return head;
    }

    public void pushFront(int data) {
        Node temp = new Node(data);

        temp.next = head;
        head = temp;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String [] args ) {

        main m = new main();
        m.pushFront(7);
        m.pushFront(6);
        m.pushFront(5);
        m.pushFront(4);


        m.printList();
    }
}
