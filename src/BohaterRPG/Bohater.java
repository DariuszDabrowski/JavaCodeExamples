package BohaterRPG;

public class Bohater {
   protected String imie = "Bezimienny";
   protected Tarcza tarcza = new DrewnianaTarcza();
   protected Miecz miecz = new MieczKrotki();
   protected Plecak plecak = new PlecakWluczegi();

   public Bohater(){};

   public Bohater(String imie){
      setImie(imie);
   }

   public Bohater(String imie,Tarcza tarcza, Miecz miecz, Plecak plecak){
      setImie(imie);
      setTarcza(tarcza);
      setMiecz(miecz);
      setPlecak(plecak);
   }

   public String getImie() {
      return imie;
   }

   public void setImie(String imie) {
      this.imie = imie;
   }

   public Tarcza getTarcza() {
      return tarcza;
   }

   public void setTarcza(Tarcza tarcza) {
      this.tarcza = tarcza;
   }

   public Miecz getMiecz() {
      return miecz;
   }

   public void setMiecz(Miecz miecz) {
      this.miecz = miecz;
   }

   public Plecak getPlecak() {
      return plecak;
   }

   public void setPlecak(Plecak plecak) {
      this.plecak = plecak;
   }

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("\n Imie: " + imie + "\n")
              .append("Obrona: " + tarcza.obrona() + "\n")
              .append("Atak: " + miecz.atak() + "\n")
              .append("Posiadana Broń: \n")
              .append("Tarcza: " + tarcza.pobierzOpis() + "\n")
              .append("Miecz: " + miecz.pobierzOpis() + "\n")
              .append("Plecak: " + plecak.pobierzOpis())
              .append(" ( " + plecak.pojemnosc() + " )");
      return sb.toString();
   }
}
