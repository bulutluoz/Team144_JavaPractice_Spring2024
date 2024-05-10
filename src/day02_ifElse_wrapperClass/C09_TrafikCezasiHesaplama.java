package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C09_TrafikCezasiHesaplama {

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


        if (ehliyetVarMi == 1){ // ehliyeti olanlar
            if (hiz<=0){
                System.out.println("Gecersiz hiz");
            } else if (hiz <= 50) {
                System.out.println("Kurallara uydugunuz icin tesekkur ederiz");
            } else if (hiz <= 75) {
                System.out.println("Ceza 100 $ ");
            } else if (hiz <=90) {
                System.out.println("Ceza 150 $ ");
            }else {
                System.out.println("Ceza 500 $ ");
            }

        } else if (ehliyetVarMi == 2) { // ehliyeti olmayanlar
            if (hiz<=0){
                System.out.println("Gecersiz hiz");
            } else if (hiz <= 50) {
                System.out.println("Ehliyetsiz arac kullanma cezasi : 200$");
            } else if (hiz <= 75) {
                System.out.println("Ehliyetsiz olmaniz ve hiziniz sebebiyle ceza 300 $ ");
            } else if (hiz <=90) {
                System.out.println("Ehliyetsiz olmaniz ve hiziniz sebebiyle ceza 350 $ ");
            }else {
                System.out.println("Ehliyetsiz olmaniz ve hiziniz sebebiyle ceza 700 $ ");
            }

        }else { // ehliyet bilgisini yanlis girenler
            System.out.println("Ehliyetiniz var mi sorusuna 1 veya 2 degerlerinden uygun olani girmelisiniz");

        }
    }
}
