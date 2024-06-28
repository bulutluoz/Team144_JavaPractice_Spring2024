package day10_Lists_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ListOlusturma {

    public static void main(String[] args) {

        //2- Kullanicidan listeye eklenmek uzere isimler isteyip,
        //   kullanici Q girince girilen isimleri bir list olarak donduren bir method olusturun

        System.out.println(isimListesiOlustur());
    }


    public static List<String> isimListesiOlustur(){

        List<String > isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String isim = "";

        do {
            System.out.println("Lutfen listeye eklenecek ismi giriniz...");
            isim = scanner.nextLine();

            if (! isim.equalsIgnoreCase("q") ){

                isimler.add(isim);
            }


        }while ( ! isim.equalsIgnoreCase("q")  );

        return isimler;

    }
}
