package ogrotomasyon;

import java.io.FileWriter;
import java.util.Scanner;

public class notGirmeDosya implements dosyaIslemleri,yoklama {
    @Override
    public void dosyaYaz()
    {
     try{ 
            String dosya = "notGirme.txt";
            Scanner input = new Scanner(System.in);
            FileWriter yazici = new FileWriter(dosya,true);
            System.out.println("Islemi bitirmek icin 0'a basınız");
            while(true) {
                String ders = input.nextLine();
                if("0".equalsIgnoreCase(ders.trim()))
                break;
                yazici.write(ders + " ");
            }
            yazici.close();
        }catch(Exception e) {
            System.out.println("Bir sorun olustu");
        }
    }

    @Override
    public void dosyaOku() {}
    @Override
    public void yoklamaAl() {}

}