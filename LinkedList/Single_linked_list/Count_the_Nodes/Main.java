// Count the Number of Nodes in the Linked List.


import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlist{
    private Node head;
    Linkedlist(){
        head=null;
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void countNodes(){
        if(head==null){
            System.out.println("List is Empty!!");
            return ;
        }

        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("No of Nodes = "+count);
    }
}

class Main{

    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        int val;
        do{
            val=sc.nextInt();
            if(val!=-1){
                ll.insertAtEnd(val);
            }
        }while(val!=-1);
         ll.countNodes();

    }
}