public class CircularLinkedList {
    static class Node {
        int data;
        Node next;
    }

    static Node push(Node head_ref, int data) {
        Node new_node = new Node();
        Node tmp = head_ref;
        new_node.data = data;
        new_node.next = head_ref;

        if (head_ref != null) {
            while (tmp.next != head_ref) {
                tmp = tmp.next;
            }

            tmp.next = new_node;
        } else {
            new_node.next = new_node;
        }

        head_ref = new_node;

        return head_ref;

    }

    static void cprintList(Node head) {

        Node temp = head;

        if (head != null) {
            do {
                System.out.println(temp.data);
                temp = temp.next;
            } while (temp != head);
        }

    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 33);
        head = push(head, 13);
        head = push(head, 35);

        cprintList(head);

    }

}
