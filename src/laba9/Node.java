package laba9;

/**
 * Created by student on 08.04.2015.
 */
public class Node {
    Object date;
    Node next;
    public Node (Object date_Value){
        date=date_Value;
        next=null;
    }
    public Node (Object date_Value,Node nextValue){
        next=nextValue;
        date=date_Value;

    }
    public Object getDate(){
        return date;
    }
    public void setDate(Object date_Value){
        date=date_Value;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node nextValue){
        next=nextValue;
    }

    @Override
    public String toString() {
        String output="";
        output="Node{" +
                "date=" + date +
                ", next=" + next +
                '}';
        return output;
    }

}
