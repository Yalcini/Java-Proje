import java.util.Scanner;

public abstract class MaasliCalisan {
  private String ad_soyad;
  private int yas;
  private double maas;


  
  public MaasliCalisan(String ad_soyad, int yas, double maas) {
    this.setAdSoyad(ad_soyad);
    this.setYas(yas);
    this.setMaas(maas);
  }

  
    
   
  
  
  public double getMaas() {
    return maas;
  }

  public void setMaas(double maas) {
    this.maas = maas;
  }

  public int getYas() {
    return yas;
  }

  public void setYas(int yas) {
    this.yas = yas;
  }

  public void setAdSoyad(String ad_soyad){
    this.ad_soyad= ad_soyad;
  }
  
  public String getAdSoyad(){
    return ad_soyad;
  }
}
