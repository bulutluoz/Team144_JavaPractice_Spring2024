package day08_doWhileLoop_scope_classlevelVariables;

public class C03_Scope {

    static int sayiS;
    static String strS = "Java";
    int sayiI = 20;
    String strI;

    public static void main(String[] args) {
        int sayiMain = 20;
        // static String strMain; // Modifier 'static' not allowed here

        for (int i = 0; i <20 ; i++) {
            int sayiL = 12;
            System.out.println(sayiMain);
        }
        //System.out.println(sayiL);
        //System.out.println(i);
        //System.out.println(strM2);
        System.out.println(strS);
        // System.out.println(sayiI); // Non-static field 'sayiI' cannot be referenced from a static context
        System.out.println(sayiS); // Java'nin belirledigi default deger olan 0 yazdirir

    }
    public static void M1(){
        String strM1 = "Ali";
        int sayiM1;
        //System.out.println(strMain);
        //System.out.println(strM2);
        // System.out.println(sayiM1);
        System.out.println(strS);
        //System.out.println(sayiI);

    }

    public void M2(){
        String strM2;
        int sayiM2=13;
        //System.out.println(strMain);
        // System.out.println(strM2); // Variable 'strM2' might not have been initialized
        System.out.println(strS);
        System.out.println(sayiI);
    }

}

/*
    Scope
    Bir kod blogu icin scope suslu parantezlerin icidir,
    Variable'lar icin scope variable'in kullanilabildigi alandir

    Variable'larin scope'u olusturulduklari yere gore degisir
    - Loop Variables : Bir loop'un icinde olusturulan variable'lar
                       sadece o Loop'un icinde kullanilabilirler

    - Local Variables : Class'in icerisinde bulunan
                        bir method veya kod blogunda olusturulan variable'lardir
                        SADECE olusturulduklari kod blogu icinde kullanilabilirler

                        Local variable'lar static olarak ISARETLENEMEZ

                        Local variable'lar deger atamadan olusturulabilir ama
                        deger atanmadan KULLANILAMAZ

     - Class Level Variables : BUTUN class'dan kullanilabilirler
                               ANCAK class level variable'lar icin SADECE scope'a bakmak yeterli OLMAZ
                               STATIC keyword'une de dikkat etmemiz gerekir
            ==> class level variable static olarak isaretlenmisse,
                class icindeki HER YERDEN kullanilabilir
            ==> class level variable instance ise (yani static olarak isaretlenmemisse)
                static method'lardan kullanilamaz
                sadece KENDISI gibi static olmayan method'lardan kullanilabilir

            Class level variable'lar (static veya instance) deger atamadan OLUSTURULABILIR
            ve KULLANILABILIR
            Eger deger atanmamissa, Java'nin default olarak belirledigi degerleri alir
            sayisal primitive'ler ==> 0
            boolean ==> false
            char ==> '' hiclik
            Non-primitive data turleri ==> null


    1- Hangi variable'lari nerelerden kullanabiliriz veya kullanamayiz
    2- static keyword nerelerde kullanilabilir
    3- deger atanmadan variable olusturulabilir mi veya kullanilabilir mi ?

 */
