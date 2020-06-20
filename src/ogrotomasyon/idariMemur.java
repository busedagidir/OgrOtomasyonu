package ogrotomasyon;

import java.io.*;
import static java.lang.System.exit;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class idariMemur extends yeniOgrenci implements dersProgrami,dosyaIslemleri {
    
    static String not1 ="AA";
    static String not2 ="BA";
    static String not3 ="BB";
    static String not4 ="CB";
    static String not5 ="CC";
    static String not6 ="DC";
    static String not7 ="DD";
    static String not8 ="FD";
    static String not9 ="FF";
    
    idariMemur() {
        int loop3 = 1;
        do{
        System.out.println("Hangi islemi yapmak istiyorsunuz\n"
                + "1-Ders programi hazirlama\n"
                + "2-Harf notu gosterimi\n"
                + "3-Ogrenci not bilgisi gorme\n"
                + "4-Yeni ogrenci ekleme\n"
                + "5-Cikis");
        String secim;
        Scanner input = new Scanner(System.in);
        secim = input.nextLine();
        switch(secim) {
            case("1"):
                programHazirla();  
                break;
            case("2"): 
                try{
                    FileWriter fw = new FileWriter("harfNotu.txt");
                    fw.write("NOT\t" + "\tHARF DAGILIMI\t" + "NOTU\n");
                    fw.write("90-100\t\t" + not1 + "\t\t4,00\n");
                    fw.write("85-89\t\t" + not2 + "\t\t3,50\n");
                    fw.write("80-84\t\t" + not3 + "\t\t3,00\n");
                    fw.write("75-79\t\t" + not4 + "\t\t2,50\n");
                    fw.write("70-74\t\t" + not5 + "\t\t2,00\n");
                    fw.write("65-69\t\t" + not6 + "\t\t1,50\n");
                    fw.write("60-64\t\t" + not7 + "\t\t1,00\n");
                    fw.write("50-59\t\t" + not8 + "\t\t0,50\n");
                    fw.write("49 ve ALTI\t" + not9 + "\t\t0,00");
                    
                    
                    System.out.print("NOT\t" + "\tHARF DAGILIMI\t" + "NOTU\n");
                    System.out.print("90-100\t\t" + not1 + "\t\t4,00\n");
                    System.out.print("85-89\t\t" + not2 + "\t\t3,50\n");
                    System.out.print("80-84\t\t" + not3 + "\t\t3,00\n");
                    System.out.print("75-79\t\t" + not4 + "\t\t2,50\n");
                    System.out.print("70-74\t\t" + not5 + "\t\t2,00\n");
                    System.out.print("65-69\t\t" + not6 + "\t\t1,50\n");
                    System.out.print("60-64\t\t" + not7 + "\t\t1,00\n");
                    System.out.print("50-59\t\t" + not8 + "\t\t0,50\n");
                    System.out.print("49 ve ALTI\t" + not9 + "\t\t0,00\n");
                    System.out.println("harfNotu adli txt dosyasi olusmustur");
                    
                    fw.close();
                }catch(Exception e) {System.out.println("Bir hata olustu");}
                break;
        
        
            case("3"):
                File dosya = new File("tumnotlar.txt");
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
                break;
                
            case("4"):
                yeniOgrenciEkle();
                break;
            case("5"):
                loop3 = 0;
                exit(0);
                
            default:
                System.out.println("Bir seyler ters gitti");
        }
    }while(loop3 != 0);
}
          
    

    @Override
    public void programHazirla() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi bolum icin ders programi hazirlamak istiyorsunuz(ilgili no'ya basiniz):\n" + "1.Bilgisayar Muhendisliği\n" 
               + "2.Endustri Muhendisligi\n" + "3.Elektrik-Elektronik Muhendisligi\n" + "4.Makine Muhendisligi");
        
        String bolum = input.nextLine();
        switch(bolum) {
            case("1"): //BILGISAYAR
                System.out.println("Kacinci yariyil icin ders giriceksiniz?");
                int yariyil = input.nextInt();
                try{
                if(yariyil == 1){
                        String dersler1 [] = {"Bilgisayar Muhendisligine Giris", "Calculus-1", "Discrete Mathematics", "Fizik-1", "Introduction to Algorithms" };
                        System.out.println("Bilgisayar muh. 1.yy dersleri sunlardir:\n1-Bilgisayar Muhendisligine Giris\n"
                        + "2-Calculus-1\n" + "3-Discrete Mathematics\n" + "4-Fizik-1\n" + "5-Introduction to Algorithms\n" 
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                            for(int i = 0; i<adet1; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("//1.YY DERSLERI//\n");
                            yazici.write("*PAZARTESI*" +d + "\n");
                        }
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        
                        yazici.close();
                }
                if(yariyil == 2) {
                String dersler1 [] = {"Bilisim Etigi", "Calculus-2", "Linear Algebra", "Fizik-2", "Introduction to Programming" };
                        System.out.println("Bilgisayar muh. 2.yy dersleri sunlardir:\n1-Bilisim Etigi\n"
                        + "2-Calculus-2\n" + "3-Linear Algebra\n" + "4-Fizik-2\n" + "5-Introduction to Programming\n" 
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//2.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        
                        yazici.close();
                }
                
                if(yariyil == 3) {
                String dersler1 [] = {"Devreler ve Sistemler", "Differential Equations", "Lojik Devre Tasarimi", "Nesneye Yonelik Programlama", "Olasilik Teorisi ve Istatistik" + "Veri Yapilari " };
                        System.out.println("Bilgisayar muh. 3.yy dersleri sunlardir:\n1-Devreler ve Sistemler\n"
                        + "2-Differential Equations\n" + "3-Lojik Devre Tasarimi\n" + "4-Nesneye Yonelik Programlama\n" + "5-Olasilik Teorisi ve Istatistik\n" 
                        + "6-Veri Yapilari\n" +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//3.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                
                if(yariyil == 4) {
                String dersler1 [] = {"File Organizations", "Programming Applications", "Mikroislemciler", "Sayisal Metotlar", "Bilgisayar Organizasyonu ve Tasarimi" + "Lojik Devre Lab." };
                        System.out.println("Bilgisayar muh. 4.yy dersleri sunlardir:\n1-File Organizations\n"
                        + "2-Programming Applications\n" + "3-Mikroislemciler\n" + "4-Sayisal Metotlar\n" + "5-Bilgisayar Organizasyonu ve Tasarimi\n" 
                        + "6-Lojik Devre Lab.\n" +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//4.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        
                        yazici.close();
                }
                
                if(yariyil == 5) {
                String dersler1 [] = {"Algorithm Analysis", "Artificial Intelligence and Expert Systems", "Bilgisayar Organizasyonu ve Tasarimi Lab", "Data Communications", "Ileri Linux" + "Muhendislik Ekonomisi", "Operating Systems","Search Engine Design", "Signal Processing", "Sistem Programlama", "Veri Tabani Yonetim Sistemleri","Yonetim Bilisim Sistemleri" };
                        System.out.println("Bilgisayar muh. 5.yy dersleri sunlardir:\n1-Algorithm Analysis\n"
                        + "2-Artificial Intelligence and Expert Systems\n" + "3-Bilgisayar Organizasyonu ve Tasarimi Lab\n" + "4-Data Communications\n" + "5-Ileri Linux\n" 
                        + "6-Muhendislik Ekonomisi\n"+"7-Operating Systems\n"+"8-Search Engine Design\n"+"9-Signal Processing\n"+"10-Sistem Programlama\n"+"11-Veri Tabani Yonetim Sistemleri\n"+"12-Yonetim Bilisim Sistemleri\n"+"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//5.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                if(yariyil == 6) {
                String dersler1 [] = {"Blgisayar Grafikleri", "Bilgisayar Mimarisi", "Computer Networks and Tech.", "Elektronik Devreler", "Goruntu Isleme" + "Insan Bilgisayar Etkilesimi", "Software Engineering","Software Testing and Quality", "Web Programlama" };
                        System.out.println("Bilgisayar muh. 6.yy dersleri sunlardir:\n1-Blgisayar Grafikleri\n"
                        + "2-Bilgisayar Mimarisi\n" + "3-Computer Networks and Tech.\n" + "4-Elektronik Devreler\n" + "5-Goruntu Isleme\n" 
                        + "6-Insan Bilgisayar Etkilesimi\n"+"7-Software Engineering\n"+"8-Software Testing and Quality\n"+"9-Web Programlama\n"+"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//6.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                if(yariyil == 7) {
                String dersler1 [] = {"Bilgisayar Aritmetigi", "Bulanik Mantik", "Derleyici Tasarimi", "Introduction to Machine Learning", "Informasyon Guvenligi ve Kriptoloji" + "Kablosuz Haberlesme Aglari", "Mobile Programming","Neural Networks", "Scripting Languages"};
                        System.out.println("Bilgisayar muh. 7.yy dersleri sunlardir:\n1-Bilgisayar Aritmetigi\n"
                        + "2-Bulanik Mantik\n" + "3-Derleyici Tasarimi\n" + "4-Introduction to Machine Learning\n" + "5-Informasyon Guvenligi ve Kriptoloji\n" 
                        + "6-Kablosuz Haberlesme Aglari\n"+"7-Mobile Programming\n"+"8-Neural Networks\n"+"9-Scripting Languages\n"+"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//7.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                if(yariyil == 8) {
                String dersler1 [] = {"Advanced Algorithm Analysis", "Ağ Programlama", "Bilgisayar Aglarinda Guvenlik", "Finansta Bilisim Teknolojileri", "Gomulu Sistemler ve Uygulamalari" + "Image Processing", "Object Oriented Analysis and Design","System Modeling and Simulations", "Web Engineering"};
                        System.out.println("Bilgisayar muh. 8.yy dersleri sunlardir:\n1-Advanced Algorithm Analysis\n"
                        + "2-Ağ Programlama\n" + "3-Bilgisayar Aglarinda Guvenlik\n" + "4-Finansta Bilisim Teknolojileri\n" + "5-Gomulu Sistemler ve Uygulamalari\n" 
                        + "6-Image Processing\n"+"7-Object Oriented Analysis and Design\n"+"8-System Modeling and Simulations\n"+"9-Signal Processing\n"+"10-Web Engineering" +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("BilgisayarDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//8.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                }catch(Exception e) {
                    System.out.println("Bir hata olustu");
                }
                
                case("2"):  //ENDUSTRI
                    System.out.println("Kacinci yariyil icin ders giriceksiniz?(1. veya 2. yariyil secebiilirsiniz sadece)");
                int eyy = input.nextInt();
                try{
                if(eyy == 1){
                        String dersler1 [] = {"Bilgisayar Temelleri ve Programlamaya Giris", "Endustri Muhendisligine Giris", "Genel Kimya", "Fizik-1", "Matematik-1" };
                        System.out.println("Endustri. 1.yy dersleri sunlardir:\n1-Bilgisayar Temelleri ve Programlamaya Giris\n"
                        + "2-Endustri Muhendisligine Giris\n" + "3-Genel Kimya\n" + "4-Fizik-1\n" + "5-Matematik-1\n" 
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("EndustriDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//1.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                if(eyy == 2) {
                String dersler1 [] = {"Yapisal Programlama","Fizik-2", "Matematik-2" };
                        System.out.println("Endustri muh. 2.yy dersleri sunlardir:\n1-Yapisal Programlama\n"
                        + "2-Fizik-2\n" + "3-Matematik-2\n"
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("EndustriDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//2.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                }catch(Exception e) {
                    System.out.println("Bir hata olustu");
                }
                
                case("3"):  //ELEKTRIK-ELEKTRONIK
                    System.out.println("Kacinci yariyil icin ders giriceksiniz?(1. veya 2. yariyil secebilirsiniz sadece)");
                    int ee = input.nextInt();
                    try{
                    if(ee == 1){
                        String dersler1 [] = {"Matematik-1", "Fizik-1", "Genel Kimya", "Introduction to Computers and Programming", "Elektriksel Malzemeler" };
                        System.out.println("Elektrik Elektronik Muhendisligi 1.yy dersleri sunlardir:\n1-Matematik-1\n"
                        +"Fizik-1\n" + "3-Introduction to Computers and Programming\n" + "4-Elektriksel Malzemeler\n" 
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("EEDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//1.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                    }
                    if(ee == 2) {
                    String dersler1 [] = {"Sayisal Analiz","Fizik-2", "Matematik-2","Linear Algebra" };
                        System.out.println("Elektrik-Elektronik Muhendislig, 2.yy dersleri sunlardir:\n1-Sayisal Analiz\n"
                        + "2-Fizik-2\n" + "3-Matematik-2\n" + "4-Linear Algebra\n"
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("EEDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//2.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                }
                }catch(Exception e) {
                    System.out.println("Bir hata olustu");
                }
                
                
                case("4"):  //MAKINE
                    System.out.println("Kacinci yariyil icin ders giriceksiniz?(1. veya 2. yy secebilirsiniz sadece)");
                    int mm = input.nextInt();
                    try{
                    if(mm == 1){
                        String dersler1 [] = {"Matematik-1", "Genel Kimya", "Fizik-1", "Introduction to Mechinal Engineering", "Introductin to Selected Research Topics in Mechanical Engineering-1", "Linear Algebra" };
                        System.out.println("Makine Muhendisligi 1.yy dersleri sunlardir:\n1-Matematik-1\n"
                        +"2-Fizik-1\n" + "3-Genel Kimya\n" + "4-Introduction to Mechinal Engineering\n"
                        +"5-Introduction to Selected Research Topics in Mechanical Enginnering-1\n"
                        +"6-Linear Algebra\n"        
                        +"Secmek istediginiz dersin numarasini giriniz.");
         
                        FileWriter yazici = new FileWriter("MakineDersProgrami.txt",true);
                        System.out.println("Pazartesi icin kac ders giriceksiniz:");
                        int adet1 = input.nextInt();
                        for(int i = 0; i<adet1; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("//1.YY DERSLERI//\n");
                        yazici.write("*PAZARTESI*" +d + "\n");}
                    
                        System.out.println("Sali icin kac ders giriceksiniz:");
                        int adet2 = input.nextInt();
                        for(int i = 0; i<adet2; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*SALI*" +d + "\n");
                        }
                        System.out.println("Carsamba icin kac ders giriceksiniz:");
                        int adet3 = input.nextInt();
                        for(int i = 0; i<adet3; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CARSAMBA*" +d + "\n");
                        }
                        System.out.println("Persembe icin kac ders giriceksiniz:");
                        int adet4 = input.nextInt();
                        for(int i = 0; i<adet4; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*PERSEMBE*" +d + "\n");
                        }
                        System.out.println("Cuma icin kac ders giriceksiniz:");
                        int adet5 = input.nextInt();
                        for(int i = 0; i<adet5; i++) {
                            int secim = input.nextInt();
                            System.out.println(dersler1[secim-1] + " dersini sectiniz");
                            String d = dersler1[secim-1];
                            yazici.write("*CUMA*" +d + "\n");
                        }
                        yazici.close();
                    }
                    if(mm == 2) {
                    String dersler1 [] = {"Introduction to Selected Research Topics in Mechanical Enginnering-2","Fizik-2", "Matematik-2","Statik" };
                    System.out.println("Elektrik-Elektronik Muhendislig, 2.yy dersleri sunlardir:\n 1-Introduction to Selected Research Topics in Mechanical Enginnering-2\n"
                    + "2-Fizik-2\n" + "3-Matematik-2\n" + "4-Statik\n"
                    +"Secmek istediginiz dersin numarasini giriniz.");
                    FileWriter yazici = new FileWriter("MakineDersProgrami.txt",true);
                    System.out.println("Pazartesi icin kac ders giriceksiniz:");
                    int adet1 = input.nextInt();
                    for(int i = 0; i<adet1; i++) {
                    int secim = input.nextInt();
                    System.out.println(dersler1[secim-1] + " dersini sectiniz");
                    String d = dersler1[secim-1];
                    yazici.write("//2.YY DERSLERI//\n");
                    yazici.write("*PAZARTESI*" +d + "\n");}
                    
                    System.out.println("Sali icin kac ders giriceksiniz:");
                    int adet2 = input.nextInt();
                    for(int i = 0; i<adet2; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("*SALI*" +d + "\n");
                    }
                    System.out.println("Carsamba icin kac ders giriceksiniz:");
                    int adet3 = input.nextInt();
                    for(int i = 0; i<adet3; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("*CARSAMBA*" +d + "\n");
                    }
                    System.out.println("Persembe icin kac ders giriceksiniz:");
                    int adet4 = input.nextInt();
                    for(int i = 0; i<adet4; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("*PERSEMBE*" +d + "\n");
                    }
                    System.out.println("Cuma icin kac ders giriceksiniz:");
                    int adet5 = input.nextInt();
                    for(int i = 0; i<adet5; i++) {
                        int secim = input.nextInt();
                        System.out.println(dersler1[secim-1] + " dersini sectiniz");
                        String d = dersler1[secim-1];
                        yazici.write("*CUMA*" +d + "\n");
                    }
                    yazici.close();
                    }
                    }catch(Exception e) {
                        System.out.println("Bir hata olustu");
                    }
        }
    }
    
    @Override
    public void yeniOgrenciEkle() {
        System.out.println("Eklemek istediginiz ogrencinin sirayla ad, soyad, TC, dogum tarihi ve bolumunu giriniz");
        Scanner input = new Scanner(System.in);
        ad = input.nextLine();
        soyad = input.nextLine();
        tc = input.nextLine();
        dogum = input.nextLine();
        bolum = input.nextLine();
        try{ 
            String dosya = "ogrenciEkle.txt";
            FileWriter yazici = new FileWriter(dosya,true);
            yazici.write("******" +"\nAdi:" +this.ad + "\nSoyad:"+ this.soyad + "\nT.C.:"+ this.tc + "\nDogum Tarihi" + this.dogum +"\nBolum:"+this.bolum + "\n*****\n");
            dosyaKontrol();
            yazici.close();
        }catch(Exception e ) { 
            System.out.println("Bir hata olustu");
        }
    }

 public void dosyaKontrol() {
    try{
    String tcKontrol = this.tc;
    List<String> lines = Files.readAllLines(Paths.get("ogrenciEkle.txt"));
    for(String line : lines) {
        if(line.contains(tcKontrol)) {
            System.out.println(line +" ogrenci zaten var");
        }
    }
    }catch(Exception e) {}
}
 
    @Override
    public void dosyaYaz() {}
    
    @Override
    public void dosyaOku() {
        File dosya = new File("tumnotlar.txt");
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
    
abstract class Bolumler implements dersProgrami {
    abstract void bilgisayar();
    abstract void endustri();
    abstract void elektrik();
    abstract void makine();
    abstract void veterinerlik();
    abstract void tip();
}
    
    
}