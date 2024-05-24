package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C02_VerilenCumleyiIstenenHaleGetirme {

    public static void main(String[] args) {

        //2- Kullanicidan sadece harflerden olusan
        //   ve kelimeler arasinda tek bosluk iceren bir cumle girmesini isteyin.
        //   Kullanicinin girdigi cumleyi inceleyerek
        //	- sayilari
        //	- ozel karakterleri silip
        //	- kelimeler arasinda birden fazla space varsa tek space haline getirip
        //  	cumleyi yeni haliyle kaydedin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sadece harflerden olusan bir cumle giriniz,\nkelimeler arasinda tek space olmalidir");

        String girilenCumle = scanner.nextLine();  // Ben12   isted*ig76im  gi_bi yaz...ar[[i]m

        // birden fazla space'i regex ile ifade etmek icin s+
        girilenCumle = girilenCumle.replaceAll("\\s+"," ");

        // once sayilardan kurtulalim
        girilenCumle = girilenCumle.replaceAll("\\d","");

        // ozel karakterleri yok ettigimizde space de gider
        // space'i koruma altina almak icin gecici olarak space yerine bir rakam yazalim

        girilenCumle = girilenCumle.replace(" ", "4");
        // simdi tum ozel karakterleri yok edelim
        // w ==> tum harfler, tum sayilar ve _
        girilenCumle = girilenCumle.replaceAll("\\W","");

        // artik space yerine yazdigimiz 4'u yeniden space'e cevirelim
        girilenCumle = girilenCumle.replaceAll("4"," ");

        // son olarak _ 'yi yok edelim
        girilenCumle = girilenCumle.replaceAll("_","");

        System.out.println(girilenCumle);

    }
}
