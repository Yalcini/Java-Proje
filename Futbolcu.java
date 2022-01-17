import java.util.ArrayList;
import java.util.Scanner;


public class Futbolcu extends MaasliCalisan {
    private double piyasa;
    private String mevki;
    private String uyruk;
    private String sozlesme;
    private int formaNo;
    public Futbolcu(String ad_soyad, int yas, Double maas, double piyasa, String mevki,int formaNo, String uyruk,String sozlesme) {
        super(ad_soyad, yas, maas);
        this.setPiyasa(piyasa);
        this.setMevki(mevki);
        this.setUyruk(uyruk);
        this.setFormaNo(formaNo);
        this.setSozlesme(sozlesme);
        ArrayList<Object> futbolcu_info = new ArrayList<Object>();
        futbolcu_info.add(this.getAdSoyad());
        futbolcu_info.add(this.getYas());
        futbolcu_info.add(this.getMaas());
        futbolcu_info.add(this.getPiyasa());
        futbolcu_info.add(this.getMevki());
        futbolcu_info.add(this.getFormaNo());
        futbolcu_info.add(this.getUyruk());
        futbolcu_info.add(sozlesme);        
        Kulup.oyuncuEkle(futbolcu_info);
        
    }

   

    public static void ekle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Sırayla eklemek istediğiniz futbolcunun ad soyad yas maas piyasa degeri mevkisi uyruğu ve sözleşme bitiş tarihini giriniz");
            System.out.print("Ad-Soyad : ");
            String ad_soyad =sc.nextLine();
            System.out.print("Yaş : ");
            int yas = Integer.parseInt( sc.nextLine());
            System.out.print("Yıllık Maaşı (M£) : ");
            Double maas =Double.parseDouble( sc.nextLine());
            System.out.print("Piyasa Değeri(M£ cinsinden): ");
            double piyasa = Double.parseDouble( sc.nextLine());
            System.out.print("Mevki : ");
            String mevki= sc.nextLine();
            System.out.print("Forma Numarası : ");
            int formaNo = Integer.parseInt(sc.nextLine());
            System.out.print("Uyruk : ");
            String uyruk = sc.nextLine();
            System.out.print("Sözleşme Tarihi : ");
            String sozlesme = sc.nextLine();
            Futbolcu inst_futbolcu=new Futbolcu(ad_soyad, yas, maas, piyasa, mevki, formaNo, uyruk,sozlesme);
            System.out.println("Oyuncu eklendi, kulübümüze hayırlı olsun.");
            
    }

    public static void cikar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Çıkarmak istediğiniz oyuncunun forma numarasını giriniz : ");
        int formaNo = Integer.parseInt(sc.nextLine());
        Kulup.oyuncuCikar(formaNo);
        
    }
   
    public String getUyruk() {
        return uyruk;
    }
    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }
    public String getMevki() {
        return mevki;
    }
    public void setMevki(String mevki) {
        this.mevki = mevki;
    }
    public double getPiyasa() {
        return piyasa;
    }
    public void setPiyasa(double piyasa) {
        this.piyasa = piyasa;
    }
    public String getSozlesme() {
        return sozlesme;
    }

    public void setSozlesme(String sozlesme) {
        this.sozlesme = sozlesme;
    }

    public int getFormaNo() {
        return formaNo;
    }

    public void setFormaNo(int formaNo) {
        this.formaNo = formaNo;
    }
    
    
    

   
    
}
