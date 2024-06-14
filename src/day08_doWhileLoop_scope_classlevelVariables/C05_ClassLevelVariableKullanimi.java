package day08_doWhileLoop_scope_classlevelVariables;

public class C05_ClassLevelVariableKullanimi {
    // Asagidaki kod calistiginda konsolda ne yazdirir ?


    public static void main(String[] args) {

        // System.out.println(C04_Depo.sayiS);
        // System.out.println(C04_Depo.sayiI);

        C04_Depo obj1 = new C04_Depo();

        // System.out.println(obj1.sayiI);
        // System.out.println(obj1.sayiS);

        obj1.sayiI++;
        obj1.sayiS++;


        C04_Depo obj2 = new C04_Depo();
        obj2.sayiI++;
        obj2.sayiS++;

        //System.out.println(obj1.sayiI);
        //System.out.println(obj1.sayiS);
        //System.out.println(obj2.sayiI);
        //System.out.println(obj2.sayiS);
        // System.out.println(C04_Depo.sayiS);
        // System.out.println(C04_Depo.sayiI);



        C04_Depo obj3 = new C04_Depo();
        obj3.sayiI++;
        obj3.sayiS++;

        //System.out.println(obj1.sayiI);
        //System.out.println(obj1.sayiS);
        //System.out.println(obj2.sayiI);
        //System.out.println(obj2.sayiS);
        //System.out.println(obj3.sayiI);
        //System.out.println(obj3.sayiS);
        // System.out.println(C04_Depo.sayiS);
        // System.out.println(C04_Depo.sayiI);

    }
}
