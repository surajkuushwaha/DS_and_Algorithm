package LinkedList1;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node= new Node(val);
//        node.next= head;
        head=node;
        if(tail==null){
            tail=head;
        }
    }

    private class Node {
        private int value;
        private int node;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, int node) {
            this.value = value;
            this.node = node;
        }
    }


}
