 int getMiddle(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("The list is empty");
        }
        
        Node slow = head;
        Node fast = head;
        
        // Traverse the list with two pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow is now at the middle of the list
        return slow.data;
    }
}
