package loops;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.sum();
        mo.sum(10, 20);
        mo.sum(10, 10.5);
        mo.sum(10, 20, 30);
    }
    public void sum(){
      int a=10;
      int b=20;
        System.out.println(a+b);
    }
    public void sum(int x,int y) {
        int a = x;
        int b = y;
        System.out.println(a + b);
    }
    public void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    public void sum(int x, double y){
        System.out.println(x+y);



    }





}

