//Time complexity : half of length of Linked List provided O(n)
//Space Complexity : O(1), space used by tortoise and hare

class LinkedList 
{ 
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    
    //Consider two nodes, Hare, Tortoise, for every two steps Hare takes, Tortoise takes 1 step, hence by the time Hare traverses the linkedlist once, Tortoise will exactly be at middle of the linklist, then return the  Tortoise node
    
    void printMiddle() 
    { 
        Node hare = head;
        Node tortoise = head;
        
        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;    
        }
        
        System.out.println("mid point is " +tortoise.data);
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList llist = new LinkedList(); 
        for (int i=15; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
} 
