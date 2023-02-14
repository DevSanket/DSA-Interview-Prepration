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

    static Node deleteNode(Node head, int val) {
        if (head == null) {
            return null;
        }

        Node curr = head, prev = new Node();

        while (curr.data != val) {
            if (curr.next == head) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        // if node is the only one in list
        if (curr.next == head) {
            return head;
        }

        // deleting the head
        // if there are more elements in node
        if (curr == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = curr.next;
            prev.next = head;
        }

        // if node is the last node
        else if (curr.next == head) {
            prev.next = head;
        } else {
            prev.next = curr.next;
        }

        return head;

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

    // Counting Nodes
    static int countNodes(Node head) {
        Node temp = head;
        int count = 0;
        if (head != null) {
            do {
                temp = temp.next;
                count++;
            } while (temp != head);
        }

        return count;
    }

    static Node toCircular(Node head) {
        Node start = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = start;
        return start;
    }

    public static void main(String[] args) {
        Node head = null;

        head = push(head, 33);
        head = push(head, 13);
        head = push(head, 35);

        cprintList(head);

    }

}
