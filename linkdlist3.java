// linked list practice
import java.util.*;
class linkdlist3{
    node head;
    class node{
        int data;
        node next;
        node(){}
        node(int data)
        {
            this.data = data;
        }
        node(int data , node next)
        {
            this.data=data;
            this.next=next;
        }
    }

    public node removeNthFromEnd(node prev,int n)
    {
        node currNode = head;

        int size=0;
        while(currNode != null)
        {
            currNode = currNode.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int indexToSearch = size -n;
        int i=1;
        while(i<indexToSearch)
        {
            prev = head;
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        
    }
}