package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

        //1- Kullanicidan bir harf isteyin, kullanici kucuk harf verirse harfi buyuk harfe cevirin,
        //   Buyuk harf verirse kucuk harfe cevirin.
        //   Eger harf disinda farkli bir karakter girerse “Harf girmelisiniz” diyerek uyarin.
        //   Soruyu 3 farkli sekilde cozun
        //   - Casting kullanarak
        //   - Wrapper class hazir method’larla
        //   - String manipulasyon kullanarak


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        String girilenMetin = scanner.nextLine();

        // oncelikle kullanici 1 harf mi girmis kontrol edip,
        // bir harften fazla ise uyari yazdirabiliriz

        if (girilenMetin.length() != 1) { // girilen metin tek bir harf degil
            System.out.println("Sizden sadece 1 harf istedim...");

        } else if (Character.isUpperCase(girilenMetin.charAt(0))) { // girilen metin tek bir buyuk harf
            girilenMetin = girilenMetin.toLowerCase();
            System.out.println("Girdiginiz harfin yeni hali : " + girilenMetin);

        } else if (Character.isLowerCase(girilenMetin.charAt(0))) {
            girilenMetin = girilenMetin.toUpperCase();
            System.out.println("Girdiginiz harfin yeni hali : " + girilenMetin);
        } else {
            System.out.println("Harf girmelisiniz");
        }

    }
}
