public class EmployeeDemo {
    public static void main(String[] args) {
      Employee john = new Employee();
        System.out.println(john);
        Employee robert = new Employee("Robert",new Date(4,15,2019));
        System.out.println(robert);


        HourlyEmployee joe = new HourlyEmployee();
        joe.setName("Joe");
        joe.setHireDate(new Date(5,6,2020));
        joe.setWageRate(27.5);
        joe.setHours(40);
        System.out.println(joe);

        HourlyEmployee sam = new HourlyEmployee("Sam", new Date(9,13,2022),55.5,35);
        System.out.println(sam);


    }
}
