public class ClassPersegi {
    // Atribut sesuai spesifikasi
    int sisi;
    int luas;
    int keliling;

    // Method untuk menghitung luas (sisi x sisi)
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    // Method untuk menghitung keliling (4 x sisi)
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    // Method untuk menampilkan hasil ke layar
    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + sisi + " cm");
        System.out.println("Luas     : " + luas + " cm²");
        System.out.println("Keliling : " + keliling + " cm");
    }

    public static void main(String[] args) {
        // Buat satu object Persegi
        ClassPersegi persegi = new ClassPersegi();

        // Isi atribut sisi dengan nilai 5
        persegi.sisi = 5;

        // Panggil method perhitungan
        persegi.hitungLuas();
        persegi.hitungKeliling();

        // Tampilkan hasil akhirnya
        persegi.tampilkanHasil();
    }
}