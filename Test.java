class Test {
    public static void main(String args[]) {
        int a,b,c,d;
        int x=100;
       if(x>0){
            a=1;
        }
        if(x<0){
            a=2;
        }
        if(x==100){
            a=3;
        }
        if(100>0){
            b=1;
        }
        if(true){
            c=1;
        }
        d=x>0?0:-1;
        System.out.println(a);
        System.out.println(b); //1
        System.out.println(c); //1
        System.out.println(d); //0
    }
}
