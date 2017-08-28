package Person;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Zygmunt Waza"
                , "ul. Jagiełły 101/5","SMN", 2004, 450);
        Staff staff = new Staff("Olek", "Hubska 31"
                , "UW", 500);
        System.out.println(student);
        System.out.println(staff);

    }
}
