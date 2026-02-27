public class LatihanValidasi {
    public static void main (String [] args){
    
        System.out.println ("=== VALIDASI NILAI UJIAN ===");

        int[] percobaanInput = {-10, 150, 85};

        int i=0;
        int nilai;

        do { 
            nilai = percobaanInput[i];
            System.out.println("Percobaan input: "+nilai);

            if(nilai < 0 || nilai > 100){
                System.out.println("Error: nilai harus antara 0 - 100!\n");
            }
            else {
                System.out.println ("Nilai valid:" +nilai);
            }
            i++;

        } while ((nilai<0 || nilai>100) && i < percobaanInput.length);
    }
}
