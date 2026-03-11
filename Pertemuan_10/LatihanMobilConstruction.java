class Mobil {

    // Menyimpan informasi dasar tentang mobil
    String merk;
    String warna;
    int tahun;

    // Constructor default
    public Mobil(){
        merk = "Belum diisi";
        warna= "Belum diisi";
        tahun= 0;
        System.out.println("Object Mobil dibuat (default)");
    }

    // Constructor dengan parameter
    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        System.out.println("Object Mobil dibuat: " + this.merk);
    }

    // Method untuk menampilkan data mobil
    public void tampilkanData() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk       : " + merk);
        System.out.println("Warna      : " + warna);
        System.out.println("Tahun      : " + tahun);
        System.out.println();
    }
}

// Class utama untuk menjalankan program
public class LatihanMobilConstruction {

    public static void main(String[] args) {

        // Membuat objek mobil dengan constructor default
        Mobil mb1 = new Mobil();
        mb1.tampilkanData();

        // Membuat objek mobil dengan constructor berparameter
        Mobil mb2 = new Mobil("Toyota","Belum diisi",0);
        mb2.tampilkanData();

        Mobil mb3 = new Mobil("Honda Civic","Merah",2023);
        mb3.tampilkanData();
    }
}