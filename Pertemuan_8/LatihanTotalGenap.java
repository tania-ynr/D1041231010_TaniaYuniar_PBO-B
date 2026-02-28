public class LatihanTotalGenap {
    public static void main (String [] args){
        System.out.println("===TOTAL BILANGAN GENAP===");
        int Total = 0;

        for(int angka = 1; angka <= 20 ; angka++){
            if (angka % 2 != 0){
                continue;
            }
            Total = Total + angka;
            System.out.println("Tambah: " + angka + " -> Total: " + Total);
            
        }
            System.out.println("---");
            System.out.println("Total akhir :"+ Total);
        
    }
    
}
