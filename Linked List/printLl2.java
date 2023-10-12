class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class printLl2 {
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

        Node temp = a;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
