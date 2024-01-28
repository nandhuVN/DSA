import java.util.*;
class node{
    int data;
    node next;
    public node(int data){
        this.dat=data;
        this.next=null;
    }
}

public class queuelist{
    private statc final int MAX_SIZE=100;
    private node front=null;
    private node rear=null;
    public void enqueue(int value){
        if(size()<MAX_SIZE){
            node newNode=new node(value);
            if(rear==null){
                front=newNode;
                rear=newNode;
            }
            else{
                rear.next=newNode;
                rear=newNode;
            }
        }
    }
    public int size(){
        int count=0;
        node current=front;
        while(current!=null);{
            count++;
            curret=current.next;
        }
        return count;
    }
    public static void main(String args[]){
        
    }
}