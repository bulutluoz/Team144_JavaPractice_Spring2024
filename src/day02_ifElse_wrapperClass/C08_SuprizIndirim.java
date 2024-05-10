package day02_ifElse_wrapperClass;

import java.util.Scanner;

public class C08_SuprizIndirim {

    public static void main(String[] args) {
        // Bir market indirim karti sahibi olanlara supriz yapmaktadir.
        // Kullaniciya indirim karti olup olmadigini ,
        // kacinci ayda dogdugunu ve ayin kacinda dogdugunu sorun.
        // Eger dogum gunu 10 mayis ise “%30 indirim kazandiniz” yazdirin,
        // 10 mayis degilse “%10 indirim kazandiniz” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indirim kartiniz var mi ?  \n1 : Evet, 2: Hayir");
        int kartVarMi = scanner.nextInt();

        System.out.println("Dogum tarihinizin ay kismini sayi olarak giriniz");
        int ay = scanner.nextInt();

        System.out.println("Dogum tarihinizin gun kismini sayi olarak giriniz");
        int gun = scanner.nextInt();

        if (kartVarMi == 1){ // karti var

            if (ay==5 && gun==10){
                System.out.println("%30 indirim kazandiniz");
            }else {
                System.out.println("%10 indirim kazandiniz");
            }

        } else if (kartVarMi == 2) { // karti yok

            System.out.println("Indirimler icin kart almalisiniz");

        }else{ // kart var mi sorusuna 1 veya 2 disinda bir deger girmis
            System.out.println("Kartiniz var mi sorusuna 1 veya 2 degerlerinden uygun olani girmelisiniz");
        }
    }
}
