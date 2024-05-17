package day03_ifElse_ternary_switch;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        //3- Kullanicidan iki ondalikli sayi alin,
        //   kullaniciya sonucu tam sayi mi yoksa ondalikli olarak mi istedigini sorun,
        //   kullanicinin tercihine gore sayi/sayi2 sonucunu yazdirin. (ternary)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Lutfen tercihinizi giriniz \n1: sonucu tamsayi olarak istiyorum" +
                "\n2: sonucu ondalikli sayi olarak istiyorum");

        int tercih = scanner.nextInt();

        // soruyu if else ile yaparsak
        /*
            if, else-if, else-if.... cumleleri else ile bitmek ZORUNDA DEGILDIR

            ANCAK
            else ile biten if else cumleleri HER DURUMDA mutlaka calisirken
            else ile bitmeyen if-else cumleleri girdigimiz bazi degerler icin
            sonuc URETMEYEBILIR
         */

        if (tercih == 1){ // sonucu tamsayi olarak istiyor

            System.out.println(sayi1/sayi2);

        } else if (tercih == 2) { // sonucu ondalikli sayi olarak istiyor

            System.out.println(  (double)sayi1/sayi2);
        }


        /*
            TERNARY
            sadece 2 durumdan olusan
            ve kod olarak sadece tek satirdan olusan
            if-else cumleleri yerine kullanilabilir
            ama daha kompleks kodlar icin KULLANILMAMASI tavsiye edilir
         */

        // System.out.println(  tercih ==1 ?  sayi1/sayi2  :  (double)sayi1/sayi2    );


        // eger 2'ye esit olmasini da kontrol etmek istersek
        // bu durumda 2 kontrol oldugundan
        // nested ternary yapmak gerekir

        System.out.println(
                        tercih ==1
                        ?
                        sayi1/sayi2
                        :
                        tercih == 2 ? (double)sayi1/sayi2 : "tercih 1 veya 2 olmali"
                        );


    }
}
