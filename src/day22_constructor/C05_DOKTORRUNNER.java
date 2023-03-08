package day22_constructor;

public class C05_DOKTORRUNNER {
    public static void main(String[] args) {



    C04_DOKTOR doktor1=new C04_DOKTOR();
    doktor1.isim="mira";
    doktor1.yas=30;

    C04_DOKTOR doktor2=new C04_DOKTOR();


    C04_DOKTOR doktor3=new C04_DOKTOR();
        //System.out.println(doktor3.yas);
        //Constructor calismadanm bir obj olusturulup dgr atanmasi mumkun dgildir.
        System.out.println("variable'a atanmayan obje icin yas: "+ new C04_DOKTOR().yas);




}
}