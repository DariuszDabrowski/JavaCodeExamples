package WzacniaczITuner;

public class FasadaKinaDomowego {
   private Telewizor _telewizor;
    private Thermomix _thermomix;
    private Wzacniacz _wzmacniacz;

    public FasadaKinaDomowego(Telewizor tv, Thermomix tm, Wzacniacz wzm){
        _telewizor = tv;
        _thermomix = tm;
        _wzmacniacz = wzm;
    }
    public void wrocDoDomu(){
        _thermomix.wlacz();
        _thermomix.zrobObiad();
        _wzmacniacz.wlacz();
        _telewizor.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }
    public void wychodzeZDomu(){
        _thermomix.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
