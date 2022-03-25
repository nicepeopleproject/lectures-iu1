package lecture3.interfaces.jumpable;

public class Jumpers {
    public static void main(String[] args) {
        Jumpable cat = new Cat();
        cat.jump();
        System.out.println("=================");

        Jumpable athlete = new Athlete();
        athlete.jump();
        System.out.println("==============");

        Jumpable somebody = Math.random() >= 0.5 ? new Athlete() : new Cat();
        somebody.jump();

    }
}
