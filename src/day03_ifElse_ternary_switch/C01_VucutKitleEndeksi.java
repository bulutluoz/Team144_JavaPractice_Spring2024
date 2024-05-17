package day03_ifElse_ternary_switch;

import java.util.Scanner;

public class C01_VucutKitleEndeksi {

    public static void main(String[] args) {
        //1- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //  (kilo*10000 / (boy *boy)) ve kisiye durumunu raporlayin
        //
        //	vucut kitle endeksi :
        //	- 30’dan buyukse obez,
        //	- 25-30 arasi ise kilolu,
        //	- 20-25 arasi ise normal,
        //	- 20’den kucukse zayif yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen KG olarak kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lutfen cm olarak biyunuzu giriniz");
        double boy = scan.nextDouble();

        double vke = (kilo*10000 / (boy *boy));

        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (vke>30){
            System.out.println("Durumunuz : OBEZ");
        } else if (vke>25) { // Condition 'vke<=30' is always 'true' when reached
            System.out.println("Durumunuz : KILOLU");
        } else if (vke>20) { // Condition 'vke<=25' is always 'true' when reached
            System.out.println("Durumunuz : NORMAL");
        }else { // geriye kalanlarin hepsi
            System.out.println("Durumunuz : ZAYIF");
        }

    }
}
