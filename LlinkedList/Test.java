package LlinkedList;

public class Test {
    public static void main(String[] args) {

        MyList ml = new MyList();
        ml.addFirst("Раз", "Два", "Три");
    
        Node item = ml.head;
    
        while (item != null) {
          System.out.println(item);
          item = item.getNext();
        }

        System.out.println();

        ml.reverse();

        item = ml.head;
    
        while (item != null) {
          System.out.println(item);
          item = item.getNext();
        }

        System.out.println();

        ml.removeLast();
        ml.removeLast();

        ml.reverse();

        item = ml.head;
    
        while (item != null) {
          System.out.println(item);
          item = item.getNext();
        }

        System.out.println();

        ml.removeLast();

        ml.reverse();

        item = ml.head;
    
        while (item != null) {
          System.out.println(item);
          item = item.getNext();
        }
    
        // System.out.println(ml.contains("Два"));
        // System.out.println();
    
        // ml.removeLast();
    
        // System.out.println();
        // item = ml.head;
        // while (item != null) {
        //   System.out.println(item);
        //   item = item.getNext();
        // }
    
        // ml.addLast("Пять!");
    
        // System.out.println(
    
        // );
        // item = ml.head;
        // while (item != null) {
        //   System.out.println(item);
        //   item = item.getNext();
        // }
      }
}
