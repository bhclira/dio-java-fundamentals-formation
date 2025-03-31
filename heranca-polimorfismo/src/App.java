public class App {
    public static void main(String[] args) throws Exception {
        printEmployee(new Manager());
        printEmployee(new SalesMan());
        

    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Manager manager -> {
                manager.setName("João");
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setCode("123");
                manager.setSalary(5000);
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }

            case SalesMan salesman -> {
                salesman.setCode("321");
                salesman.setName("Maria");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(0.1); 

                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSalary());
            }
            default -> {
                System.out.println("Tipo de funcionário desconhecido.");
            }
        }
    }
        

 }


