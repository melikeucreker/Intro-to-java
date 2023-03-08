package day11_stringManipulations_forLoop;

public class C07_replaceAllOrnk {
    public static void main(String[] args) {
        String str="       j45458?*ava G6544//*uzeldir,,,,,      ";
        // Methodlarla Java Guzeldir yazdir.

        str=str.trim();
        System.out.println(str);//j45458?*ava G6544//*uzeldir,,,,,
        str=str.replaceAll("\\d","");
        System.out.println(str);//j?*ava G//*uzeldir,,,,,
        str=str.replaceAll("\\W"," " );
        System.out.println(str);//j  ava G   uzeldir
       str=str.replaceAll(" ","5");
        System.out.println(str);//j55ava5G555uzeldir55555
        str=str.replaceAll("\\d","");
        System.out.println(str);//javaGuzeldir



    }
}
