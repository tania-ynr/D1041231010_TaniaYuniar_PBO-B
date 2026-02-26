public class latihanbilangan {
    public static void main(String[] args) {
        //variabel yang bisa diubah nilainya
        int number = 12;

        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: " + number);
        
        //mengecek apakah bilangan positif
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");

            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        //mengecek bilangan negatif
        } else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");

            if (number % 2 == 0) {
                System.out.println("Tipe: Genap");
            } else {
                System.out.println("Tipe: Ganjil");
            }
        //mengecek bilangan nol
        } else {
            System.out.println("Jenis: Bilangan nol");
        }
    }
}

    
    

