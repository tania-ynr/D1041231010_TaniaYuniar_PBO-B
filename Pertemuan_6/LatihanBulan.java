public class LatihanBulan {
    public static void main (String [] args){
        //nilai yang bisa diubah
        int month = 13;
        //menyimpan nama bulan
        String namaBulan;
        //menggunakan switch statement untuk konversi
        switch (month) {
            case 1:
                namaBulan = "januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "July";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan ="Angka bulan tidak valid (1 - 12)";
        }
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println(" Angka Bulan : " + month);
        System.out.println(" Nama Bulan  : " + namaBulan);
    }
}
