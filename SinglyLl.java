public class SinglyLl
{
	class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addStart(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else{
			Node temp=head;
			head=newNode;
			head.next=temp;
		}
	}
	public void deleteFromFirst(){
		if(head==null){
			System.out.println("List is empty");
 			return;
		}
		else{
			if(head!=tail){
				head=head.next;
			}
			else{
				head=tail=null;
			}
		}
	}
	public void display(){
		Node current=head;
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		System.out.println("Adding nodes to start of the list");
		while(current!=null){
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		SinglyLl slist=new SinglyLl();
		slist.addStart(1);
		slist.addStart(2);
		slist.display();
		slist.addStart(3);
		slist.display();
		slist.addStart(4);
		slist.display();
		slist.deleteFromFirst();
		slist.display();
	}
}	
