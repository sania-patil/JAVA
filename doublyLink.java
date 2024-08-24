class doublyLink{
    node head;
    node tail;
    class node{
        int data;
        node next;
        node prev;

        public node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev= null;
        }
    }
        public void forward(){
            // node newnode = new node(data);
            if(head == null)
            {
                System.out.println("list is empty");
                // head = newnode;
            }
            node currnode = head;
            while(currnode != null)
            {
                System.out.print(currnode.data + "->");
                currnode = currnode.next;

            }
            return;
        }
        public void backward()
        {
            if(head == null || tail == null)
            {
                System.out.println("list is empty");
            }
            node currnode = tail;
            while(currnode != null)
            {
                System.out.print(currnode.data + "->");
                currnode = currnode.prev;
            }
            return;
        }
       public void addFirst(int data)
    {
        // node currnode = head;
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }else{
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        }
    }
    // \end{code}  

        public static void main(String[] args)
        {
            doublyLink ll = new doublyLink();
            ll.addFirst(10);
            ll.addFirst(20);
            // ll.forward();
            ll.backward();
        }
    
}