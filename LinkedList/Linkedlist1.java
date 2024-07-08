
public class Linkedlist1 {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    //Adding the element in the first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        //check the condition for head==null or not
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step-> 2
        newNode.next = head;

        // step-3 to store or add
        head = newNode;
    }

    //add the element in the last of the list
    public void addLast(int data) {
        // creating a new Node for the adding the element
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step -> 2
        tail.next = newNode;

        // step -> 3
        tail = newNode;
    }


    // Add the element in the given index

    public void AddMiddle(int data, int idx){
        Node newNode=new Node(data);
        if(head ==null || idx == 0){
            addFirst(data);
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void PrintLink() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Nulls");

    }

    public static void main(String[] args) {
        Linkedlist1 l = new Linkedlist1();
        l.PrintLink();
        l.addFirst(2);
        l.addFirst(1);       
        l.addLast(3);
        l.addLast(4);
        l.AddMiddle(10, 2);
        l.PrintLink();

    }

}
