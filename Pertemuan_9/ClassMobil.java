//clas yang menyimpan data mobil dan menjalankan methodnya
class Mobil {
    //atribut objeknya
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;
    //method
    void tampilkanInfo() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println();
    }
    //method percepat
    void percepat() {
        kecepatan += 20;
        System.out.println("Mobil dipercepat...");
    }
    //method untuk menampilkan kecepatan
    void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }
}

public class ClassMobil {

    public static void main(String[] args) {
        //membuat objek
        Mobil m1 = new Mobil();
        //mengisi nilai atribut
        m1.merk = "Toyota Avanza";
        m1.warna = "Silver";
        m1.tahun = 2020;
        //menampilkan spesifikasi mobil
        m1.tampilkanInfo();
        //mempercepat mobil sebanyak 2kali
        m1.percepat();
        m1.percepat();
        //menampilkan kecepatan mobil
        m1.tampilkanKecepatan();
    }
}