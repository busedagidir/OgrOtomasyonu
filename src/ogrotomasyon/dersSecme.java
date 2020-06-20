    
package ogrotomasyon;

import java.lang.*;
import java.io.*;
import java.util.*;

public class dersSecme implements dosyaIslemleri {

    @Override
    public void dosyaYaz() {
            try{ 
            String dosya = "dersSecme.txt";
            Scanner input = new Scanner(System.in);
            FileWriter yazici = new FileWriter(dosya);
            System.out.println("Islemi bitirmek icin 0'a basınız");
            while(true) {
                String ders = input.nextLine();
                if("0".equalsIgnoreCase(ders.trim()))
                break;
                yazici.write(ders + " \n");
            }
            yazici.close();
            

        }catch(Exception e) {
            System.out.println("Bir sorun olustu");
        }
        
    }

    @Override
    public void dosyaOku(){}
    
 

}
