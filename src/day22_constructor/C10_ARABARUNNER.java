package day22_constructor;

public class C10_ARABARUNNER {
    public static void main(String[] args) {



    C06_ARABA araba1= new C06_ARABA();
    araba1.marka="Toyota";
    araba1.model="corolla";
    araba1.hasarliMI=false;
    araba1.yil=2017;
    araba1.fiyat=5520;

        System.out.println("Marka: " +araba1.marka+"Model"+araba1.model);

        System.out.println(araba1);

            C06_ARABA araba2= new C06_ARABA("Honda","Jazz",true,2010,3000);
        System.out.println(araba2);

        C06_ARABA araba3= new C06_ARABA("WV","Jetta,",false,2012,7200);
        System.out.println(araba3);


    }
}
