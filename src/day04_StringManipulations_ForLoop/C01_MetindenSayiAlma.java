package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C01_MetindenSayiAlma {

    public static void main(String[] args) {

        //1- Bir web sayfasi yapilan arama sonucunda
        //   “Aradiginiz Nutella icin 124.456.112 sonuc bulunmustur” diye sonuc yazdirmaktadir.
        //	 Web sayfasinda arama sonucunda alinan cumledeki
        //	 bulunan sonuc sayisinin 100 binden fazla oldugunu test eden kod yaziniz.

        String sonucYazisi = "Aradiginiz Nutella icin 124.456.112 sonuc bulunmustur";

        // sonucYazisi.replace(".","");
        // replace() de verilen istenen degisikligi butun metin yapar
        // ornegin 18.satirdaki kod Butun .'lari yok eder

        // replaceAll() da istersek tek bir karakteri veya metin parcasini degistirebilir
        // sonucYazisi.replaceAll("a","t")
        // AMMA replaceAll()'un asil kullanim amaci butun sayilar, butun bosluklar gibi..
        // genel ifadeler kullanabilecegimiz regex kullanimidir

        sonucYazisi = sonucYazisi.replaceAll("\\D","");

        System.out.println(sonucYazisi); // "124456112"

        int sonucSayisi = Integer.parseInt(sonucYazisi); // 124456112

        if (sonucSayisi > 100000){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else System.out.println("Arama sonuc sayisi testi FAILED");

    }
}
