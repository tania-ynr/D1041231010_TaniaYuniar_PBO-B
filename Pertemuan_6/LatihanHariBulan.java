public class LatihanHariBulan {

    public static void main(String[] args) {

        int month = 4; // Ganti angka ini untuk mencoba bulan lain bisa 5,6,7
        String namaBulan = "";
        int jumlahHari = 0;

        switch (month) {

            // Bulan dengan 31 hari
            case 1:
                namaBulan = "Januari";
                jumlahHari = 31;
                break;
            case 3:
                namaBulan = "Maret";
                jumlahHari = 31;
                break;
            case 5:
                namaBulan = "Mei";
                jumlahHari = 31;
                break;
            case 7:
                namaBulan = "Juli";
                jumlahHari = 31;
                break;
            case 8:
                namaBulan = "Agustus";
                jumlahHari = 31;
                break;
            case 10:
                namaBulan = "Oktober";
                jumlahHari = 31;
                break;
            case 12:
                namaBulan = "Desember";
                jumlahHari = 31;
                break;

            // Bulan dengan 30 hari (menggunakan fall through)
            case 4:
                namaBulan = "April";
            case 6:
                if (month == 6) namaBulan = "Juni";
            case 9:
                if (month == 9) namaBulan = "September";
            case 11:
                if (month == 11) namaBulan = "November";
                jumlahHari = 30;
                break;

            // Februari
            case 2:
                namaBulan = "Februari";
                jumlahHari = 28; // Abaikan tahun kabisat
                break;

            default:
                System.out.println("Bulan tidak valid!");
                return;
        }

        // Output
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");
        System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + jumlahHari + " hari");
    }
}