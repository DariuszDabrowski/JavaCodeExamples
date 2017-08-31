package UbraniaFasada;

/**
 * Created by RENT on 2017-08-31.
 */
public class StrategiaUbioru {

    private IUbranieNaPoreRoku _ubranieNaPoreRoku;

    public StrategiaUbioru(IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
    public void ubieramySie(){
        _ubranieNaPoreRoku.ubierz();
    }
    public void rozbieramySie(){
        _ubranieNaPoreRoku.rozbierz();
    }
    public void setPoraRoku(IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
}
