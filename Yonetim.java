import java.util.ArrayList;
import java.util.Scanner;

public class Yonetim extends MaasliCalisan {
   private String gorev;
  static Scanner sc = new Scanner(System.in);

public Yonetim(String ad_soyad, int yas, Double maas, String gorev) {
    super(ad_soyad, yas, maas);
    this.setGorev(gorev);
    ArrayList<Object> yonetimUyesi = new ArrayList<Object>();
    yonetimUyesi.add(gorev);
    yonetimUyesi.add(ad_soyad);
    yonetimUyesi.add(yas);
    yonetimUyesi.add(maas);
    Kulup.yonetim.add(yonetimUyesi);

}

public String getGorev() {
    return gorev;
}

public void setGorev(String gorev) {
    this.gorev = gorev;
}

static void ekle(){
    System.out.println("Eklemek istediğiniz Yönetim kurulu üyesinin sırasıyla görev, ad-soyad, yaş ve maaş bilgilerini giriniz");
    System.out.print("Görev : ");
    String gorev = sc.nextLine();
    System.out.print("Ad - Soyad : ");
    String ad_soyad = sc.nextLine();
    System.out.print("Yaş : ");
    int yas = Integer.parseInt(sc.nextLine());
    System.out.print("Maaş (M£) : ");
    Double maas = Double.parseDouble(sc.nextLine());
    Yonetim inst_yonetim = new Yonetim(ad_soyad, yas, maas, gorev);
    System.out.println("Yeni yönetim üyesi klübe dahil oldu");


}
static void cikar(){
        System.out.print("Çıkarmak istediğiniz yönetim üyesinin adını soyadını giriniz : ");
        String ad_soyad = sc.nextLine();
        Kulup.yonetimCikar(ad_soyad);
}
    
}
