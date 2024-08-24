import java.util.*;
class linkdlist2{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("a");
        System.out.println(list);
        list.addLast("Saniya");
        list.addLast("good");
        System.out.println(list);

        // size of linkedlist
        System.out.println("size:" + list.size());

        // print list
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + "->");
        }
        System.out.print("null");

        // delete first element
        list.removeFirst();
        System.out.println(list);

        // delete last element
        list.removeLast();
        System.out.println(list);

    }
}