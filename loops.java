class loop{
    public static void main(String[] args)
    {
        // While loop

        int i=1;
        while(i<5)
        {
            System.out.println("hello" + i);
            i++;
        }
        System.out.println("bye" + i);

        // for loop

        for(int i=1;i<8;i++)
        {
            System.out.println ("Day " + i);
            for(int j=1;j<30;j++)
            {
                System.out.println(" " + (j+1) + "-" + (j+2));
            }
        }

        //  Do while loop

        
    }
}