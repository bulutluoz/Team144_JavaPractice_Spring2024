package day04_StringManipulations_ForLoop;

public class C03_NullPointer {


    public static void main(String[] args) {

        /*
            Null Pointer : bir deger degil ISARETCIDIR

            b ve c deger atanmayan variable'lardir
            java deger atanmayan b'yi kullanmaniza HIC BIR SEKILDE izin vermez
            ama null olarak ISARETLENEN variable'lari SADECE yazdirmamiza izin verir

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

        //        System.out.println(a + d);
        //
        //        System.out.println(b + d);
        //
        //        System.out.println(c + d);
        //
        //        System.out.println(a.length());
        //
        //        System.out.println(b.length());
        //
        //        System.out.println(c.length());
    }
}
