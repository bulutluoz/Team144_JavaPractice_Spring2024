package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C04_HesaplananUsDegeriniKullanma {

    public static void main(String[] args) {

        // 4- Kullanicidan pozitif bir tamsayi ve hesaplamak istedigi üs değerini alın.
        //    Üs hesaplandığında eğer sonuc 100’den kucuk ise “kucuk sayilar icin beni ugrastirma”
        //    , sonuc 100’den buyukse “istenen islemin sonucu ….” yazdirin.



        // Kullanicidan pozitif bir tamsayi ve hesaplamak istedigi üs değerini alın.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println("Lutfen hesaplamak istediginiz us icin pozitif bir tamsayi giriniz..");
        int us = scanner.nextInt();

        //    Üs hesaplandığında
        int sonuc = C03_UsDegeriDondurme.usHesapla(sayi,us);

        //  eğer sonuc 100’den kucuk ise “kucuk sayilar icin beni ugrastirma”
        //    , sonuc 100’den buyukse “istenen islemin sonucu ….” yazdirin.

        if (sonuc<100) {
            System.out.println("kucuk sayilar icin beni ugrastirma");
        }else {
            System.out.println("istenen islemin sonucu : " + sonuc);
        }


    }
}
