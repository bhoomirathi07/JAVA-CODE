import java.util.Scanner;

public class lab2  {

    private String name;
    private int age;
    private String department;


    public lab2 (String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public lab2 () {

    }


    public void car() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Car Assignment --------- ");

        System.out.print("Enter Car Make: ");
        String make = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Car Year: ");
        short year = sc.nextShort();

        System.out.print("Enter Car Price: ");
        int price = sc.nextInt();

        System.out.println("--------- Car Details ---------");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }


    public void calculator() {
        System.out.println("--------- Calculator Assignment ---------");
        System.out.println("add(10, 20): " + add(10, 20));
        System.out.println("add(5, 10, 15): " + add(5, 10, 15));
        System.out.println("add(3.5, 4.5): " + add(3.5, 4.5));
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public void displayStudent() {
        System.out.println("---------Student Assignment---------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }


    public static void main(String[] args) {


        lab2  w = new lab2 ();
        w.car();
        w.calculator();

        lab2  studentObj = new lab2 ("Raj", 20, "Computer Science");
        studentObj.displayStudent();
    }
}

