package method;

public class ifelsegame {
    public static void main(String[] args) {
        ifelsegame ifelsegame = new ifelsegame();
        ifelsegame.myPoints(3082);
    }
    public void myPoints(int points){

        if (points>=0 && points<=1000){
            System.out.println("Your kill rate is noob");
        }else if (points>=1001 && points<=2000){
            System.out.println("Your kill rate is rookie");
        }else if (points>=2001 && points<=3000){
            System.out.println("Your kill rate is dino");
        }else if (points>3001 && points<=4000){
            System.out.println("Your kill rate is pro");
        }else if (points>=4001 && points<=5000){
            System.out.println("Your kill rate is elite");
        }else if (points>=5001 && points<=6000){
            System.out.println("Your kill rate is master");
        }else if (points>=6001 && points>=7000){
            System.out.println("Your kill rate is legends");
        }
    }
}
