package day03_ifElse_ternary_switch;

import java.util.Scanner;

public class C04_Switch {

    public static void main(String[] args) {

        // 4- Kullanicinin 2 basamakli bir sayi alip, sayiyi yazi ile yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 basamakli pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        int birlerBasamagindakiRakam = girilenSayi % 10;
        int onlarBasamagindakiRakam = girilenSayi / 10 ;

        // once onlar basamagindaki rakami yazi ile yazdiralim
        // 1,2,3,4,5,6,7,8,9

        switch (onlarBasamagindakiRakam){

            case 1 :
                System.out.print("On");
                break;
            case 2 :
                System.out.print("Yirmi");
                break;
            case 3 :
                System.out.print("Otuz");
                break;
            case 4 :
                System.out.print("Kirk");
                break;
            case 5 :
                System.out.print("Elli");
                break;
            case 6 :
                System.out.print("Altmis");
                break;
            case 7 :
                System.out.print("Yetmis");
                break;
            case 8 :
                System.out.print("Seksen");
                break;
            case 9 :
                System.out.print("Doksan");

        }

        switch (birlerBasamagindakiRakam){

            case 1 :
                System.out.print("bir");
                break;
            case 2 :
                System.out.print("iki");
                break;
            case 3 :
                System.out.print("uc");
                break;
            case 4 :
                System.out.print("dort");
                break;
            case 5 :
                System.out.print("bes");
                break;
            case 6 :
                System.out.print("Alti");
                break;
            case 7 :
                System.out.print("Yedi");
                break;
            case 8 :
                System.out.print("Sekiz");
                break;
            case 9 :
                System.out.print("Dokuz");

        }


    }
}
