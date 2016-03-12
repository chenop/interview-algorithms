/*
 * Reverse a linked list in O(n)
 */

class ReverseLinkedList {
    public static void main(String[] args) {
        Node n4 = new Node(5, null);
        Node n3 = new Node(4, n4);
        Node n2 = new Node(3, n3);
        Node n1 = new Node(2, n2);


        Node head = n1;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null ) {
            return head;
        }

        Node n1 = head;
        Node n2 = head.next;
        n1.next = null;

        while (n2 != null) {
            Node tmp = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = tmp;
        }

        return n1;

    }


}
