public class SingleLinkedList3<T> {

    Node head;
    Node tail;
    private int size = 0;

    class Node {
        private T data;
        private Node link;

        public Node(T data, Node link) {
            this.data = data;
            this.link = link;
        }
    }

    public void linkLast(T data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.link = newNode;
            tail = newNode;
        }
        size++;
    }

    public void linkFirst(T data){
        Node newNode = new Node(data, null);
        head = newNode;
        tail = head.link;
        size++;
    }

    public void add(T data) {
        linkLast(data);
    }

    public void add(int index, T data) {
        if(size==0){
            linkFirst(data);
        }
        else if(index == size){
            linkLast(data);
        }
        else{
            linkBefore(index,data);
        }
    }

    private void linkBefore(int index, T data) {
        Node baseNode = node(index-1);
        Node newNode = new Node(data,null);

        newNode.link = baseNode.link;
        baseNode.link = newNode;

        size++;

    }



    public Node node(int index) {

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.link;
        }
        return node;

    }


}
