class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class printLl3 {
    public static void displayr(Node head) {
        if (head == null) {
            return;
        }
        displayr(head.next);
        System.out.print(head.data + " -> ");
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayr(a);
    }
}
