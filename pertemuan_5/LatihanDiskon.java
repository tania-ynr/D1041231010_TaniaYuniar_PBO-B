public class LatihanDiskon {
    public static void main (String [] args){
        //total belanja pelanggan
        double totalBelanja = 750000;
        //saya pakai int agar persen tidak desimal
        int diskon = 0;
        //menyimpan potongan harga
        double jumlahdiskon;
        //menyimpan harga setelah dikurangi diskon
        double HargaAkhir;
    
        System.out.println ("===KALKULATOR DISKON===");
        //mengecek diskon Jika belanja kurang dari 100.000 maka tidak dapat diskon
        if (totalBelanja < 100000){
            diskon = 0;
        }
        //jika kurang dari 500000 dapat diskon 5%
        else if (totalBelanja <500000) {
            diskon= 5;
            
        }
        //jika kurang dari 1000000 dapat diskon 10%
        else if(totalBelanja < 1000000){
            diskon=10;
        }
        else {
            //jika belanja lebih dari 1000000 dapat diskon 15
            diskon = 15;
        }
        //menghitung jumlah uang dipotong
        jumlahdiskon = totalBelanja * diskon /100;
        //menghitung harga akhir setelah diskon
        HargaAkhir = totalBelanja - jumlahdiskon;
    
    System.out.println ("Total Belanja: Rp"+totalBelanja);
    System.out.println ("diskon (" + diskon + "%): Rp " + jumlahdiskon);
    System.out.println ("Harga Akhir : Rp"+ HargaAkhir);
    System.out.println ("Anda hemat : Rp"+ jumlahdiskon);
}
}

    

