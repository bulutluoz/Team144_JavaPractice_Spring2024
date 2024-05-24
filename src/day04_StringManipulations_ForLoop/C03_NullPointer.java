package day04_StringManipulations_ForLoop;

public class C03_NullPointer {


    public static void main(String[] args) {

        /*
            1- Null Pointer : bir deger degil ISARETCIDIR

            2- Null Pointer, deger atamak istemedigimiz variable'lari isaretlemek icin kullanilir
                        b ve c deger atanmayan variable'lardir
                        java deger atanmayan b'yi kullanmaniza HIC BIR SEKILDE izin vermez
                        b'yi kullanmak isterseniz CTE olusur
                        sadece kullanilan class degil projenin hic bir class'i calistirilamaz
                        null olarak isaretlenen variable kodun CALISMASINA ENGEL OLMAZ
            3- Null olarak isaretlenen bir variable YAZDIRILABILIR,
               ama baska hicbir method ile KULLANILAMAZ

         */

        // Asagidaki kod calistirilirsa her satirda ne yazdirir?

                String a = "";          // degeri var

                String b ;              // degeri yok

                String c = null;        // degeri yok

                String d = "Tava";      // degeri var

                System.out.println(a);  // konsolda bos bir satir gorurur

                //System.out.println(b);// Compile Time Error
                                        // degeri olmayan bir variable KULLANILAMAZ
                System.out.println(c);  // null yazdirir

                System.out.println(a + d); // ""+"Tava" ==> Tava

                // System.out.println(b + d);// Compile Time Error
                                             // degeri olmayan bir variable KULLANILAMAZ

                System.out.println(c + d); // null + "Tava" ==> nullTava

                System.out.println(a.length()); // "".lengt() ==> 0
                                                // length() ==> kullanilan karakter sayisi

                //System.out.println(b.length()); // Compile Time Error
                                                // degeri olmayan bir variable KULLANILAMAZ

                System.out.println(c.length()); // RunTime'da yani calistirinca
                                                // NullPointerException

    }
}
