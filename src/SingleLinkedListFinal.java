import java.util.NoSuchElementException;

public class SingleLinkedListFinal<T> {


    private Node head; //head Node
    private Node tail; //tail Node
    private int size = 0;


    class Node {
        private T data; //data field
        private Node link; //link field

        private Node(T data, Node link) {
            this.data = data;
            this.link = link;
        }
    }


    public T getFirst() {
        final Node f = head;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return f.data;
    }


    public T getLast() {
        final Node l = tail;
        if (l == null)
            throw new NoSuchElementException();
        return l.data;
    }


    public void add(T data) {
        linkLast(data);
    }


    public void add(int index, T data) {
        checkPositionIndex(index);

        if (index == 0)
            linkFirst(data);
        else if (index == size)
            linkLast(data);
        else
            linkBefore(data, index);
    }

    public int size() {
        return size;
    }

    public void addFirst(T data) {
        linkFirst(data);
    }


    public Node get(int index) {
        checkPositionIndex(index);
        return node(index);
    }


    public void display() {
        Node tempHead = head;
        for (int i = 0; i < size; i++) {

            if (i == size - 1) //Last..
                System.out.print(tempHead.data);
            else
                System.out.print(tempHead.data + "->");

            tempHead = tempHead.link;
        }
    }


    private void linkFirst(T data) {

        //새로운 Node 구성
        final Node newNode = new Node(data, null);
        newNode.data = data;

        //새로운 노드의 link 는 기존의 head 노드
        newNode.link = head;

        //기존의 head 를 newNode 로 지정.
        head = newNode;

        if (tail == null) { //tail이 null 인경우 데이터가 한번도 삽입되지 않음.
            tail = head;
        }

        size++;
    }

    private void linkLast(T data) {

        final Node newNode = new Node(data, null);
        newNode.data = data;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.link = newNode;
            tail = newNode;
        }

        size++;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }


    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException();
    }


    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }


    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException();
    }


    private void linkBefore(T data, int index) {

        final Node newNode = new Node(data, null);
        newNode.data = data;

        Node prev = node(index - 1);
        newNode.link = prev.link;
        prev.link = newNode;

        size++;
    }


    public T remove(int index) {
        checkElementIndex(index);

        if (index == 0)
            return unlinkFirst(node(index));

        return unlink(index);
    }


    public T removeFirst() {
        if (head == null)
            throw new NoSuchElementException();
        return unlinkFirst(head);
    }


    private T unlinkFirst(Node f) {

        //f 는 head 첫번째 노드
        T tempData = f.data; //삭제될 데이터를 리턴할 임시 객체

        Node tempNode = f; //head의 첫노드를 임시로 저장
        head = tempNode.link; //head는 임시저장된 head의 다음 노드로 지정

        //help gc
        f = null;
        tempNode = null;

        size--;

        return tempData;
    }


    private Node node(int index) {
        Node temp = head; //head 노드를 임시로 저장

        //index 만큼 돌면서 포지션의 Node에 접근하여 해당 노드 리턴
        for (int i = 0; i < index; i++) {
            temp = temp.link;
        }
        return temp;
    }


    private T unlink(int index) {
        Node old = node(index - 1); //포지션의 이전 노드를 구해옴.
        Node current = old.link; //이전노드의 link는 현재 포지션의 노드이므로, 임시 저장한다.
        T temp = current.data; //삭제하면서 반환될 임시 데이터
        old.link = current.link; //이전노드의 link는 현재노드의 link로 지정한다.

        current = null; //help gc

        size--;

        return temp;
    }


}




