package day01_variables_scanner;

import java.util.Scanner;

public class C06_OrtalamaHiz {

    public static void main(String[] args) {
        //6- Kullanicidan gittigi toplam yolu km olarak ve gittigi sureyi dakika olarak alin.
        //   Ortalama hizini tam sayi olarak ve ondalikli sayi olarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen gittiginiz toplam yolu Km olarak giriniz...");
        double mesafe = scanner.nextDouble();

        System.out.println("Lutfen yolda harcadiginiz sureyi dakika olarak giriniz...");
        double sureDakika = scanner.nextDouble();

        double sureSaat = sureDakika/60;

        double ortalamaHizOndalikli = mesafe / sureSaat;

        System.out.println("Yol boyunca ortalama hiziniz : " + ortalamaHizOndalikli + " Km/saat");


        int ortalamaHizTamSayi = (int)ortalamaHizOndalikli;

        System.out.println("Ortalama hiz tamsayi olarak : " + ortalamaHizTamSayi + " Km/saat");

    }
}
