public class Array2D {
    public static void main (String [] args){
        System.out.println("=== TABEL 3X3 ===");
        int[][] nilai = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

     // Perulangan untuk baris
        for (int i = 0; i < nilai.length; i++) {
            
            // Perulangan untuk kolom
            for (int j = 0; j < nilai[i].length; j++) {
                
                // Menampilkan angka tanpa pindah baris
                System.out.print(nilai[i][j] + " ");
            }
            
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
