public class First{
    public  class Node{
        int data;
        Node next;   
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

 // =================Making Head and Tail=============
    public static Node head;
    public static Node tail;
    public static int size;


// Add the data in the linkedlist, we make the methods to add the data on the first


public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if (head == null) {     // Check first condition
        head = tail = newNode;
        return;
       
    }

    // Step 2 Link
    newNode.next=head;   

    // Step 3
    head=newNode;

}
    // Add the data in the last node to the tail.

public void Addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }

    tail.next=newNode;
    tail=newNode;
}


public void AddMiddle(int data, int idx){

    if(head==null || idx==0 ){
        addFirst(data);
        return;

    }
    Node newNode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}




public void PrintLink(){
    if(head==null){
        System.out.println("LinkedList is Empty");
        return;
    }
    Node temp=head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    
    System.out.println("null");
 
}

// public void Reverse(){
//     Node prev = null;
//     Node curr = head;
//     Node next;
//     while(curr!=null){
//         next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;
//     }
//     head=prev;
// }


// As a Recursive
public void Reverse() {
    head = reverseRecursive(head, null);
}

private Node reverseRecursive(Node curr, Node prev) {
    if (curr == null) {
        return prev; 
    }
    Node next = curr.next; 
    curr.next = prev; 
    return reverseRecursive(next, curr); 
}
  




  
    public static void main(String[] args) {
        First ll=new First();
        ll.PrintLink();
        ll.addFirst(2);
        ll.PrintLink();
        ll.addFirst(1);
        ll.PrintLink();
        ll.Addlast(3);
        ll.AddMiddle(10,3 );
        ll.PrintLink();
        ll.Addlast(4);
        ll.PrintLink();
        System.out.println("----------");
        ll.Reverse();
        ll.PrintLink();
        System.out.println("The size of the LinkList is "+size);
        
    }
}