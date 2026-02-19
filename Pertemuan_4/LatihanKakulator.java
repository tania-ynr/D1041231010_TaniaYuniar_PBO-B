public class LatihanKakulator {
    public static void main (String [ ] args) {
        //variabelkan angka
       int angka1 = 25;
       int angka2 = 4;
       
       //menghitung 
       int penjumlahan = angka1 + angka2;
       int pengurangan = angka1 - angka2;
       int perkalian = angka1 * angka2;
       int pembagian = angka1 / angka2;
       int sisabagi = angka1 % angka2;
        //hitung pembagian hasil desimal
       double pembagianDesimal = (double) angka1 / angka2;

       System.out.println ("=== KALKULATOR===");
       System.out.println ("angka1 :" + angka1 );
       System.out.println ("angka2 :" + angka2);
       System.out.println ("---------------------");
       
       System.out.println ("penjumlahan : "+penjumlahan);
       System.out.println ("pengurangan : "+pengurangan);
       System.out.println ("perkalian : "+perkalian);
       System.out.println ("pembagian : "+pembagian);
       System.out.println ("sisabagi : "+sisabagi);
       System.out.println("Pembagian Desimal : " +pembagianDesimal);


    }
    
}
