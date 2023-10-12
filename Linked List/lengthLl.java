class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class lengthLl {
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
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
        System.out.print("Length Is : " + length(a));

    }
}
