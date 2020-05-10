package edu.northeastern.ashish;

public class LinkList {
    public Node head;

    public LinkList(){

    }

    public void removeNthFromEnd(int n){
        if(n <=0)
            return;

        Node front = head;
        Node back = head;
        for(int i = 0; i < n; i ++){
            if(front != null)
                front = front.next;
        }
        if(front == null)
            return;
        front = front.next;
        while(front != null){
            front = front.next;
            back = back.next;
        }
        Node del = back.next;
        back.next = back.next.next;
        del = null;
        return;

    }


}
