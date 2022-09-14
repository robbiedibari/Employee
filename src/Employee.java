public class Employee {
    private String name;
    public Date hireDate;

    public Employee(){
        this( "no name",new Date());
    }
    public Employee(String name, Date hireDate){
        if(name == null || hireDate == null){
            System.out.println("Error creating a new employee");
            System.exit(0);
        }
        this.name = name;
        this.hireDate = new Date(hireDate);
    }
    public Employee (Employee otherEmploy){
        if(otherEmploy == null){
            System.out.println("Error creating employee");
            System.exit(0);
        }
        this.name = otherEmploy.name;
        this.hireDate = new Date(otherEmploy.hireDate);
    }
    public void setName (String name){
        if (name == null) {
            System.out.println("Error updating employee name");
            System.exit(0);
        } else {
            this.name = name;
        }
    }
    public void setHireDate( Date hireDate) {
        if (hireDate == null) {
            System.out.println("error updating hire date");
            System.exit(0);
        } else {
            this.hireDate = new Date(hireDate);
        }
    }
    public String getName(){
        return name;
    }
    public Date getHireDate(){
        return hireDate;
    }
    public String toString (){
        return (getName() + " was hired on " + getHireDate());
    }
    public boolean equals(Employee otherEmployee){
        return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
    }
}
