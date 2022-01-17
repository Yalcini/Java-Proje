import java.util.ArrayList;

public class Kulup {
  static ArrayList<ArrayList<Object>> futbolcular = new ArrayList<>();
  static ArrayList<ArrayList<Object>> teknik = new ArrayList<>();
  static ArrayList<ArrayList<Object>> yonetim = new ArrayList<>();

  public static void oyuncuEkle(ArrayList<Object> futbolcu) {
    futbolcular.add(futbolcu);
  }

  public static void oyuncuCikar(int formaNo) {
    for (int i = 0; i < futbolcular.size(); i++) {
      if ((int) futbolcular.get(i).get(5) == formaNo) {
        futbolcular.remove(i);
      }
    }
    System.out.println("Oyuncu kulüpten ayrıldı");
  }

  public static void teknikEkle(ArrayList<Object> teknikEkipUyesi) {
    teknik.add(teknikEkipUyesi);
  }

  public static void teknikCıkar(int id) {
    for (int i = 0; i < teknik.size(); i++) {
      if ((int) teknik.get(i).get(0) == id) {
        teknik.remove(i);
      }
    }
    System.out.println("Teknik personel kulüpten ayrıldı");
  }
  public static void yonetimEkle(ArrayList<Object> yonetimUyesi){
     yonetim.add(yonetimUyesi);
  }

  public static void yonetimCikar(String ad_soyad){
    for (int i = 0; i < yonetim.size(); i++) {
      if ( yonetim.get(i).contains(ad_soyad)) {
        yonetim.remove(i);
        break;
      }
    }
    System.out.println("Yönetim Kurulu üyesi kulüpten ayrıldı");
  }
  public static double kadro_degeri_hesapla() {
    double toplam = 0;
    for (int i = 0; i < futbolcular.size(); i++) {

      toplam += (double) futbolcular.get(i).get(3);

    }
    return toplam;
  }
  public static Double maasGiderleriHesapla(){
    Double futbolcuToplam=0.0;
    Double teknikToplam=0.0;
    Double yonetimToplam=0.0;
    for (int i = 0; i < futbolcular.size(); i++){ 
      futbolcuToplam += (Double) futbolcular.get(i).get(2);}
    for (int i = 0; i < teknik.size(); i++) {
      teknikToplam += (Double) teknik.get(i).get(4);}
    for (int i = 0; i < yonetim.size(); i++) {
      yonetimToplam += (Double)yonetim.get(i).get(3);} 

    return futbolcuToplam+teknikToplam+yonetimToplam;

  }
  public static String getDirektor(){
    String direktorAdi=null;
    for (int i = 0; i < teknik.size(); i++) {
      if ( teknik.get(i).contains("Teknik Direktör")) {
        direktorAdi = (String)teknik.get(i).get(2);
        break;
      }
    }return direktorAdi;
  }
  public static String getBaskan(){
     String baskanAdi=null;
    for (int i = 0; i < yonetim.size(); i++) {
      if ( yonetim.get(i).contains("Başkan")) {
        baskanAdi = (String)yonetim.get(i).get(1);
        break;
      }
    }
    return baskanAdi;
  }

  public static int getYasOrtalamasi(){
    int toplamYas = 0;
    for (int i = 0; i < futbolcular.size(); i++){ 
      toplamYas += (int) futbolcular.get(i).get(1);}
    return toplamYas/futbolcular.size();
     

  }
  public static void bilgileriGoster(){
    double sonuc = kadro_degeri_hesapla()-maasGiderleriHesapla();
    System.out.println("Kulüp Adı : ProjeSpor"+
    "\nKuruluş Yılı : 1883"+
    "\nBaşkan : "+ getBaskan()+
    "\nTeknik Direktör : "+ getDirektor()+
    "\nKadro Değeri : "+String.format("%.2f",kadro_degeri_hesapla() )+" Milyon £"+
    "\nKadro Yaş Ortalaması : "+getYasOrtalamasi()+
    "\nMaaş Giderleri Toplamı  : "+ String.format("%.2f",maasGiderleriHesapla() )+" Milyon £"+
    "\nKulübün Net Değeri : "+String.format("%.2f",sonuc )+" Milyon £");
    
    
  }
 

}
