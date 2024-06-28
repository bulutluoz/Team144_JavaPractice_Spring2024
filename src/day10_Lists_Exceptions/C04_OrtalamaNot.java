package day10_Lists_Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C04_OrtalamaNot {
    public static void main(String[] args) {

        //4- Ogretmenden istedigi kadar not alip,
        //   ogretmen Q’ya bastiginda
        //   - girilen not sayisini,
        //   - girilen notlarin ortalamasini
        //   - ve ortalama uzerindeki ogrenci sayisini yazdiran bir method olusturun

        notDegerlendir();





    }

    public static void notDegerlendir(){

        //4- Ogretmenden istedigi kadar not alip,
        //   ogretmen Q’ya bastiginda

        List<Double>  notListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double not = 0;
        String notOlmayanGiris = "";

        do {
            System.out.println("Ogrenci notu giriniz, bitirmek icin Q'ya basiniz...");

            try {
                not = scanner.nextDouble();
                notListesi.add(not);

            } catch (InputMismatchException e) {
                // try bolumunde nextDouble() kullanildigindan
                // double olmayan HERHANGI bir deger girildiginde exception olusacak ve kod bu satira gelecek

                notOlmayanGiris = scanner.nextLine();
                if (!  notOlmayanGiris.equalsIgnoreCase("q")){
                    System.out.println("Mesaja uygun giris yap...");
                }

            }

        }while( !  notOlmayanGiris.equalsIgnoreCase("q")       );


        //   - girilen not sayisini,
        System.out.println(notListesi.size() +" adet not girdiniz");
        //   - girilen notlarin ortalamasini

        double notToplami=0;

        for (double each : notListesi
             ) {
            notToplami += each;
        }

        double ortalama = notToplami / notListesi.size();

        System.out.println("Girilen notlarin ortalamasi : " + ortalama);

        //   - ve ortalama uzerindeki ogrenci sayisini yazdiran bir method olusturun

        int ortalamaUzerindekiOgrenciSayisi = 0;

        for (double each : notListesi
           ) {

            if ( each > ortalama ){

                ortalamaUzerindekiOgrenciSayisi++;
            }

        }

        System.out.println("Ortalama uzerindeki ogrenci sayisi : " + ortalamaUzerindekiOgrenciSayisi);

    }
}
