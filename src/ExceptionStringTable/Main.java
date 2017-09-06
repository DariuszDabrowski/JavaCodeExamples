package ExceptionStringTable;

/**
 * Created by RENT on 2017-09-06.
 */
public class Main {
    public static void main(String[] args) {
       String[] strArr = new String[]{"ala","kot"};
        ArraySearcher as = new ArraySearcher();

        try{
            as.findElement(strArr, "ola");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Nie udalo sie");
        }
    }

}
