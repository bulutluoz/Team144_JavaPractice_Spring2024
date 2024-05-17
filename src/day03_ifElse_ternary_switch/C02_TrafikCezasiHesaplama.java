package day03_ifElse_ternary_switch;

import java.util.Scanner;

public class C02_TrafikCezasiHesaplama {
    public static void main(String[] args) {

        // Hiz sinirinin 50 km oldugu bir bolgede kullanicinin hizini alip,
        // ceza miktarini hesaplayan bir program yazin
        // (asagidaki sinirlarda baslangic dahil degil, bitis dahildir)
        //	* Eger Hiz 50-75 arasinda ise: Ceza 100 $'dir.
        //  * Eger Hiz 75 - 90 arasinda ise: Ceza 150 $'dir.
        //  * Eger Hiz 90’dan daha fazla ise: Ceza 500 $'dir.
        //  Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
        //  Orn: Hiz 77 iken ceza 150$'dir ama kullanicinin ehliyeti yoksa ceza 350 $ olur.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen hizinizi giriniz...");
        double hiz = scanner.nextDouble();

        System.out.println("Ehliyetiniz var mi ? \n1: Evet, 2: Hayir");
        int ehliyetVarMi = scanner.nextInt();

        /*
         ehliyet yoksa kismi olmasaydi, sadece hizi dusunmek durumunda olacaktik

        if (hiz<=50 ) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz");
        else if (hiz<=75) System.out.println("Cezaniz 100$");
        else if (hiz<=90) System.out.println("Cezaniz 150$");
        else System.out.println("Cezaniz 500$");

         */


        // verilen degisken birden fazla ise bu durumda nested if-else kullanmaliyiz
        // Bu soru icin 2 degisken var 1- Hiz, 2- ehliyet var mi ?
        // 2 degiskenden birini ana degisken kabul edip, once ona gore bir if else olusturalim
        // ana degisken ehliyet olsun

        if (ehliyetVarMi == 1){
            // bu suzgecin icinde SADECE ehliyeti olanlar kalir
            if (hiz<=50 ) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz");
            else if (hiz<=75) System.out.println("Cezaniz 100$");
            else if (hiz<=90) System.out.println("Cezaniz 150$");
            else System.out.println("Cezaniz 500$");

        } else if (ehliyetVarMi == 2) {
            // bu suzgecin icinde SADECE ehliyeti olmayanlar kalir
            if (hiz<=50 ) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz, \nancak ehliyetsiz arac kullanmak suctur, cezaniz 200$");
            else if (hiz<=75) System.out.println("Cezaniz 300$");
            else if (hiz<=90) System.out.println("Cezaniz 350$");
            else System.out.println("Cezaniz 700$");

        }else {
            System.out.println("Ehliye var mi sorusuna 1 veya 2 olarak cevap vermelisiniz");
        }



        // ana degiskeni hiz yapalim

        if (hiz<=50 ) {
            // hizi 50'den dusuk olanlar
            if (ehliyetVarMi == 1)System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz");
            else if (ehliyetVarMi == 2) System.out.println("Hiz sinirina uydugunuz icin tesekkur ederiz, \nancak ehliyetsiz arac kullanmak suctur, cezaniz 200$");
            else System.out.println("Ehliyet var mi sorusuna 1 veya 2 olarak cevap vermelisiniz");

        }
        else if (hiz<=75) {
            // hizi 50'den buyuk olup, 75'den kucuk olanlar
            if (ehliyetVarMi == 1)System.out.println("Cezaniz 100$");
            else if (ehliyetVarMi == 2) System.out.println("Cezaniz 300$");
            else System.out.println("Ehliyet var mi sorusuna 1 veya 2 olarak cevap vermelisiniz");

        }
        else if (hiz<=90) {
            // hizi 75'den buyuk olup, 90'dan kucuk olanlar
            if (ehliyetVarMi == 1)System.out.println("Cezaniz 150$");
            else if (ehliyetVarMi == 2) System.out.println("Cezaniz 350$");
            else System.out.println("Ehliyet var mi sorusuna 1 veya 2 olarak cevap vermelisiniz");

        }
        else {
           // hizi 90'dan buyuk olanlar
            if (ehliyetVarMi == 1)System.out.println("Cezaniz 500$");
            else if (ehliyetVarMi == 2) System.out.println("Cezaniz 700$");
            else System.out.println("Ehliyet var mi sorusuna 1 veya 2 olarak cevap vermelisiniz");

        }


    }
}
