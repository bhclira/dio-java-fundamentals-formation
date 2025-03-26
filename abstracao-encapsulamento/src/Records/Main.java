package records;

public class Main {
    public static void main(String[] args) {
        // trabalhando com Records: classe imutável, não permite construtor sem argumentos, não permite alterar atributos, não permite herança

        var person = new Person("Breno", 12);

        System.out.println(person);
        // acesse o atributo name por método
        System.out.println(person.name());
        // para alterar o atributo name, é necessário criar um novo objeto com o atributo alterado
        var newperson = new Person(person.name(), 13);
        System.out.println(newperson);
    }

}
