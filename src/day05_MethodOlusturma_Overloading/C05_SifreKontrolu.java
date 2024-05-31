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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String girilenSifre = scanner.nextLine();


    }

    public static boolean sifreGecerliMi(){

        boolean sifreKontrolSonucu = false;




        return sifreKontrolSonucu;
    }

}
