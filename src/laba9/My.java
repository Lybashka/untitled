package laba9;

/**
 * Created by student on 08.04.2015.
 */
public class My {
    private  Node head;
    private int listCount;
    public  My(){
        head=new Node(null);
        listCount=0;
    }
    public void  add(Object date){
        Node tmp=new Node(date);
        Node current=head;
        while(current .getNext()!=null) {
            current = current.getNext();
        }
        current.setNext(tmp);
        listCount++;

    }
    public void add(Object date,int index){
        Node tmp=new Node(date);
        Node current=head;
        for(int i=1; i<index&&current.getNext()!=null;i++){
            current=current.getNext();

        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        listCount++;
    }
    public  int size(){
        return listCount;

    }
    public Object get(int index){
        if(index<=0)
            return null;
        Node current=head.getNext();
        for(int i=1;i<index;i++){
            if(current.getNext()==null)
                return null;
            current=current.getNext();

        }
        return current.getDate();

    }

    public  boolean remove(int index){
        if(index<1&&index>size())
            return false;
        Node current=head;
        for(int i=1;i<index;i++){
            if(current.getNext()==null)
                return false;
            current=current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
    public String toString(){
        Node current=head.getNext();
        String  output="";
        while(current!=null)
        {
            output+="["+current.getDate().toString()+"]";
            current=current.getNext();
        }
        return output;
    }
}
