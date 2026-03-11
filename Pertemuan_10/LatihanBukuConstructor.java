class Buku {

    // Menyimpan informasi dasar tentang buku
    String judul;
    String pengarang;
    int harga;

    // Constructor default
    public Buku(){
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
        System.out.println("Object buku dibuat (default)");
    }

    // Constructor dengan parameter
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
        System.out.println("Object buku dibuat: " + this.judul);
    }

    // Method untuk menampilkan data buku
    public void tampilkanData() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga       : Rp " + harga);
        System.out.println();
    }
}

// Class utama untuk menjalankan program
public class LatihanBukuConstructor {

    public static void main(String[] args) {

        // Membuat objek buku dengan constructor default
        Buku bk1 = new Buku();
        bk1.tampilkanData();

        // Membuat objek buku dengan constructor berparameter
        Buku bk2 = new Buku("Pemrograman Java","Budi Raharjo",125000);
        bk2.tampilkanData();

        Buku bk3 = new Buku("Algoritma dan Struktur Data","Rinaldi Munir",150000);
        bk3.tampilkanData();
    }
}