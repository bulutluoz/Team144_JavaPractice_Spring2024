package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C09_AsalSayiIsteme {

    public static void main(String[] args) {
        // 7- Kullanicidan bir asal sayi isteyin.
        //    Girdigi sayiyi kontrol edip asal sayi degilse yeniden sayi isteyin.
        //    Kullanici asal sayi girene kadar bu islemi tekrar edin.
        //    Kullanici asal sayi girdiginde “…. kere deneme sonucunda asal sayi girdiniz” yazdirin.

        Scanner scanner = new Scanner(System.in);
        int sayac = 1;
        int sayi = 6;

        while ( C07_AsalMiMethodu.asalMi(sayi) == false ){

            System.out.println("Lutfen bir asal sayi giriniz...");
            sayi = scanner.nextInt();
            sayac++;
        }


        System.out.println(sayac-1 + " kere deneme sonucunda asal sayi girdiniz");
    }
}
