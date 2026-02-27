public class LatihanDeretGanjil {
    public static void main(String[] args) {
        
        // Menampilkan judul
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        
        // Variabel angka dimulai dari 1
        int angka = 1;
        
        // Perulangan while selama angka <= 15
        while (angka <= 15) {
            
            // Mengecek apakah angka ganjil
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
            }
            
            // Menambah nilai angka setiap iterasi
            angka++;
        }
    }
}