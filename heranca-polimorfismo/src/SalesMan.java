public non-sealed class SalesMan extends Employee{

    public SalesMan(String code, String name, String adress, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    
    }
    

    public SalesMan() {
    }

    // sobrescrita de code
    private double percentPerSold;
    private double soldAmount;

    // getters and setters
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
    public double getSoldAmount() {
        return soldAmount;
    }
    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
    // fim do getters and setters

    @Override
    public String getCode() {
        return "SL" + this.getCode();
    }

}
