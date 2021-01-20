package problemo.linkedlist;

public class LinkedList<T> {
    Node<T> head;

    void print() {
        Node temp = head;
        System.out.println("\nLinked List Contents - ");
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null)
                System.out.print(", ");
            temp = temp.next;
        }
    }

    void add(T t) {
        Node node = new Node(t);
        if(head==null)
            head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    void delete(T t) {
        if(head==null)
            System.out.println("\nList is empty.");
        else {
            Node temp = head;
            while (temp.next!=null && !temp.next.data.equals(t)) {
                temp = temp.next;
            }

            if(temp.next==null){
                System.out.println("\nElement not found.");
            } else {
                temp.next = temp.next.next;
            }
        }
    }
}


