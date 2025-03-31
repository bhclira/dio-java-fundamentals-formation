public non-sealed class Manager extends Employee {

    // criar construtor com todos os atributos
    public Manager(String code, String name, String adress, int age, double salary, String login, String password, double commission) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;

    }
    
    // criar construtor vazio   
    public Manager() {
    }

    // atributos da classe
    private String login;
    private String password;
    private double commission;

    // getter and setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    } 
    // fim do getters and setters

    @Override
    public String getCode() {
        return "MN" + this.getCode();
    }

}
