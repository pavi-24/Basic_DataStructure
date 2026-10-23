// Search for a given value in the Linked List


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

    void SearchForNode(int data){
        if(head==null){
            System.out.println("list is Empty!!");
            return ;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                System.out.println(true);
                return;
            }
            temp=temp.next;
        }
        System.out.println(false);
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

        int delval=sc.nextInt();
        ll.SearchForNode(delval);
    }
}