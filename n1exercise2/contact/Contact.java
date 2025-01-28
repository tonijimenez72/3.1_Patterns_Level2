package n1exercise2.contact;

public class Contact {
    private String name;
    private String surname;
    public Contact(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
