package WzacniaczITuner;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {

    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        Thermomix tm = new Thermomix();
        Wzacniacz wzm = new Wzacniacz();

        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv, tm, wzm);
        fkd.wrocDoDomu();
        System.out.println("--------------------");
        fkd.wychodzeZDomu();
    }
}
