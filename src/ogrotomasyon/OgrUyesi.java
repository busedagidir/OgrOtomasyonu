package ogrotomasyon;

import java.io.FileWriter;
import static java.lang.System.exit;
import java.util.*;

public class OgrUyesi extends notGirmeDosya {
    OgrUyesi() {
        int loop2 = 1;
        do{
        int secim;
        System.out.println("Hangi islemi yapmak istiyorsunuz\n1-Not Girme\n2-Yoklama alma\n3-Cikis");
        Scanner input = new Scanner(System.in);
        secim = input.nextInt();
        
            if(secim == 1) {
            System.out.println("Sırayla ogrenci no'sunu ve puanını giriniz");
            notGirmeDosya not = new notGirmeDosya();  //upcasting
            not.dosyaYaz();
            }
            
            if(secim == 2) {
                System.out.println("Derse katilimi yaziniz");
                try{ 
                String dosya = "yoklama.txt";
                FileWriter yazici = new FileWriter(dosya,true);
                System.out.print("Derse gelen ogrenci sayisi: ");
                int g1 = input.nextInt();
                System.out.printf("Derse gelmeyen ogrenci sayisi: ");
                int g2 = input.nextInt();
            
                yazici.write("Derse gelen ogrenci sayisi: " + g1 + "\n");
                yazici.write("Derse gelmeyen ogrenci sayisi: " + g2 + "\n");
            
                yazici.close();
                }catch(Exception e) {
                    System.out.println("Bir sorun olustu");
                }
            }
            
            if (secim == 3) {
                loop2 = 0;
                exit(0);
            }
    }while(loop2 != 0);
}
}
