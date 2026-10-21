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
    void insertAtBegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    void display(){
        Node temp=head;
        if(head==null) System.out.println("List is empty!");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

class Main{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        int val;
        do{
            val=sc.nextInt();
            if(val!=-1)
            ll.insertAtBegin(val);
        }while(val!=-1);
        ll.display();
    }
}