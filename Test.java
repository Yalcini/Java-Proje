import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) throws Exception {
        SubTest st = new SubTest();
        st.futbolcuGetir();
        st.teknikEkipGetir();
        st.yonetimGetir();
        System.out.println("Bir seçim yapınız");
        Scanner sc = new Scanner(System.in);
        String menu = "Çıkmak için : 0 " +
                "\nKulüp bilgilerini görüntülemek için : 1 "+
                "\nFutbolcuları listelemek için : 2 " +
                "\nFutbolcu eklemek veya çıkarmak için : 3 " +
                "\nTeknik Ekibi görüntülemek için : 4 " +
                "\nTeknik ekibe ekleme-çıkarma yapmak için : 5 " +
                "\nYönetimi görüntülemek için : 6 " +
                "\nYönetime ekleme-çıkarma yapmak için : 7";
        
        while (true) {
            System.out.println("\n"+menu);
           try
           { 
               int secim = Integer.parseInt(sc.nextLine());
            switch (secim) {
                case 0:
                    sc.close();
                    System.exit(0);
                case 1:
                    Kulup.bilgileriGoster();
                    break;
                case 2:
                    for (ArrayList<Object> futbolcu : Kulup.futbolcular) {
                        System.out.println(futbolcu);
                    }
                    break;
                case 3:
                    System.out.println("Ekleme yapmak için : 1" + "\nÇıkarma yapmak için : 2");
                    int secim2 = Integer.parseInt(sc.nextLine());
                    switch (secim2) {
                        case 1:
                            Futbolcu.ekle();
                            break;

                        case 2:
                            Futbolcu.cikar();
                            break;
                    }

                    break;
                case 4:
                    for (ArrayList<Object> teknik : Kulup.teknik) {
                        System.out.println(teknik);
                    }
                    break;
                case 5:
                System.out.println("Ekleme yapmak için : 1" + "\nÇıkarma yapmak için : 2");
                    int secim3 = Integer.parseInt(sc.nextLine());
                    switch (secim3) {
                        case 1:
                            Teknik.ekle();
                            break;
                        case 2:
                            Teknik.cıkar();
                            break;
                    }
                    break;
                case 6:
                      for(ArrayList<Object> yonetimUyesi : Kulup.yonetim)
                      System.out.println(yonetimUyesi);
                      break;
                case 7:
                      System.out.println("Ekleme yapmak için 1 " + "\nÇıkarma yapmak için : 2");
                      int secim4 = Integer.parseInt(sc.nextLine());
                      switch (secim4){
                          case 1:
                                Yonetim.ekle();
                                break;
                          case 2:
                                Yonetim.cikar();
                                break;
                      }    
            }         
        }
           catch(Exception ex){
               System.out.println(ex);    
           }
        }
    }
}
