//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ArrayList<Integer> re = new ArrayList<>();
        Node curr = head;
        
        // Populate the ArrayList with linked list node data.
        while (curr != null) {
            re.add(curr.data);
            curr = curr.next;
        }
        
        // Sort the ArrayList.
        sort(re);
        
        // Update linked list nodes with sorted values from ArrayList.
        curr = head;
        int i = 0;
        while (curr != null) {
            curr.data = re.get(i);
            curr = curr.next;
            i++;
        }
        
        return head;
    }
    
    // Function to sort an ArrayList of integers.
    public static void sort(ArrayList<Integer> re) {
        int temp = 0;
        for (int i = 0; i < re.size() - 1; i++) {
            for (int j = i + 1; j < re.size(); j++) {
                if (re.get(i) > re.get(j)) {
                    temp = re.get(i);
                    re.set(i, re.get(j));
                    re.set(j, temp);
                }
            }
        }
    }
}
