package lecture3;

import java.util.ArrayList;
import java.util.List;

public class ALotOfObjects {
    public static void main(String[] args) {
        Person person = new Person("Iam");
        System.out.println(person.getName());
        List<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(new Person("1"));
        persons.add(new Person("2"));
        persons.add(new Person("3"));
        persons.add(new Person("4"));
        persons.add(new Person("5"));
        printPersons(persons);
Object object;
    }

    private static void printPersons(List<Person> persons){
        for (Person tmpPerson: persons){
            System.out.println(tmpPerson.getName());
        }
    }
}

class Person{
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}
