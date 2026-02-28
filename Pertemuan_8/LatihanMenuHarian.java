public class LatihanMenuHarian {
    public static void main(String[] args) {

        // Menampilkan judul program
        System.out.println("=== MENU MAKAN 3 HARI ===");

        // OUTER LOOP Perulangan hari dimulai dari 1 sampai 3
        for (int hari = 1; hari <= 3; hari++) {

            // Menampilkan hari ke berapa
            System.out.println("Hari " + hari + ":");

            // INNER LOOP 2 waktu
            // waktu = 1 artinya Pagi
            // waktu = 2 artinya Siang
            for (int waktu = 1; waktu <= 2; waktu++) {

                // Variabel untuk menyimpan nama waktu (Pagi/Siang)
                String keteranganWaktu = "";

                // Variabel untuk menyimpan nama menu
                String menu = "";

                // Menentukan waktu makan
                if (waktu == 1) {
                    keteranganWaktu = "Pagi";
                } else {
                    keteranganWaktu = "Siang";
                }
                // Menentukan menu berdasarkan hari & waktu

                // Jika hari ke-1
                if (hari == 1) {
                    if (waktu == 1) {
                        menu = "Nasi Goreng";
                    } else {
                        menu = "Soto Ayam";
                    }

                // Jika hari ke-2
                } else if (hari == 2) {
                    if (waktu == 1) {
                        menu = "Bubur Ayam";
                    } else {
                        menu = "Mie Goreng";
                    }

                // Jika hari ke-3
                } else if (hari == 3) {
                    if (waktu == 1) {
                        menu = "Roti Bakar";
                    } else {
                        menu = "Nasi Uduk";
                    }
                }

                // Menampilkan hasil dalam format:Pagi: NamaMenu
                System.out.println(keteranganWaktu + ": " + menu);
            }

            // Memberi jarak (baris kosong) antar hari
            System.out.println();
        }
    }
}