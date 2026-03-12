class PersegiPanjang {

    // Atribut
    int panjang;
    int lebar;
    int luas;
    int keliling;

    // Constructor 1 : Persegi
    public PersegiPanjang(int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Constructor 2 : Persegi Panjang
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    // Method menampilkan informasi
    public void tampilkanInfo() {

        if (panjang == lebar) {
            System.out.println("=== PERSEGI ===");
        } else {
            System.out.println("=== PERSEGI PANJANG ===");
        }

        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiOverloading {

    public static void main(String[] args) {

        // Object persegi
        PersegiPanjang p1 = new PersegiPanjang(5);
        p1.tampilkanInfo();

        // Object persegi panjang
        PersegiPanjang p2 = new PersegiPanjang(8, 4);
        p2.tampilkanInfo();
    }
}