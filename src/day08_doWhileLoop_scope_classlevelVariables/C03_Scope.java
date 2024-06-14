package day08_doWhileLoop_scope_classlevelVariables;

public class C03_Scope {

    static int sayiS;
    static String strS = "Java";
    int sayiI = 20;
    String strI;

    public static void main(String[] args) {
        int sayiMain = 20;
        String strMain;

        for (int i = 0; i <20 ; i++) {
            int sayiL = 12;

        }


    }

    public static void M1(){
        String strM1 = "Ali";
        int sayiM1;

    }

    public void M2(){

        String strM2;
        int sayiM2=13;

    }

}

/*
    1- Hangi variable'lari nerelerden kullanabiliriz veya kullanamayiz
    2- static keyword nerelerde kullanilabilir
    3- deger atanmadan variable olusturulabilir mi veya kullanilabilir mi ?

 */
