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
    void insertAtend(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);
        if(head==null){
            System.out.println("List is empty!");
        }
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=1;
        Node temp=head;
        while(temp.next!=null && count<pos-1){
            temp=temp.next;
            count++;
        }
        if(temp==null) {
            System.out.println("Position Out of bound!");
            return ;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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

    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        Linkedlist ll=new Linkedlist();
        int val;
        do{
            val=sc.nextInt();
            if(val!=-1){
                ll.insertAtend(val);
            }
        }while(val!=-1);

        val=sc.nextInt();
        int pos=sc.nextInt();
        ll.insertAtPosition(val,pos);
        ll.display();
    }
}