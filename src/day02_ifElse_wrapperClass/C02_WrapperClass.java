package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C02_WrapperClass {

    public static void main(String[] args) {
        //1- Kullanicidan bir harf isteyin, kullanici kucuk harf verirse harfi buyuk harfe cevirin,
        //   Buyuk harf verirse kucuk harfe cevirin.
        //   Eger harf disinda farkli bir karakter girerse “Harf girmelisiniz” diyerek uyarin.
        //   Soruyu 3 farkli sekilde cozun
        //   - Casting kullanarak
        //   - Wrapper class hazir method’larla
        //   - String manipulasyon kullanarak


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz...");
        char harf = scanner.nextLine().charAt(0);

        // Wrapper class'lar primitive data turleri ile
        // hazir method'lar kullanabilmemiz icin
        // Java'nin olusturdugu class'lardir
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double
        // primitive'ler ile wrapper class'lar arasinda direk gecis mumkundur

        if (Character.isLowerCase(harf)){ // girilen harfin kucuk harf olmasini kontrol eder

            harf = Character.toUpperCase(harf);
            System.out.println("Girdiginiz harfin yeni hali : " + harf);

        } else if (Character.isUpperCase(harf)){ // girilen harf buyuk harf mi diye kontrol eder

            harf = Character.toLowerCase(harf);
            System.out.println("Girdiginiz harfin yeni hali : " + harf);

        }else {

            System.out.println("Harf girmelisiniz");
        }

    }
}
