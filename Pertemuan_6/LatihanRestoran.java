public class LatihanRestoran {

    public static void main(String[] args) {

        // Variabel untuk menyimpan kode menu yang dipilih
        int menuCode = 1;   

        // Variabel untuk menyimpan jumlah pesanan
        int quantity = 2;   

        // Variabel untuk menyimpan nama menu yang dipilih
        String namaMenu = "";

        // Variabel untuk menyimpan harga satuan menu
        int harga = 0;

        // Variabel untuk menyimpan total pembayaran
        int total;

        // Struktur percabangan untuk menentukan menu berdasarkan kode
        switch (menuCode) {

            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;

            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;

            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                break;

            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;

            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                break;

            // Jika kode menu tidak tersedia
            default:
                System.out.println("Kode menu tidak valid!");
                return; // Menghentikan program jika kode salah
        }

        // Menghitung total harga (harga satuan x jumlah)
        total = harga * quantity;

        // Menampilkan hasil output
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();

        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + total);
    }
}