package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C07_MatematikselIslemler {

    public static void main(String[] args) {

        // Kullanicidan iki ondalikli sayi alin,
        // kullaniciya sonucu tam sayi mi yoksa ondalikli olarak mi istedigini sorun,
        // kullanicinin tercihine gore sayi1/sayi2 sonucunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki ondalikli sayi giriniz...");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("Lutfen tercihinizi giriniz \n1: sonucu tamsayi olarak istiyorum" +
                "\n2: sonucu ondalikli sayi olarak istiyorum");

        int tercih = scanner.nextInt();

        if (tercih == 1){
            System.out.println("iki sayinin bolumu : " + (int)(sayi1/sayi2) );
        } else if (tercih == 2) {
            System.out.println("Bolme sonucunun ondalikli hali : " +  sayi1 / sayi2 );
        }

    }
}
