package day07_whileLoop_MethodKullanimi;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class C06_BreakZamanHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        boolean asalMi = true;
        int bolunecekSayi = 2;

        LocalTime timeBaslangic = LocalTime.now();



        while (bolunecekSayi < sayi){

            if (sayi % bolunecekSayi == 0){ // girilen sayi bir tamsayiya bolunebiliyor
                asalMi = false;
                break;
            }
            bolunecekSayi++;
        }


        LocalTime timeBitis = LocalTime.now();

        System.out.println(timeBitis.toNanoOfDay() - timeBaslangic.toNanoOfDay());


        // sayinin asal olup olmadigini simdi yazdirabiliriz

        if (asalMi){ // asalMi== true

            System.out.println("Girilen sayi asal");
        }else {
            System.out.println("Girilen sayi asal degil");
        }
    }
}
