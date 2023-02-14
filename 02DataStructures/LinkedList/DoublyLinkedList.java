public class DoublyLinkedList {
    Node head;

    class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = head;

        if (head != null) {
            head.prev = new_node;
        }

        head = new_node;

    }

    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;
        new_node.prev = prev_node;

        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }
}
