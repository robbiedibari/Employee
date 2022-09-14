import java.util.Scanner;
public class dateDemo {
    public static void main(String[] args) {
       // Date date = new Date();  calling no argument constructor of the class January 1 1000
       // Date date = new Date(1960);  this object will call the year 1960 with the default value of January (1) , 1 , 1960
      //  Date date = new Date(4,17,1994);  for month we can use a string value or an integer.
      //  System.out.println(date);
        Date date = new Date(4,10,2020);
        System.out.println(date);
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month,day,year");
     /*   date.month = scan.next();
        date.day = scan.nextInt();
        date.year = scan.nextInt();
        System.out.println(date);
    */

      date.setDate(scan.next(),scan.nextInt(),scan.nextInt());
        System.out.println(date);
    }
}
