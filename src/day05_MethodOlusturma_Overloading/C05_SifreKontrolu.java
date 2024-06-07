package day05_MethodOlusturma_Overloading;

import java.util.Scanner;

public class C05_SifreKontrolu {

    public static void main(String[] args) {
        //5- Kullanicidan bir sifre girmesini isteyin.
        //   Olusturacaginiz bir method ile sifrenin asagidaki sartlari sagladigini kontrol edin.
        //   Kontrol sirasinda saglamayan her sarti ekranda yazdirin.
        //   Method, sifre tum sartlari sagliyorsa “true”, saglanmayan sart varsa “false” dondurmelidir.
        //	 Eger sifre basarili ise kullanicidan kayit islemi icin isim, soyisim ve yasini alin
        //	 ve “kaydiniz basarili sekilde olusturulmustur” yazdirin.

        //	- sifre kucuk harf icermelidir
        //	- sifre buyuk harf icermelidir
        //	- sifre sayi icermelidir
        //	- sifre “!@#$%^&*<>,.?/\+_-=” sembollerinden en az bir tane icermelidir
        //	- sifre bosluk icermemelidir

        // 1- kullanicidan sifreyi al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String girilenSifre = scanner.nextLine();

        // 2- kullanicidan aldigimiz sifreyi method'da kontrol edecegiz
        // sifreGecerliMi(girilenSifre);

        // 3- method true dondururse kullanicidan kayit islemi icin isim, soyisim ve yasini alin
        //	  ve “kaydiniz basarili sekilde olusturulmustur” yazdirin.

        if (sifreGecerliMi(girilenSifre) == true){
            // girilen sifre method'dan true dondururse

            System.out.println("Lutfen isminizi giriniz...");
            String isim = scanner.nextLine();

            System.out.println("Lutfen soyisminizi giriniz...");
            String soyisim = scanner.nextLine();

            System.out.println("Lutfen yasinizi giriniz...");
            int yas = scanner.nextInt();

            System.out.println("kaydiniz basarili sekilde olusturulmustur");

        }
    }

    public static boolean sifreGecerliMi(String girilenSifre){


        boolean kucukHarfIceriyor = false; // true
        boolean buyukHarfIceriyor = false; // true
        boolean sayiIceriyor = false; // true
        boolean ozelKarakterIceriyor = false; // true
        boolean boslukIceriyor = false; // true

        // bir for loop ile sifredeki her karakteri ele alalim

        for (int i = 0; i < girilenSifre.length(); i++) { // a123 B>sdw

            char eleAlinanKarakter = girilenSifre.charAt(i);

            if (Character.isLowerCase(eleAlinanKarakter)) kucukHarfIceriyor=true;
            if (Character.isUpperCase(eleAlinanKarakter)) buyukHarfIceriyor=true;
            if (Character.isDigit(eleAlinanKarakter)) sayiIceriyor=true;

            String verilenOzelKarakterler = "!@#$%^&*<>,.?/\\+_-=";
            if (verilenOzelKarakterler.contains(eleAlinanKarakter+"")) ozelKarakterIceriyor=true;

            if ((eleAlinanKarakter+"").equals(" ")) boslukIceriyor =true;

        }

        if (kucukHarfIceriyor == false) { // kucukHarfIceriyor == false
            System.out.println("Sifre kucuk harf icermelidir.");
        }

        if (buyukHarfIceriyor == false) {
            System.out.println("Sifre Buyuk harf icermelidir.");
        }

        if (sayiIceriyor == false) {
            System.out.println("Sifre sayi icermelidir.");
        }

        if (ozelKarakterIceriyor == false) {
            System.out.println("Sifre ozel karakter icermelidir.");
        }

        if (boslukIceriyor == true) {
            System.out.println("Sifre bosluk icermemelidir.");
        }


        // yukarda hata durumlarini kontrol edip hata varsa yazdirdik
        // sifrenin basarili olmasi tum kontrollerin birlikte yapilmasini gerektirdiginden
        // ayrica yapilmalidir

        if (    kucukHarfIceriyor == true  &&
                buyukHarfIceriyor == true  &&
                sayiIceriyor==true &&
                ozelKarakterIceriyor==true &&
                boslukIceriyor == false) {

            return true;

        }else  return false;
    }

}
