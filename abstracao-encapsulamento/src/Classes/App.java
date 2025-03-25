package Classes;


public class App {
    public static void main(String[] args) throws Exception {
        // classes, objetos, etc
        var male = new Person("João", 20);
        
        // male.setName("João");
        // male.setAge(20);

        var female = new Person("Maria", 18);
        
        // female.setName("Maria");
        // female.setAge (18);

        System.out.println("Male name: " + male.getName() + "\n age: " + male.getAge());
        System.out.println("female name: " + female.getName() + "\n age: " + female.getAge());

    }
}
