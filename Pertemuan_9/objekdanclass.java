class Mobil {

    // Menyimpan informasi dasar tentang mobil
    String merk;        
    String warna;       
    int tahun;        
    int kecepatan;     

    // Method percepat()
    // Berfungsi untuk menambah kecepatan mobil
    public void percepat() {
        kecepatan += 10; // setiap dipanggil, kecepatan bertambah 10
        System.out.println("Mobil dipercepat.");
        System.out.println("Kecepatan sekarang: " + kecepatan + " km/jam");
    }

    // Method tampilkanInfo()
    // Berfungsi untuk menampilkan seluruh data mobil
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mobil ===");
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Tahun     : " + tahun);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
    // MAIN METHOD (untuk uji coba)
    public static void main(String[] args) {

        // Membuat objek dari class Mobil
        Mobil mobil1 = new Mobil();

        // Mengisi nilai atribut
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahun = 2022;
        mobil1.kecepatan = 0;

        // Menampilkan data awal mobil
        mobil1.tampilkanInfo();

        // Memanggil method percepat()
        mobil1.percepat();
        mobil1.percepat();
    }
}


