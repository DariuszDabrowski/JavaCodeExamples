package Employee;


public class Main {
    public static void main(String[] args) {
        Employee zbychu = new Employee(1, "Zbyszek", "Flachowiec", 3000);
        System.out.println(zbychu);
        zbychu.setSalary(4000);
        System.out.println(zbychu);
        zbychu.reiseSalary(22);
        System.out.println(zbychu);
    }
}
