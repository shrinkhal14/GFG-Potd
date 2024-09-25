class Solution {
  
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; 
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow);

        Node firstHalf = head;
        Node reversedSecondHalf = secondHalf;
        while (reversedSecondHalf != null) {
            if (firstHalf.data != reversedSecondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            reversedSecondHalf = reversedSecondHalf.next;
        }

        

        return true; 
    }

    
    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}

