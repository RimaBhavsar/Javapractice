package loops;

public class WhileDoWhile {


//        int a=1;
//        int b=2;
//
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }
//        do {
//            System.out.println(b);
//            b++;
//        }
//            while(b<=10);
//
//

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        c = a + b;
        System.out.println(c);
        while (c < 89) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c); //This is fabonacci series

        }
    }
    }

