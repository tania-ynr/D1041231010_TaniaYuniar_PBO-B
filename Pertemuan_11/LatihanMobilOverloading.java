class mobil{
    //atribut
    String merk;
    String warna;
    int tahun;
    
    //constructor 1:tanpa parameter
    public mobil(){
        merk  = "Unknown";
        warna = "Unknown";
        tahun = 0 ;

    }
    //contructor 2: merk saja
    public mobil(String merk){
        this.merk = merk;
        warna= "Unknown";
        tahun = 0;
    }
    //contructor 3: semua atribut
    public mobil(String merk,String warna,int tahun){
        this.merk = merk;
        this.warna= warna;
        this.tahun = tahun;
    }
    public void tampilkanData(){
        System.out.println("===SPESIFIKASI MOBIL===");
        System.out.println("Merk  :" + merk);
        System.out.println("Warna :" + warna);
        System.out.println("Tahun :" + tahun);
        System.out.println();

    }
}

public class LatihanMobilOverloading{
    public static void main(String[] args) {
        mobil mb1= new mobil();
        mb1.tampilkanData();

        mobil mb2 = new mobil("toyota");
        mb2.tampilkanData();

        mobil mb3 = new mobil("Honda Civic","merah",2023);
        mb3.tampilkanData();
    }
}

