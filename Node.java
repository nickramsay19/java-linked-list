public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        setValue(value);
        setNext(next);
    }

    public Node(int value) {
        setValue(value);
        setNextToDefault();
    }

    public Node() {
        setValueToDefault();
        setNextToDefault();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private void setValueToDefault() {
        this.value = 0;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private void setNextToDefault() {
        this.next = null;
    }

}
