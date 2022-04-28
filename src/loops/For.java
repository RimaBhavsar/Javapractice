package loops;

public class For {
    public static void main(String[] args) {

        for (int a = 5; a <= 10; a++) { // 5<10 (true then increase) run as (multi by 2)
            System.out.println(2* a);
        }
        System.out.println("----------------------");
        for (int a = 0; a <= 50; a +=5) { // 0<50 (true then increase by 5)
            System.out.println(a);
        }
        System.out.println("----------------------");
        for (int a = 10; a >= 1; a--) { // 10>1 (true then) reverse numbers & run as (multi by 10)
            System.out.println(10 * a);
        }
        System.out.println("----------------------");
        for (int a = 0; a <= 20; a+=2) { // 0<20 (true) 0+=2 to get even numbers (for odd numbers starts by a=1)
            System.out.println(a);
        }
        System.out.println("----------------------");
    }

}