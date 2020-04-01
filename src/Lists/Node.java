package Lists;

public class Node {

    private String str;
    private int num;
    public Node next;

    //constructor
    public Node(int data) {
        this.num = data;
    }

    public Node(String data) {
        this.str = data;
    }

    //getter
    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }

    public Node getNext() {
        return next;
    }

    //setter
    public void setNext(Node next) {
        this.next = next;
    }
}
