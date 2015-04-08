package laba9;

/**
 * Created by student on 08.04.2015.
 */
public class Test {
    public static void main(String[] args) {
        My myList=new My();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        System.out.println("printed likedlist"+myList);
        System.out.println("size list"+myList.size());
        System.out.println("remove second"+myList.remove(2));


    }
}
