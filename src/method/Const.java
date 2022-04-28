package method;

public class Const {

    public static class Cons1 {
        int StuID;
        String StuName;
        //    public Cons1() {
//        StuID = 10;
//        StuName = "Josh";
//    }
//    public Cons1(int id) {
//        StuID = id;
//    }
//
        public Cons1(int id, String name) {
            StuID=id;
            StuName=name;
        }

        public void displayMessage() {
            System.out.println("Student ID: "+StuID);
            System.out.println("Student Name: "+StuName);
            System.out.println("Student class: +StuClass");
        }

        public static void main(String[] args) {
//        Cons1 s1 = new Cons1();
//        s1.displayMessage();
            Cons1 s3 = new Cons1(5, "Mark");
            s3.displayMessage();

//        Cons1 s3 = new Cons1(1,"James");
//        s3.displayMessage();
//        Cons1 s4 = new Cons1(142,"John");
//        s4.displayMessage();
//        Cons1 s5 = new Cons1(122,"Mike");
//        s5.displayMessage();
//        Cons1 s6 = new Cons1(1142,"Joe");
//        s6.displayMessage();
        }
    }



}
