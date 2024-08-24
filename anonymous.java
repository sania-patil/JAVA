class anonymous{
    public anonymous()
    {
        System.out.println("object iis created");
    }

    public void show(){
        System.out.println("in a show method");
    }
    public static void main(String[] args){
        //anonymous object has no reference object so we cant reuse it
        new anonymous();
        // for calling methods
        new anonymous().show();
    }
}