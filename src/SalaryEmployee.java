public class SalaryEmployee  extends  Employee{
    private double salary;

    public SalaryEmployee(){
        this("No name", new Date(),0.0);
    }
    public SalaryEmployee (String name, Date hireDate, double salary){
        super(name,hireDate);
        setSalary(salary);
    }
    public SalaryEmployee (SalaryEmployee otherEmplyee){
        super(otherEmplyee);
        setSalary(otherEmplyee.salary);
    }
    public void setSalary(double salary){
        if(salary >= 0){
            this.salary = salary;
        }else{
            System.out.println("Salary cannot be negative");
            System.exit(0);
        }
    }
    public double getSalary(){
        return salary;
    }
    public double getPay(){
        return salary / 12;
    }
    public String toString (){
        return super.toString() + "at a salary of $ " + getSalary();
    }
    public boolean equals(SalaryEmployee otherEmployee){
        return super.equals(otherEmployee) && salary == otherEmployee.salary;
    }

}
