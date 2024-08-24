// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        // define arraylist
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<Boolean> list2 = new ArrayList<Boolean>();
        // ArrayList<String> list3 = new ArrayList<String>();
        list1.add(1);
        list1.add(2);
        list1.add(6);
        System.out.println(list1);


        // get element
        int element = list1.get(1);
        System.out.println(element);

        // add elements in between
        list1.add(1,10);
        System.out.println(list1);

        // set elements
        list1.add(0,4);
        System.out.println(list1);


        // delete element
        list1.remove(0);
        System.out.println(list1);

        // size of array list
        int size = list1.size();
        System.out.println(size);

        // for loop
        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}