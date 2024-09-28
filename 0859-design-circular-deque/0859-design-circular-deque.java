class Node{
    public int val;
    public Node next;
    public Node prev;
    public Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class MyCircularDeque {
    Node head, tail;
    int size, cap;

    public MyCircularDeque(int k) {
        size = 0;
        cap = k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(head == null){
            head = new Node(value, null, null);
            tail = head;
        }else{
            Node temp = new Node(value, head, null);
            head.prev = temp;
            head = temp;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(head == null){
            head = new Node(value, null, null);
            tail = head;
        }else{
            tail.next = new Node(value, null, tail);
            tail = tail.next;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return - 1;
        return head.val;
    }
    
    public int getRear() {
        if(isEmpty()) return - 1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */