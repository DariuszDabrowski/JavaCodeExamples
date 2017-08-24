package Enumy;

/**
 * Created by RENT on 2017-08-24.
 */
public class EnumKonstruktor {
    public enum DaysOfTheWeek{MONDAY("Poniedzialek"){DaysOfTheWeek next(){return TUESDAY;}}
        , TUESDAY("Wtorek"){DaysOfTheWeek next(){return WENSDAY;}}
        , WENSDAY("Sroda"){DaysOfTheWeek next(){return THURSDAY;}}
        , THURSDAY("Czwartek"){DaysOfTheWeek next(){return FRIDAY;}}
        , FRIDAY("Piatek"){DaysOfTheWeek next(){return SATURDAY;}}
        , SATURDAY("Sobota"){DaysOfTheWeek next(){return SUNDAY;}}
        , SUNDAY("Niedziela"){DaysOfTheWeek next(){return MONDAY;}};
    private final String polishName;
    DaysOfTheWeek(String polishName){this.polishName = polishName;}
    String getPolishName(){return polishName;}
        abstract DaysOfTheWeek next();
    }

    public static void main(String[] args) {
        for (DaysOfTheWeek days: DaysOfTheWeek.values()) {
            System.out.printf("%s => %s => %s \n", days, days.getPolishName(),days.next());
        }
    }
}
