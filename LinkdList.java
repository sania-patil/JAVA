class LinkdList{
    class node{
        int data;
        node next;
    
    // node head;
    node(int data)
    {
    
        this.data = data;
        this.next = null;
        return;
    }
}
    node head;
    public void addfirst(int data)
    {
        node newnode = new node(data);
       if(head == null)
        {
            head = newnode;
            return;
        } 
        newnode.next = head;
        head=newnode;   

        return;
    }


    
    public void addlast(int data)
    {
        node newnode = new node(data);
        if(head == null)
        {
            head = newnode.next;
            return;
        }
        node currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newnode;
    }

// add in between
public void addinbetween(int data, int position)
{
    node newnode = new node(data);
    if(position == 0)
    {
        newnode.next=head;
        head=newnode;
        return;
    }
    node currentNode = head;
    int count=0;
    while(currentNode!=null && count < position-1)
    {
        currentNode = currentNode.next;
        count++;
    }
    if(currentNode == null)
    {
        System.out.println("Position out of range");
        return;
    }
    newnode.next = currentNode.next;
    currentNode.next = newnode;

}

    // to print list
    public void printlist()
    {
        node currentNode = head;
        while(currentNode != null)
        {
            System.out.print(currentNode.data + " " );
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // delete first
    public void deletefirst()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    // delete last
    public void deletelast()
    {
        if(head == null){
            System.out.println("list is empty");
        }
        if(head.next==null)
        {
            head=null;
        }
        node currentNode = head;
        while(currentNode.next.next!=null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next=null;
    }


    // iterative way to reverse list
    public void reverse()
    {
        node prevnode = head;
        node currnode = head.next;
        while(currnode != null)
        {
            node nextnode = currnode.next;
            // for arrange in reverse order
            currnode.next = prevnode;

            // update = elementss shift one place back
            prevnode = currnode;
            currnode = nextnode;
        }
        head.next = null;
        head = prevnode;
    }

    // recursive way to reverse
    public node reverseRecursive(node head)
    {
        if(head == null || head.next == null)
        {
            return head; //bcz it contain only one element in linked list
        }
        node newhead = reverseRecursive(head.next);
        head.next.next = head;   // to connect to nodes in reverse manner and directly
        head.next = null; // to remove connection in direct manner
        return newhead;
    }
    public static void main(String[] args){
        LinkdList ll = new LinkdList();
       ll.addfirst(39);
    //    System.out.println(add);
       ll.addlast(2);
    //    System.out.print(back);
        ll.printlist();
        ll.addfirst(5);
        ll.printlist();

        ll.deletefirst();
        ll.reverse();
        ll.printlist();
        ll.head = ll.reverseRecursive(ll.head);
        ll.printlist();
        ll.deletelast();
        ll.printlist();
        ll.addinbetween(14,1);
        ll.printlist();
    }

}