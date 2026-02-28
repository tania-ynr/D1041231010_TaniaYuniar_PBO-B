public class LatihanCariKelipatan {
    public static void main (String [] args){

        System.out.println("===CARI KELIPATAN 7===");
        //perulangan dari 1 ke 50
        for (int angka = 1; angka <= 50 ; angka ++){

            //menampilkan angka yang di periksa
            System.out.println ("cek :"+ angka);

            //mengecek angka kelipatan 7
            if (angka % 7 == 0) {
                
                //jika iya tampilkan hasilnya
                System.out.println ("Kelipatan 7 pertama: "+ angka);
                //hentikan perulangan
                break;
            }
            
        }
           //setelah keluar dari loop
            System.out.println("Pencarian Selesai.");
    }
    
}
