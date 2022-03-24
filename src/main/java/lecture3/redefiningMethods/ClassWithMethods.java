package lecture3.redefiningMethods;

public class ClassWithMethods {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        getInfo(5.0);
//        getInfo(new Double(5.));
        getInfo(6);
//        getInfo(new Integer(6));
        getInfo("lalala");

    }

    private static void test1() {
        getInfo(5);
        getInfo(new Integer(5));
    }


//    // if add this what will happen?
//    public static void getInfo(double d) {
//        System.out.println("just a double");
//    }

    public static void getInfo(int a) {
        System.out.println("It's int :-)");
    }

    public static void getInfo(Integer a) {
        System.out.println("Integerrrrrrrrrrr");
    }

    public static void getInfo(Double d) {
        System.out.println("DOOOOOOOOOOOOBLEEEEEE");
    }

    public static void getInfo(String string) {
        System.out.println("Just a string...");
    }
}
