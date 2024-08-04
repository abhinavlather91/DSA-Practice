package linkedList;

public class LinkedListDefinition {

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node head;

    public static void addNode(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        return;
    }

    public static int getLength() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            addNode(i);
        }

        System.out.println(getLength());
    }
}
