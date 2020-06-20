package ogrotomasyon;
import java.io.IOException;
import java.io.*;
import static java.lang.System.exit;
import java.util.*;

public class Ogrenci extends notGormeDosya   {
    Ogrenci() {
        int loop1 = 1;
        do{
        int secim;
        System.out.println("Hangi islemi yapmak istiyorsunuz\n1-Not Gorme\n2-Ders Secme\n3-Cikis");
        Scanner input = new Scanner(System.in);
        secim = input.nextInt();
        
        switch(secim ) {
        case 1:
                System.out.println("Notlariniz su sekildedir:\n");
                notGormeDosya not = new notGormeDosya();
                not.dosyaOku();
                break;
        case 2:
                try{
                FileWriter fw = new FileWriter("dersSecme.txt",true);
                System.out.println("Asagidaki dersleri secebilirsiniz:\n 1)Nesneye Yonelik Programlama\n" + "2)Lojik Devre Tasarimi\n" + "3)Devreler ve Sistemler\n" + "4)Muhendisler icin Ekonomi\n"
                                   + "5-Olasılık ve İstatistik\n" + "6-Bilgisayar Aglari ve Veri Haberleşmesi\n" + "7-Bilgisayar Organizasyonu ve Mimarisi\n" + "8-Veri Yapıları ve Algoritmalar\n"
                                   + "9-İsletim Sistemleri\n" + "10-Veritabani Sistemleri\n" + "11-Yazılım Mühendisligi\n" + "12-Bicimsel Diller ve Ozdevinirler Kuramı\n");
                String dersSec [] = {"Nesneye Yonelik Programlama", "Lojik Devre Tasarimi", "Devreler ve Sistemler", "Muhendisler icin Ekonomi","Olasilik ve İstatistik","Bilgisayar Aglari ve Veri Haberlesmesi","Bilgisayar Organizasyonu ve Mimarisi","Veri Yapıları ve Algoritmalar"
                                   ,"İsletim Sistemleri","Veritabani Sistemleri","Yazilim Mühendisligi", "Bicimsel Diller ve Ozdevinirler Kurami"  };
                System.out.print("Kac adet ders sececeksiniz: ");
                int a = input.nextInt();
                for(int i = 0; i<a; i++) {
                    int s = input.nextInt();
                    System.out.println(dersSec[s-1] + " dersini sectiniz");
                    String d = dersSec[s-1];
                    fw.write(d + "\n");
                }        
                fw.close();
                } catch(Exception e) {
                System.out.println("Hata olustu");
                }   
                break;
        case 3:
            loop1 = 0;
            exit(0); 
            break;
        default:
            System.out.println("Hatali secim!");
        }
        }while (loop1 != 0);
    }
}