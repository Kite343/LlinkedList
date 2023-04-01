package LlinkedList;

public class Node {
    private Node next;
    private Node prev;
  
    String value;
  
    public Node(String value) {
      this.value = value;
    }
  
    public Node getPrev() {
      return prev;
    }
  
    public void setPrev(Node prev) {
      this.prev = prev;
    }
  
    public String getValue() {
      return value;
    }
  
    public Node getNext() {
      return next;
    }
  
    public void setNext(Node next) {
      this.next = next;
    }
  
    public Node(Node next, String value) {
      this.next = next;
      this.value = value;
    }
  
    @Override
    public String toString() {
      return value;
    }
}
