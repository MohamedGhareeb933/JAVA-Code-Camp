package DataStructure;

import com.sun.org.apache.xpath.internal.objects.XNodeSet;

public class Main {

    public static class Node {
        public int data;
        public Node left;
        public Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void print(Node next, int space, int t) {
        int count  = 3;
        if (next == null) { return; }
        space += count;

        print(next.right, space, 1);
        for (int i = 0; i <space; i++) {
            System.out.print(" ");
        }

        System.out.println(next.data);

        print(next.left, space, 2);
    }

    public static void main(String [] args) {
        Node next = new Node(1);
        next.left = new Node(2);
        next.right = new Node(3);
        next.left.left = new Node(4);
        next.left.right = new Node(5);
        next.right.left = new Node(6);
        next.right.right = new Node(7);

        print(next, 0, 0);
    }
}
