package busticketingsystem;
import java.util.Scanner;

//Jia Xuan
public class Driver extends Person{
    
    private double salary;//monthly salary of driver
    private int yearWorked;//number of years the driver worked as a bus driver include when they worked in other company
    private static int numberOfDriver;
    
    //no-arg constructor
    public Driver(){
        numberOfDriver++;
    }
    //parameterized constructor
    public Driver(String n, String c, int i, double s, int y){
        super(n, c, i);
        this.salary = s;
        yearWorked = y;
        numberOfDriver++;
    }
    //getter and setter
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearWorked() {
        return yearWorked;
    }

    public void setYearWorked(int yearWorked) {
        this.yearWorked = yearWorked;
    }

    public static int getNumberOfDriver() {
        return numberOfDriver;
    }

    public static void setNumberOfDriver(int numberOfDriver) {
        Driver.numberOfDriver = numberOfDriver;
    }
    //add new driver
    public static void addDriver(Driver[] driver){
        Scanner input = new Scanner(System.in);
        boolean contName = false, contContact = false, contSalary = true, contYear = true;
        String name, contact;
        double salary = 0.0;
        int year = 0;
        System.out.println("\nNew Driver");
        System.out.println("============");
        //input validation for name
        do{
            System.out.print("Driver Name    : ");
            name = input.nextLine();
            if(name.length() == 0){
                System.out.println("Please enter a valid name.");
                contName = true;
            }
            for(int i = 0 ; i < name.length() ; i++){
                if(!Character.isLetter(name.charAt(i)) && !Character.isSpace(name.charAt(i))){
                    System.out.println("Please enter a valid name.");
                    contName = true;
                    break;
                }
                else{
                    contName = false;
                }
            }
        }while(contName);
        //input validation for contact number
        do{
            System.out.print("Contact Number : ");
            contact = input.nextLine();
            if(contact.length() != 10 && contact.length() != 11){
                System.out.println("Please enter a valid contact number.");
                contContact = true;
            }
            else{
                for(int i = 0 ; i < contact.length() ; i++){
                    if(!Character.isDigit(contact.charAt(i))){
                        System.out.println("Please enter a valid contact number.");
                        contContact = true;
                        break;
                    }
                    else{
                        contContact = false;
                    }
                }
            }
        }while(contContact);
        //input validation for salary
        do{
            try{
                System.out.print("Salary         : ");
                salary = input.nextDouble();
                if(salary < 0){
                    System.out.println("Please enter a valid salary.");
                    contSalary = true;                    
                }
                else 
                    contSalary = false;
            }
            catch(Exception ex){
                System.out.println("Please enter a valid salary.");
                input.nextLine();
            }
        }while(contSalary);
        //input validation for year worked
        do{
            try{
                System.out.print("Year Worked    : ");
                year = input.nextInt();   
                if(year < 0 || year > 50){
                    System.out.println("Please enter a valid year.");
                    contYear = true;
                }
                else
                    contYear = false;
            }
            catch(Exception ex){
                System.out.println("Please enter a valid year.");
                input.nextLine();
            }
        }while(contYear);
        int driverNo = Driver.getNumberOfDriver();
        driver[driverNo++] = new Driver(name, contact, driverNo, salary, year);
    }
    //calculate annual salary of driver based on the year of worked
    public double calculateAnnualSalary(){
        if(yearWorked >= 0 && yearWorked < 2)
            return salary * 12 * 1.1;
        else if(yearWorked >= 2 && yearWorked < 5)
            return salary * 12 * 1.2;
        else if(yearWorked >= 5 && yearWorked < 10)
            return salary * 12 * 1.3;
        else if(yearWorked >= 10 && yearWorked < 15)
            return salary * 12 * 1.4;
        else if(yearWorked >= 15 && yearWorked < 20)
            return salary * 12 * 1.5;
        else
            return salary * 12 * 1.6;    
    }
    
    @Override
    public String toString() {
        return String.format(super.toString() + "\nYear Worked    : " + yearWorked + " year(s)" + 
                "\nMonthly Salary : RM %.2f" + "\nAnnual Salary  : RM %.2f" , salary, this.calculateAnnualSalary());
    }
}
