public class SingleLinkedList<T> {

    private Node head;
    private Node tail;
    private int size = 0;

    public T get(int i) {
        Node node = node(i);
        return node.data;
    }


    class Node {
        private T data;
        private Node link;


        public Node(T data, Node link) {
            this.data = data;
            this.link = link;
        }
    }

    public void linkFirst(T data) {
        Node newNode = new Node(data, head);
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void linkBefore(T data, int index) {
        Node prev = node(index - 1);
        Node newNode = new Node(data, prev.link);
        prev.link = newNode;
        size++;
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

    public void removeFirst(Node temp) {
        head = temp.link;
        temp = null;
        size--;
    }

    public void remove(int index){
        Node oldNode = node(index-1);
        Node current = oldNode.link;
        oldNode.link = current.link;

        current =null;
        size--;

    }


    private Node node(int index) {
        Node temp = head; //head 노드를 임시로 저장
        //index 만큼 돌면서 포지션의 Node에 접근하여 해당 노드 리턴
        for (int i = 0; i < index; i++) {
            temp = temp.link;
        }
        return temp;
    }

    public void add(int index, T value) {

        if (index == 0) {
            linkFirst(value);
        } else if (index == size) {
            linkLast(value);
        } else {
            linkBefore(value, index);
        }
    }

    public void add(T value){
        linkLast(value);
    }

}
