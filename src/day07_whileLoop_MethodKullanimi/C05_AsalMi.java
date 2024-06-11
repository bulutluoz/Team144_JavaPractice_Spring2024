package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C05_AsalMi {

    public static void main(String[] args) {

        // 5- Verilen bir sayinin asal olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        boolean asalMi = true;
        int bolunecekSayi = 2;

        while (bolunecekSayi < sayi){

            if (sayi % bolunecekSayi == 0){ // girilen sayi bir tamsayiya bolunebiliyor
                asalMi = false;
                break;
            }
            bolunecekSayi++;
        }

        // sayinin asal olup olmadigini simdi yazdirabiliriz

        if (asalMi){ // asalMi== true

            System.out.println("Girilen sayi asal");
        }else {
            System.out.println("Girilen sayi asal degil");
        }

    }
}
