package day10_Lists_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListedenIsimSilme {

    public static void main(String[] args) {
        //3- Verilen bir listeden, verilen istenmeyen harf iceren isimleri silip,
        //   kalan isimleri bir list olarak donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Ahmet","Ali","Veli","Cem"));
        String istenmeyenHarf = "e";

        System.out.println(istenmeyenIsimleriSil(isimler, "i"));

    }

    public static List<String> istenmeyenIsimleriSil(List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size() ; i++) {
            // i. index'deki isim istenmeyenHarf iceriyorsa i.index'deki ismi silelim
            if ( isimler.get(i).contains(istenmeyenHarf) ){

                isimler.remove(i);

                i--;
            }

        }

        return isimler;
    }



}
