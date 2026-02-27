public class LatihanRefleksi {
    public static void main (String [] args){
    //menggunakan while
    System.out.println("===MENGGUNAKAN WHILE===");
    int counter = 1;
    while (counter <= 5) {
    System.out.print(counter + " ");
    counter++;
    }
    System.out.println();

    //menggunakan DO-WHILE
    System.out.println ("===MENGGUNAKAN DO-WHILE===");
    int angkaDoWhile =1;
    do{
       System.out.print(angkaDoWhile + " ");
       angkaDoWhile ++;
    } while (angkaDoWhile <= 5);
    System.out.print("\n");

    //Menggunakan FOR
    System.out.println("===MENGGUNAKAN FOR===");
    for(int angkaFor = 1; angkaFor <=5; angkaFor++){
        System.out.print(angkaFor + " ");
    }
    /*Untuk menampilkan angka 1 sampai 5,
         loop FOR lebih mudah dipahami karena
         inisialisasi, kondisi, dan increment
         ditulis dalam satu baris sehingga lebih jelas dan sudah dipelajari 
         saat dasar pemograman jadi lebih enak dipakaianya tidak berbelit*/
  }
}
