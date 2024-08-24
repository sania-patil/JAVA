class linkedlist
{
     node head;
    class node{
        String data;
        node next;
        node head;
    }
    void node(String data)
    {
        this.data = data;
        this.next = null; //first dont assign the link of node only create node with data
    }
    node head;
    // add first or last
    public void addfirst(String data)
    {
        node newnode = new newnode(data);
        if(head == null)
        {newnode.next = head;
        head = newnode;
    }
    }

    // add at last
    public void addlast(String data)
    {
        node newnode = new newnode(data);
        if(head == null)
        {
            head = newnode;
            // newnode = newnode.next;
            return;
        }
        node curNode = head;
        while(curNode != null)
        {
            curNode = curNode.next;
        }
        curNode.next = newnode;
    }
    public static void main(String[] args)
    {
        //create instance of main class
        linkedlist l1 = new linkedlist();
    }
}