package loops;

public class AbstractionChild extends Abstraction{
    public static void main(String[] args) {
        AbstractionChild abstractionChild = new AbstractionChild();
        abstractionChild.nameOfAnimal();


        }

    @Override
    void nameOfAnimal() {
        System.out.println("lion");

    }
}