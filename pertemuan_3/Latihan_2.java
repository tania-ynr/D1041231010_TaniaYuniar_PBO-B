public class Latihan_2 {
   public static void main(String[ ] args) {
    //menyimpan variabel saldo awal di rekening
    int saldo     = 1000000;
    //jumlah uang yang di setor
    int setoran   = 500000;
    //uang yg ditarik
    int penarikan = 250000;
    
    //judul
    System.out.println("=== SIMULASI TRANSAKSI BANK===");
    // saldo awal sebelum transaksi
    System.out.println("Saldo awal          :"+ saldo);
    // menambah uang ke saldo
    //saldo lama + setoran = saldo baru
    saldo = saldo + setoran;
    
    //menampilkan jumlah uang yg disetor
    System.out.println("Setoran             :"+   setoran);
    //menampilkan saldo setelah dilakukan setoran
    System.out.println("Saldo Setelah Setor :"+ saldo);
    //mengurangi saldo karena ada penarikan
    saldo = saldo - penarikan;

    //menampilkan jumlah uang yang ditarik
    System.out.println("Penarikan           :"+ penarikan);
    //menampilkan saldo terakhir
    System.out.println("Saldo Akhir         :"+saldo);
   } 
    
}
