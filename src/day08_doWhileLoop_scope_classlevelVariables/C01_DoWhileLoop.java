package day08_doWhileLoop_scope_classlevelVariables;

import java.util.Scanner;

public class C01_DoWhileLoop {

    public static void main(String[] args) {
        // Kullanicinin banka kart sifresi 1453 olarak kayitlidir.
        // Kullanicidan kart sifresini isteyin,
        // kullanici 2 kez yanlis sifre girebilir,
        // 3. kez yanlis sifre girerse ”sifreniz bloke edildi” yazdirin,
        // ilk 3 defada dogru sifre girerse ”isleminize devam ediliyor” yazdirin


        // deneme sayisi ve dogru sifre girilmesine gore farkli akislar olusturabiliriz

        Scanner scanner = new Scanner(System.in);
        int gercekSifre = 1453;
        int girilenSifre = 0;
        int denemeSayisi = 0;


        // 1.yontem while loop ile sifre dogru girilinceye kadar isleme devam edelim
        //   eger deneme sayisi 3 olursa break diyelim
        /*
        while (girilenSifre != gercekSifre){
            System.out.println("Lutfen sifrenizi giriniz...");
            girilenSifre = scanner.nextInt();
            denemeSayisi++;
            if (denemeSayisi >=3  && girilenSifre != gercekSifre){
                System.out.println("sifreniz bloke edildi");
                break;
            }
        }

        if (girilenSifre == gercekSifre){
            System.out.println("isleminize devam ediliyor");
        }

         */


        // 2.yontem do-while loop ile sifre dogru girilinceye kadar isleme devam edelim
        //   eger deneme sayisi 3 olursa break diyelim

        do{
            System.out.println("Lutfen sifrenizi giriniz...");
            girilenSifre = scanner.nextInt();
            denemeSayisi++;

            if (girilenSifre == gercekSifre){
                System.out.println("isleminize devam ediliyor");
                break;
            } else if (denemeSayisi == 3) {
                System.out.println("sifreniz bloke edildi");
                break;
            }

        }while(girilenSifre != gercekSifre);


        // 3.yontem deneme sayisi 3 oluncaya kadar devam ederim
        //   eger sifre dogru olursa break derim
    }
}
