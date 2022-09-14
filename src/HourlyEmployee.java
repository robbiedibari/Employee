public class HourlyEmployee extends Employee{
    private double wageRate;
    private double hours;

    public HourlyEmployee (){
        this("No name", new Date(),0.0,0.0);

    }
    public HourlyEmployee(String name, Date hireDate, double wageRate, double hours){
        super(name,hireDate);
        setWageRate(wageRate);
        setHours(hours);
    }
    public HourlyEmployee (HourlyEmployee otherEmployee){
        super(otherEmployee);
        setWageRate(otherEmployee.wageRate);
        setHours(otherEmployee.hours);
    }

    public void setWageRate(double wageRate){
            if(wageRate >= 0){
                this.wageRate = wageRate;
            } else {
                System.out.println("Wage rate cannot be a negative value");
                System.exit(0);
            }
    }
    public void setHours (double hours){
        if(hours>=0){
            this.hours = hours;
        } else {
            System.out.println("Hours cannot be negative");
            System.exit(0);
        }
    }
    public double getWageRate (){
        return wageRate;
    }
    public double getHours(){
        return hours;
    }
    public double getPay(){
        return getWageRate() * getHours();
    }

    public String toString(){
        return super.toString() + " on a wage rate rate of $ " + getWageRate() + " to work for " + getHours() + " hours per week";
    }
    public boolean equals(HourlyEmployee otherEmployee){
        return (getName().equals(otherEmployee.getName())) && getHireDate().equals(otherEmployee.getHireDate()) && wageRate == otherEmployee.wageRate && hours == otherEmployee.hours;
    }

}
