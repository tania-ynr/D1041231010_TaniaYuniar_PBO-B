public class ArrayNilai {
    public static void main (String [] args){
        System.out.println("=== DAFTAR NILAI===");

        //Membuat array berisi 5 nilai integer
        int[] nilai = {85, 90, 78, 92, 88};

        //perulangan untuk menampilkan setiap elemen di dalam array
           for (int i = 0; i < nilai.length; i++) {

            //menampilkan nilai ke
           System.out.println("Nilai " + (i+1) + ": " + nilai[i]);
           }
           
           //menampilkan total nnilai
           System.out.println("Total Nilai: " + nilai.length);
    }
    
}
