import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teknik extends MaasliCalisan {

    private String gorev; // teknik direktör, yardımcı antrenörler, kaleci antrenörü, performans antrenörü, analiz sorumlusu,takım doktoru, fizyoterapist, tercüman, masörler, malzeme sorumlusu
    private String sozlesmeBitisi;
    private int id;
    
    public Teknik(String gorev, String ad_soyad, int yas, double maas,String sozlesme) {
        super(ad_soyad, yas, maas);
        setId((new Random()).nextInt(99));
        this.setGörev(gorev);
        this.setSozlesmeBitisi(sozlesme);
        ArrayList<Object> teknikEkipUyesi = new ArrayList<>();
        teknikEkipUyesi.add(this.getId());
        teknikEkipUyesi.add(getGörev());
        teknikEkipUyesi.add(super.getAdSoyad());
        teknikEkipUyesi.add(super.getYas());
        teknikEkipUyesi.add(super.getMaas());
        teknikEkipUyesi.add(getSozlesmeBitisi());
        Kulup.teknikEkle(teknikEkipUyesi);
    }
    
    
    public static void ekle(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                            "Sırayla eklemek istediğiniz teknik personelin görev ad soyad yas maas sözleşme bilgilerini giriniz");
                    System.out.print("Görev : ");
                    String t_gorev = sc.nextLine();
                    System.out.print("Ad-Soyad : ");
                    String t_ad_soyad = sc.nextLine();
                    System.out.print("Yaş : ");
                    int t_yas = Integer.parseInt(sc.nextLine());
                    System.out.print("Yıllık Maaşı (M£) : ");
                    double t_maas = Double.parseDouble(sc.nextLine());
                    System.out.print("Sözleşme Bitiş Tarihi : ");
                    String t_sozlesme = sc.nextLine();
                    Teknik inst_teknik = new Teknik(t_gorev, t_ad_soyad, t_yas, t_maas, t_sozlesme);
                    System.out.println("Yeni teknik personel kulübe eklendi");
    }
        
    public static void cıkar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Çıkarmak istediğiniz teknik personelin id'sini giriniz : ");
        int id = Integer.parseInt(sc.nextLine());
        Kulup.teknikCıkar(id);

    }


    public String getSozlesmeBitisi() {
        return sozlesmeBitisi;
    }


    public void setSozlesmeBitisi(String sozlesmeBitisi) {
        this.sozlesmeBitisi = sozlesmeBitisi;
    }


    public String getGörev() {
        return gorev;
    }


    public void setGörev(String görev) {
        this.gorev = görev;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
