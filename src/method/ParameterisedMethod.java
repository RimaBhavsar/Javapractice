package method;

public class ParameterisedMethod {
    public static void main(String[] args) {
        add(10,20);
        ParameterisedMethod p = new ParameterisedMethod();
                p.printMyAddress("kenton road", "ha3 0bt");
    }

        public static void add (int a , int b){
        System.out.println(a+b);


    }
    public void printMyAddress(String streetname, String postcode){
        System.out.println(streetname+" "+postcode);
        
    }
}
