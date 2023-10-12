class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class insertLl {
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp = tail;
            }

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(9);
        ll.display();
    }
}
