package StacjaPogodowaObserwatorJava;


import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements IPodmiot {
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private List<IObserwator> obserwatorzy;

    public DanePogodowe() {
        obserwatorzy = new ArrayList<>();
    }

    public void odczytyZmiennych() {
        powiadomObserwtorow();
    }


    @Override
    public void zarejestrujObserwatora(IObserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usuObserwatora(IObserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwtorow() {
        for (IObserwator obserwator : obserwatorzy) {
            obserwator.aktualizuj(_temperatura, _cisnienie, _wilgotnosc);
        }
    }

    public void ustawZmienne(float temperatura, float cisnienie, float wilgotnosc) {
        _temperatura = temperatura;
        _cisnienie = cisnienie;
        _wilgotnosc = wilgotnosc;
        odczytyZmiennych();
    }
}
