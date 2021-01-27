package algorithm;

public class main {

     class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data ) {
            this.data = data;
            left = null;
            right = null;
        }
    }
     Node search(Node next, int data ) {

        if (next == null) {
            System.out.println("element is not found ");
            return null;
        }
        if (data == next.data) {
            System.out.println("Element found At Address: " + next);
            return next;
        }

        if (data > next.data) {
            search(next.right, data);
        } else if (data <= next.data) {
            search(next.left, data);
        }
        return next;
    }

     void insert(Node next, int data) {
        if (next == null) {
            next = new Node(data);
        } else if (data <= next.data) {
            if (next.left != null) {
                insert(next.left, data);
            } else {
                next.left = new Node(data);
            }
        } else if (data > next.data) {
            if (next.right != null) {
                insert(next.right, data);
            } else {
                next.right = new Node(data);
            }
        }
    }

    public static void main(String [] args) {
        main m = new main();
        Node n = m.new Node(5);
        m.insert(n, 1);
        m.insert(n, 7);
        m.insert(n, 97);
        m.insert(n, 67);

        m.search(n, 97);
    }
}
