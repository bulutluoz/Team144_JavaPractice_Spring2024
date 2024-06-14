package day08_doWhileLoop_scope_classlevelVariables;

public class C05_ClassLevelVariableKullanimi {
    // Asagidaki kod calistiginda konsolda ne yazdirir ?


    public static void main(String[] args) {

        System.out.println(C04_Depo.sayiS); // 1
        //System.out.println(C04_Depo.sayiI); // Non-static field 'sayiI' cannot be referenced from a static context

        C04_Depo obj1 = new C04_Depo();

        System.out.println(obj1.sayiI); // 100
        System.out.println(obj1.sayiS); // 1
        // Static member 'sayiS' accessed via instance reference

        obj1.sayiI++;
        obj1.sayiS++;


        C04_Depo obj2 = new C04_Depo();
        obj2.sayiI++;
        obj2.sayiS++;

        System.out.println(obj1.sayiI);//101
        System.out.println(obj1.sayiS);//3
        System.out.println(obj2.sayiI);//101
        System.out.println(obj2.sayiS);//3
        System.out.println(C04_Depo.sayiS);//3
        //System.out.println(C04_Depo.sayiI);//Non-static field 'sayiI' cannot be referenced from a static context



        C04_Depo obj3 = new C04_Depo();
        obj3.sayiI++;
        obj3.sayiS++;

        System.out.println(obj1.sayiI);// 101
        System.out.println(obj1.sayiS);//4
        System.out.println(obj2.sayiI);//101
        System.out.println(obj2.sayiS);//4
        System.out.println(obj3.sayiI);//101
        System.out.println(obj3.sayiS);//4
        System.out.println(C04_Depo.sayiS); //4
        //System.out.println(C04_Depo.sayiI);

    }
}
