package lecture3.redefiningMethods;

public class MakingHumansInDifferentWays {
    public static void main(String[] args) {

        // attention!!! you cannot create more constructors with 1-4 string params
        JustHuman justHuman1 = new JustHuman("Artem");
        JustHuman justHuman2 = new JustHuman("Artem", "Nikolaev");
        JustHuman justHuman3 = new JustHuman("Artem", "Nikolaev", "Lalalend");
        JustHuman justHuman4 = new JustHuman("Artem", "Nikolaev", "Lalalend", "+37126009155");

    }
}
