package day04_StringManipulations_ForLoop;

import java.util.Scanner;

public class C05_KelimeSirasiniDegistirme {

    public static void main(String[] args) {

        //5- Kullanicidan bir cumle alip, cumledeki kelimeleri sondan basa dogru yazdirin.
        //	Ornek :   input : Ali topu at ,  output : at topu Ali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String girilenCumle = scanner.nextLine();

        String degistirilenCumle = "";
        String kelime= "";

        int kelimeBaslangicIndex = 0;
        int kelimeBitisIndex = 0;
        girilenCumle = girilenCumle+" ";
        // kelimeleri space'ler arasindaki metin olarak almak istiyorum
        // cumlenin sonuna da bir space ekledim ki son kelimeyi alabilelim

        for (int i = 0; i <girilenCumle.length() ; i++) {

            if (girilenCumle.charAt(i) == ' '){
                kelimeBitisIndex = i;

                kelime= girilenCumle.substring(kelimeBaslangicIndex,kelimeBitisIndex);

                degistirilenCumle = kelime.trim() +" " + degistirilenCumle;

            }

            kelimeBaslangicIndex = kelimeBitisIndex;

        }

        System.out.println(degistirilenCumle);



    }
}
