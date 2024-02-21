//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}

class DLinkedList
{
	
	Node newNode(Node head, int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
		    head = n;
		    return head;
		}
		head.next = n;
		n.prev = head;
		head = n;
		return head;
	}
	
	
	void printList(Node node)
	{
		Node temp = node;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		while(temp.prev != null)
		{
			temp = temp.prev;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DLinkedList DLL = new DLinkedList();
		int t = sc.nextInt();
		
		while(t>0)
		{
			Node temp;
			Node head = null;
			Node root = null;
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int x = sc.nextInt();
				head = DLL.newNode(head,x);
			    if(root == null)    root = head;
			}
			head = root;
			int pos = sc.nextInt();
			int data = sc.nextInt();
			
		    GfG g = new GfG();
		    g.addNode(head,pos,data);
			
			DLL.printList(head);
			while(head.next != null)
			{
				temp = head;
				head = head.next;
			}
		    t--;
		}
	}
}
// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
	    Node newnode=new Node(data);
	    if(head_ref==null){
	        head_ref=newnode;
	        return;
	    }
	    if(head_ref.next==null && pos==0){
	        head_ref.next=newnode;
	        newnode.prev=head_ref;
	        return;
	    }
	   
		int count=0;
		Node currnode=head_ref;
		Node prevnode=null;
		Node nextnode=head_ref.next;
		if(pos==0){
	        nextnode.prev=newnode;
	        head_ref.next=newnode;
	        newnode.next=nextnode;
	        newnode.prev=head_ref;
		    return;
		}
		
		while(currnode!=null && currnode.next!=null && count<pos){
		    prevnode=currnode;
		    currnode=currnode.next;
		    nextnode=nextnode.next;
		    count++;
		}
		 
		if(currnode.next==null){
		    newnode.prev=currnode;
		    currnode.next=newnode;
	    	newnode.next=null;
	    	return;
		
		}
		   newnode.next=nextnode;
		   newnode.prev = currnode;
		   nextnode.prev=newnode;
		   currnode.next=newnode;
		 
        // if (currnode != null)
        //     currnode.prev = newnode;
		
		return;
	}
}