package lecture3.redefiningMethods;

public class JustHuman {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public JustHuman(String name) {
        this.name = name;
    }

    public JustHuman(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public JustHuman(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public JustHuman(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


}
