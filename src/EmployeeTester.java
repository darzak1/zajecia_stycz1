public class EmployeeTester {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", 32,300);
        Employee employee2 = new Employee("Jan", 32,300);

        if (employee1.equals(employee2)){
            System.out.println("ten sam pracownik!!!");
        }

    }
}
