class Buku {

    // Menyimpan informasi dasar tentang mobil
    String judul;        
    String pengarang;       
    int harga;    

    // Method tampilkanInfo()
    // Berfungsi untuk menampilkan seluruh data mobil
    public void tampilkanInfo() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("judul       : " + judul);
        System.out.println("pengarang   : " + pengarang);
        System.out.println("harga       : Rp " + harga);
        System.out.println();
    }
}
    // MAIN METHOD (untuk uji coba)
    public  class ClassBuku {
         public static void main(String[] args) {
        
        // Mengisi nilai atribut
        Buku bk1 = new Buku();
        bk1.judul= "Pemograman java";
        bk1.pengarang="Budi Raharjo";
        bk1.harga = 125000;
        
        Buku bk2 = new Buku();
        bk2.judul= "Algoritma dan Struktur Data";
        bk2.pengarang="Budi Raharjo";
        bk2.harga = 150000;

        bk1.tampilkanInfo();
        bk2.tampilkanInfo();

    }
}