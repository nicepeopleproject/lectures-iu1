package lecture3.interfaces.canTellJokes;

public class Human implements CanTellJokes {
    @Override
    public void tellJoke() {
        System.out.println("2+2=5");
    }
}
