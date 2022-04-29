package loops;

public class Iphone implements MobileInterFace{
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.batteryTerminals();
        iphone.chargingConnector();
        iphone.displayScreen();
        iphone.keypad();
        iphone.simCardSocket();
    }

    public void keypad(){
        System.out.println("this is keyboard");
    }
    public void simCardSocket(){
        System.out.println("this is simcard setting");

    }
    public void batteryTerminals(){
        System.out.println("this is battery space");

    }
    public void chargingConnector(){
        System.out.println("this is charging port");

    }
    public void displayScreen(){
        System.out.println("this is my screen");

    }


}
