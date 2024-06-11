package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C01_UsHesaplama {

    public static void main(String[] args) {

        //1- Kullanicidan pozitif bir tamsayi
        //   ve hesaplamak istedigi üs değerini alıp sonucu yazdırın.
        //   sayi 2 , us 3 ise  2 * 2 * 2 => 8

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        System.out.println("Lutfen hesaplamak istediginiz us icin pozitif bir tamsayi giriniz..");
        int us = scanner.nextInt();

        int sonuc = 1;

        while (us > 0){
            sonuc = sonuc * sayi;
            us--;
        }

        System.out.println("islem sonucu : " + sonuc);



    }
}
