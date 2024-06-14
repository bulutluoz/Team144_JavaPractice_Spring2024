package day08_doWhileLoop_scope_classlevelVariables;

import java.util.Scanner;

public class C02_EnKisaKelime {

    public static void main(String[] args) {

        //2- Kullanicidan en kisa metni bulmak icin metinler isteyin.
        //   Kullanici Q’ya basincaya kadar metin istemeye devam edin.
        //   Kullanici Q’ya bastiginda kac metin girildigini
        //   ve iclerinde en kisa olanin hangi metin oldugunu yazdirin.


        Scanner scanner = new Scanner(System.in);
        String enKisaKelime = "";
        String girilenKelime = "";

        /*
        while ( ! girilenKelime.equalsIgnoreCase("q")   ){

            System.out.println("Lutfen bir metin giriniz, bitirmek icin Q'ya basiniz...");
            girilenKelime = scanner.nextLine();

            if ( girilenKelime.length() < enKisaKelime.length()   && ! girilenKelime.equalsIgnoreCase("q")){

                enKisaKelime = girilenKelime;
            }

        }

        System.out.println("Girilen en kisa kelime : " + enKisaKelime);

         */


        do {
            System.out.println("Lutfen bir metin giriniz, bitirmek icin Q'ya basiniz...");
            girilenKelime = scanner.nextLine();

            if (enKisaKelime.isBlank()){  // ""  veya  "   "
                enKisaKelime = girilenKelime;
            }

            if ( girilenKelime.length() < enKisaKelime.length()
                    && ! girilenKelime.equalsIgnoreCase("q") ){

                enKisaKelime = girilenKelime;
            }


        }while(! girilenKelime.equalsIgnoreCase("q") );

        System.out.println("Girilen en kisa kelime : " + enKisaKelime);
    }
}
