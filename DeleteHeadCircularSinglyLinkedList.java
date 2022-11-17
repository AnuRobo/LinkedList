package dsa;

import java.util.*;
import java.io.*;
import java.lang.*;

class Node20{
        int data;
        Node20 next;
        Node20(int d){
            data=d;
            next=null;
        }
    }
  
public class DeleteHeadCircularSinglyLinkedList  { 
    
    public static void main(String args[]) 
    { 
        Node20 head=new Node20(10);
    	head.next=new Node20(20);
    	head.next.next=new Node20(30);
    	head.next.next.next=new Node20(40);
    	head.next.next.next.next=head;
    	head=delHead(head); // O(n)
    	head=delHeadd(head); // O(1)
    	printlist(head);
    	
    } 
    
    public static void printlist(Node20 head){
        if(head==null)return;
        Node20 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
    
    // Naive Approach
    static Node20 delHead(Node20 head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        Node20 curr=head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=head.next;
        return (curr.next);
    }
    
    // Optimize Approach
    private static Node20 delHeadd(Node20 head) {
    	if(head==null) return null;
    	if(head.next == head) {
    		return null;
    	}
    	
    	head.data = head.next.data;
    	head.next = head.next.next;
    	return head;
    }
} 