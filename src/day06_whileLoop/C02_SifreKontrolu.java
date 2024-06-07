package day06_whileLoop;

import day05_MethodOlusturma_Overloading.C05_SifreKontrolu;

import java.util.Scanner;

public class C02_SifreKontrolu {

    /*
        Eger baslangic bitis degerleri bilinmiyorsa
        veya tekrar sayisi belli degilse WHILE LOOP tercih edilir
     */

    public static void main(String[] args) {

        // Kullanicidan sifre isteyin
        // day05 class'indaki sifre kontrol method'u ile sifreyi kontrol edin
        // Sifrede hata oldugu muddetce, kullanicidan yeni sifre istemeye devam edin
        // sifre basarili sekilde girilirse
        // kayit basarili olarak olusturuldu yazdirin ve islemi bitirin

        String sifre = "";
        Scanner scanner = new Scanner(System.in);

        while ( C05_SifreKontrolu.sifreGecerliMi(sifre) == false ){

            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz..");
            sifre = scanner.nextLine();


        }

        System.out.println("kayit basarili olarak olusturuldu");
    }
}
