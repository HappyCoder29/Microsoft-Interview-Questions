package edu.northeastern.ashish;

public class MaxStack {

    private Element headMain;
    private Element headMax;

    public MaxStack(){}

    public void push(int x){
        Element add = new Element(x);
        Element addMax = new Element(x);

        if(headMain == null){
            headMain = add;
            headMax = addMax;
            return;
        }
        add.next = headMain;
        if(addMax.data < headMax.data){
            addMax.data = headMax.data;
        }
        addMax.next = headMax;
        headMax = addMax;
        headMain = add;
    }

    public int pop(){
        if(headMain == null )
            return Integer.MIN_VALUE;
        int data = headMain.data;
        headMain = headMain.next;
        headMax = headMax.next;
        return  data;
    }

    public int top(){
        if(headMain == null )
            return Integer.MIN_VALUE;
        return headMain.data;
    }

    public int peekMax(){
        if(headMax == null )
            return Integer.MIN_VALUE;
        return headMax.data;
    }
    public int popMax(){
        if(headMain == null){
            return Integer.MIN_VALUE;
        }
        while(headMain != null){
            if(headMain.data == headMax.data){
                int data = headMain.data;
                headMain = headMain.next;
                headMax = headMax.next;
                return  data;
            }
        }

        return Integer.MIN_VALUE;
    }




}
