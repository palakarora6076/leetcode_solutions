class Node {
    public int val;
    public Node next;

    public Node() {
        this.val = 0;
        this.next = null;
    }

    public Node(int x) {
        this.val = x;
        this.next = null;
    }
}

class MyLinkedList {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public MyLinkedList() {
    }

    // Get the value at index (0-based)
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Add at head
    public void addAtHead(int value) {
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
        if (tail == null) tail = newHead; // if list was empty
        size++;
    }

    // Add at tail
    public void addAtTail(int value) {
        Node newTail = new Node(value);
        if (tail == null) { // empty list
            head = newTail;
            tail = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }

    // Add at index (0-based)
    public void addAtIndex(int index, int value) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(value);
        } else if (index == size) {
            addAtTail(value);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newElement = new Node(value);
            newElement.next = temp.next;
            temp.next = newElement;
            size++;
        }
    }

    // Delete at index (0-based)
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (size == 1) tail = null; // list becomes empty
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) tail = temp; // deleted last node
        }
        size--;
    }
}

/**
 * Usage:
 * MyLinkedList obj = new MyLinkedList();
 * int val = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index, val);
 * obj.deleteAtIndex(index);
 */

