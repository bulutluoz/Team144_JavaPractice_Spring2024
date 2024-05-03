package day01_variables_scanner;

import java.util.Scanner;

public class C04_SekerHesabi {

    public static void main(String[] args) {

        //4- Yukardaki sorunun ciktisini asagidaki sekilde yapin
        //	 isim : A Yilmaz
        //	 gunluk cay adedi : …
        //	 yillik tuketilen seker miktari : … Kg


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


        //4- Yukardaki sorunun ciktisini asagidaki sekilde yapin
        //	 isim : A Yilmaz
        //	 gunluk cay adedi : …
        //	 yillik tuketilen seker miktari : … Kg

        System.out.println(

               "isim : " + isim.charAt(0) + " " + soyisim +
               "\ngunluk cay adedi : " + caySayisi +
               "\nyillik tuketilen seker miktari : " + yillikSekerMiktari + " Kg"

        );


    }
}
