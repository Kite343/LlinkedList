package LlinkedList;

public class MyList {
    Node head;
    Node tail;
  
    public void addFirst(String... values) {
      for (String string : values) {
        this.addFirst(string);
      }
    }
  
    public void addFirst(String value) {
      Node node = new Node(value);
  
      if (head != null) {
        node.setNext(head);
        head.setPrev(node);
      } else {
        tail = node;
      }
      head = node;
    }
  
    public void removeFirst() {
      if (head != null && head.getNext() != null) {
        head.getNext().setPrev(null);
        head = head.getNext();
      } else {
        head = null;
        tail = null;
      }
    }
  
    public boolean contains(String value) {
      Node node = head;
      while (node != null) {
        if (node.getValue().equals(value)) {
          return true;
        }
        node = node.getNext();
      }
      return false;
    }
  
    public void addLast(String value) {
      Node node = new Node(value);
  
      if (tail != null) {
        node.setPrev(tail);
        tail.setNext(node);
      } else {
        head = node;
      }
      tail = node;
    }
  
    public void removeLast() {
      if (tail != null && tail.getPrev() != null) {
        tail.getPrev().setNext(null);
        tail = tail.getPrev();
      } else {
        head = null;
        tail = null;
      }
    }

    public void reverse() {
      Node node = head;
      
      while (node != null){

        Node temp = node.getNext();
        node.setNext(node.getPrev());
        node.setPrev(temp);

        node = node.getPrev();
      }
      node = this.tail;

      this.tail = this.head;
      this.head = node;

    }
}
