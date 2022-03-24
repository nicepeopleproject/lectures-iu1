package lecture3.interfaces.canTellJokes;

public class TellJokeOnlyIfYouCan {
    public static void main(String[] args) {
        Object[] creatures = new Object[]{new Dog(), new Orc(), new Human(), new Human(), new Dog()};

        for (Object creature : creatures) {
            System.out.println(creature.getClass());
            if (creature instanceof CanTellJokes) {
                ((CanTellJokes) creature).tellJoke();
            }
            System.out.println("==============");
            System.out.println("");
            System.out.println("");
        }
    }
}
