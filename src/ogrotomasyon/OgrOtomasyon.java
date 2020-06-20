/*
Kullanim kilavuzu:
3 kullanici var: 1 ogrenci, 1 ogretmen ve 1 idari memur giris yapabiliyor.Dizi ile kullanici adi ve sifre tuttum
Ogrenci: Bilgisayar muhendisi ogrencisi
Ogretmen: NYP ogretmeni
/Idari memur:*/



package ogrotomasyon;
import java.io.*;
import java.util.*;
import java.lang.*;
import static java.lang.System.exit;

public class OgrOtomasyon {
    public static void main(String[] args) throws IOException,NoSuchElementException {
//        ogrKayit a = new ogrKayit();
        Scanner input = new Scanner(System.in);
        String kullanicilar [][] = {{"20399601718", "ogrsifre"}, {"58748532147", "ogrtsifre"}, {"98745647451", "idarisifre"}};
        int loop = 1;
        do{
        System.out.println("Ögrenci girisi icin 1,\nÖgretim uyesi girisi icin 2,\nIdari memur girisi icin 3, \nCikis icin 4'e basiniz ");
        String giris;
        giris = input.nextLine();
        String kullaniciAdi, sifre;
        
        switch(giris) {
            case ("1"):
            System.out.print("Ogrenci Kullanici adi giriniz: ");
            kullaniciAdi = input.nextLine();
            
            System.out.print("Sifre giriniz: ");
            sifre = input.nextLine();
                if((kullaniciAdi.equals(kullanicilar[0][0])) && (sifre.equals(kullanicilar[0][1])) ) {
                    System.out.println("Buse Dagidir icin giris yapildi\n");
                    Ogrenci o1 = new Ogrenci();      
                }
                else
                    System.out.println("Hatali giris. Lutfen bilgilerinizi kontrol edin\n");
            break;
        
            case ("2"):
            System.out.print("Ogretim Uyesi kullanici adi giriniz: ");
            kullaniciAdi = input.nextLine();
            
            System.out.print("Sifre giriniz: ");
            sifre = input.nextLine();
                if(kullaniciAdi.equals(kullanicilar[1][0]) && sifre.equals(kullanicilar[1][1])) {
                    System.out.println("Giris yapildi\n");
                    OgrUyesi ogrt = new OgrUyesi();
                }
                else
                    System.out.println("Hatali giris. Lutfen bilgilerinizi kontrol edin\n");
            break;
        
            case("3"):
            System.out.print("Idari Memur Kullanici adi giriniz: ");
            kullaniciAdi = input.nextLine();
            
            System.out.print("Sifre giriniz: ");
            sifre = input.nextLine();
                if(kullaniciAdi.equals(kullanicilar[2][0]) && sifre.equals(kullanicilar[2][1])) {
                        
                    System.out.println("Giris yapildi\n"); 
                idariMemur idr = new idariMemur(); }
                else
                    System.out.println("Hatali giris. Lutfen bilgilerinizi kontrol edin\n");
            break;
            case("4"):
                loop = 0;
                System.out.println("CIKIS YAPILDI");
                exit(0);
                break;
            default:
                System.out.println("Hatali secim");
        }
        }while(loop != 0);
    }
}