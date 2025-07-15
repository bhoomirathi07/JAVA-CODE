public class lab1 {

    public void student() {
        String name = "Aman";
        String college = "ABC College";
        int studentId = 234;
        System.out.println("Student Added Successfully");
        System.out.println("Student Info: " + name + " | " + college + " | ID: " + studentId);
    }

    public void employee() {
        int id = 1;
        double age = 22.5;
        String name = "Ram";
        boolean isPermanent = true;

        System.out.println("Employee Successfully Started");
        System.out.println("Employee Info: ID=" + id + ", Age=" + age + ", Name=" + name + ", Permanent=" + isPermanent);
    }

    public void person() {
        String name = "Bhoomi";
        int age = 21;
        int salary = 60000;

        System.out.println("Person Added Successfully");
        System.out.println("Person Info: Name=" + name + ", Age=" + age + ", Salary=" + salary);
    }

    public static void main(String[] args) {
        lab1 w = new lab1();

        w.student();
        w.employee();
        w.person();
    }
}