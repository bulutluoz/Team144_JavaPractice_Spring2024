package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C04_SifreKontrolu {

    public static void main(String[] args) {

        //4- Kullanicidan bir sifre girmesini isteyin.
        //   Sifrenin asagidaki sartlari sagladigini kontrol edin
        //   ve saglamadigi her sarti ekranda yazdirin.
        //   Eger sifre tum sartlari sagliyorsa “Sifre basarili sekilde kaydedildi” yazdirin

        //	- sifre kucuk harf icermelidir
        //	- sifre buyuk harf icermelidir
        //	- sifre sayi icermelidir
        //	- sifre “!@#$%^&*<>,.?/\+_-=” sembollerinden en az bir tane icermelidir
        //	- sifre bosluk icermemelidir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String girilenSifre = scanner.nextLine();

        // Tum harfleri tek tek ele alip
        // sartlari tek tek kontrol etmek icin
        // her bir sart icin SAYAC veya FLAG kullanmaliyiz
        // SAYAC 'da kucuk harfleri sayip, sona geldiginde sayac 0 degilse kucuk harf vardir diyebilirim
        // FLAG'da sadece istenen sarti sagliyor veya saglamiyor konusuna odaklaniriz
        // en basta false yapip, saglayan herhangi bir deger ile karsilastigimizda true yapariz

        // biz flag ile yapiyoruz

        // basta tum variable'lara false degerleri atadik
        // her bir karakteri kontrol edip, durumu degistiren bir deger olursa
        // flag'i degistirecegiz

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

        if (kucukHarfIceriyor == true  &&
            buyukHarfIceriyor == true  &&
            sayiIceriyor==true &&
            ozelKarakterIceriyor==true &&
            boslukIceriyor == false) {

            System.out.println("Sifreniz basarili olarak kaydedildi...");
        }

    }
}
