package day10_stringmanipulation;

public class C05_indexof {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("c"));//5
        System.out.println(str.indexOf("a"));//1
        //birden fazla ise ilk buldugnu verir.
        System.out.println("cok");//5
        System.out.println(str.indexOf("cok",6));//13
        System.out.println(str.indexOf("cok",5));//5

        System.out.println(str.indexOf("java"));// -1 aranan string yoksa -1 döner

        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle="yasasin java,iyi ki java ögreniyorum.";
        String kelime="yasasin";

        if (cumle.indexOf(kelime) == (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else {
            int kelimeIlkIndex= cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            }else {
                int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                }else{
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }

        }

    }
}