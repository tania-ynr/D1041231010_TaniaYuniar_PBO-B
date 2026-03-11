class Persegi {

    // Menyimpan informasi dasar tentang buku
    int sisi;
    int luas;
    int keliling;

    // Constructor dengan parameter
    public Persegi(int sisi){
        //mengecek apakah sisi <=0
       if (sisi <= 0){
        System.out.println("ERROR:sisi tidak boleh <= 0.Diset ke default(1).");
        this.sisi = 1;
       }
       else {
        this.sisi = sisi;
       }
       //menghitung luas dan keliling
       this.luas = this.sisi * this.sisi;
       this.keliling = 4* this.sisi;
    }

    // Method untuk menampilkan data 
    public void tampilkanData() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi      : " + sisi+"cm");
        System.out.println("Luas      : " + luas+"cm2");
        System.out.println("Keliling  : " +keliling+"cm");
        System.out.println();
    }
}

// Class utama untuk menjalankan program
public class LatihanPersegiCostruktion {

    public static void main(String[] args) {

        // Object dengan sisi valid
        Persegi p1 = new Persegi(5);
        p1.tampilkanData();

        // object dengan sisi valid
        Persegi p2 = new Persegi(-3);
        p2.tampilkanData();
    }
}
