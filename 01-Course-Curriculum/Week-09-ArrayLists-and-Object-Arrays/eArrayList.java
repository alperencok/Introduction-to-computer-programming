package Examples;

import java.util.ArrayList;

public class eArrayList {
    public static void main(String[] args) {
        ArrayList myList=new ArrayList();
        //java.util.ArrayList myList=new java.util.ArrayList();
        //Create
        myList.add("John Doe");
        myList.add("Jane Doe");
        //Read

        //String s=(String)myList.get(0);
        //System.out.println(s);

        System.out.println("---");

        //remove
        myList.remove("John Doe");

        for(Object object:myList){
            System.out.println(object);
        }
    }
}
