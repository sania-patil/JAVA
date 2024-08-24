// multiple inheritance is not possible in java
class inheritance{
    public static void main(String[] args){
        advCalc ca = new advCalc();
     int r1=  ca.add(5,4);
        int r2 =ca.sub(5,4);
        int r3 = ca.mul(5,4);
        int r4 = ca.div(5,4);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}