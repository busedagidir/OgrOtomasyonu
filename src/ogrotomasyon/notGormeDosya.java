package ogrotomasyon;

import java.io.*;
import java.util.*;



public class notGormeDosya extends dersSecme implements dosyaIslemleri{
    private Scanner dosya;
    @Override
    public void dosyaOku()
    {
        File dosya = new File("notlar.txt");
        try{
            Scanner scan = new Scanner(dosya);
            while(scan.hasNextLine() ) {
            String a = scan.nextLine();
            System.out.printf("%s\n", a);
        }
            scan.close();
        }catch(Exception e) {
                System.out.println("Hatali islem");
        }
    }
    
    @Override
    public void dosyaYaz(){ }
}