package classes;
public class Person {
    private final String name;
    private int age;

    // construtor com parâmetros

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
