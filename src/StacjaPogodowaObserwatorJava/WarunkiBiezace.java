package StacjaPogodowaObserwatorJava;


public class WarunkiBiezace implements IWyswietl, IObserwator {

   private float _temperatura;
   private float _cisnienie;
   private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    public WarunkiBiezace(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPa, %f %%\n", _temperatura, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temp, float cisnienie, float wilgotnosc) {
        _temperatura = temp;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
