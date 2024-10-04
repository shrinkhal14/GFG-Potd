class Solution {
    Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head;
        }

        Node prev = null, current = head, next = null;
        Node tail = head;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;
        head = prev;
        return head;
    }

    Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }

        if (head.data == key) {
            if (head.next == head) {
                return null;
            }

            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;

            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.data == key) {
            prev.next = curr.next;
        }

        return head;
    }
}
