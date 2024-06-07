package day06_whileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
            java'da tekrar edilecek islemler yapmak istedigimizde
            EGER baslangic, bitis degerleri biliniyorsa
            veya tekrar sayisi belli ise FOR LOOP tercih edilir

            For loop ile yapilacak her islem while loop ile de YAPILABILIR
            ancak daha ZAHMETLI olur
            cunku while loop'da baslangic, bitis ve artis degerleri otomatik gelmez
            hepsini bizim yazmamiz gerekir
         */


        // Kullanicidan bir sayi isteyin
        // ve girilen sayi kadar alt alta "Java Candir" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tekrar sayisini giriniz...");
        int tekrarSayisi = scanner.nextInt();

        for (int i = 1; i <=tekrarSayisi ; i++) {
            System.out.println("Java Candir.");
        }


        // while loop ile ayni islemi yapalim
        System.out.println("===================");

        int baslangic = 1;

        while (baslangic <= tekrarSayisi){
            System.out.println("Java Candir");
            baslangic++;
        }

    }
}
