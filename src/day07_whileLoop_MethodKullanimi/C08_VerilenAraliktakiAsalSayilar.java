package day07_whileLoop_MethodKullanimi;

import java.util.Scanner;

public class C08_VerilenAraliktakiAsalSayilar {

    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis degerlerini alin
        // bu degerler dahil olarak aralarindaki asal sayilari yazdirin
        // input  7   15  output ==> 7 11 13

        Scanner scanner = new Scanner(System.in);

        System.out.println("Baslangic olarak pozitif bir tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis olarak pozitif bir tamsayi giriniz...");
        int bitis = scanner.nextInt();
        int sayac = 0;


        while ( baslangic <= bitis){

            if (C07_AsalMiMethodu.asalMi(baslangic)){
                System.out.print( baslangic + " ");
                sayac++;
            }

            baslangic++;
        }

        System.out.println("\nToplam " + sayac + " adet asal sayi bulundu");
    }
}
