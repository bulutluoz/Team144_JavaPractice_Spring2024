package day01_variables_scanner;

import java.util.Scanner;

public class C03_SekerHesabi {

    public static void main(String[] args) {

        //3- Kullaniciya ismini, soyismini
        //   gunde kac cay ictigini ve caya kac seker attigini sorun.
        //   1 yilda tukettigi seker miktarini hesaplayip, asagidaki sekilde yazdirin.
        //      (Bir seker 4 gr olarak degerlendirilir.)
        //	 Sayin Ali Yilmaz, ictiginiz cay ile birlikte yilda ….. Kg seker tuketiyorsunuz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz...");

        String isim = scanner.nextLine();

        System.out.println("lutfen soyisminizi giriniz...");

        String soyisim = scanner.nextLine();

        System.out.println("Gunde kac cay iciyorsunuz ve kac seker atiyorsunuz");

        int caySayisi = scanner.nextInt();
        double sekerSayisi = scanner.nextDouble();

        // once hesabi yapalim

        double yillikSekerMiktari = caySayisi * sekerSayisi * 365 * 0.004;


        //	 Sayin Ali Yilmaz, ictiginiz cay ile birlikte yilda ….. Kg seker tuketiyorsunuz.

        System.out.println(

                "Sayin " + isim + " " + soyisim + ", ictiginiz cay ile birlikte yilda "
                + yillikSekerMiktari + " Kg seker tuketiyorsunuz."
        );

































    }
}
