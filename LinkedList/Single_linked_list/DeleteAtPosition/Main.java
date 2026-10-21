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

    void DeleteAtPosition(int pos){
        if(head==null){
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }
        Node temp=head;
        int count=1;
        while(temp.next!=null && count!=pos-1){
            temp=temp.next;
            count++;
        }
        if(temp.next==null){
            System.out.println("position out of Bound!!");
            return ;
        }
        temp.next=temp.next.next;
    }
    void display(){
        if(head==null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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

        ll.display();
        int pos=sc.nextInt();
        ll.DeleteAtPosition(pos);
        ll.display();
    }
}