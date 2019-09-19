import java.util.Scanner;
class SinglyLl2 
{ 
    Node head;  
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    void moveToFront() 
    { 
       
           if(head == null || head.next == null)  
              return; 
  
        Node secLast = null; 
        Node last = head; 
  
        while (last.next != null)   
        { 
           secLast = last; 
           last = last.next;  
        } 
  
        secLast.next = null; 
        last.next = head; 
        head = last; 
    }                  
  
    public void insert(int new_data) 
    { 
        
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    void printList() 
    { 
        Node temp = head; 
        while(temp != null) 
        { 
           System.out.print(temp.data+" "); 
           temp = temp.next; 
        }   
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        SinglyLl2  llist = new SinglyLl2 (); 

        Scanner values = new Scanner(System.in);
            System.out.println("Enter the number of values");
            int n= values.nextInt();
         for(int j = 0; j< n; j++)
         {  Scanner myObj = new Scanner(System.in);
            System.out.println("Enter values");
            int val= myObj.nextInt();
            llist.insert(val); 
         }
          
        System.out.println("List before moving from last to front "); 
        llist.printList(); 
          
        llist.moveToFront(); 
          
        System.out.println("List after moving from last to front "); 
        llist.printList(); 
    } 
}  