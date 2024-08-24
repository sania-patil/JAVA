enum Status
{
    Running,failed,pending,success;
}
class enums{
    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s.getClass().getSuperclass());
    switch(s)
    {
        case Running:
            System.out.println("all good");
            break;
        case failed:
            System.out.println("try again");
            break;
        case pending:
            System.out.println("please wait");
            break;
        default :
            System.out.println("all done");
            break;
    }

        if(s==Status.Running)
        {
            System.out.println("all good");
        }
        else if(s==Status.pending)
        {
            System.out.println("please wait");
        }
        else if(s==Status.failed)
        {
            System.out.println("try agaim");
        } else{
            System.out.println("All done");
        }
        // System.out.println(s);
        // System.out.println(s.ordinal());
        // // System.out.println(Status.values);
        // for(Status sa : ss)
        // {
        //     System.out.println(sa + ":" + sa.ordinal());
        // }


    }
}