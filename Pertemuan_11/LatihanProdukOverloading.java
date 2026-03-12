class Produk{
    //atribut
    String namaProduk;
    int harga;
    int stok;
    
    //constructor 1:nama produk dan harga saja
    public Produk(String namaProduk,int harga){
        this.namaProduk  = namaProduk;
        this.harga = harga;
        stok = 0 ;

    }
    //contructor 2: merk saja
    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public void tampilkanData(){
        System.out.println("===INFORMASI PRODUK===");
        System.out.println("Nama Produk  :" + namaProduk);
        System.out.println("harga        :Rp " + harga);
        System.out.println("stok         :" + stok);
        System.out.println();

    }
}

public class LatihanProdukOverloading {
    
    public static void main(String[] args) {
        Produk pd1= new Produk("Laptop Asus",8500000);
        pd1.tampilkanData();

        Produk pd2 = new Produk("Mouse Logitech" ,250000 ,50 );
        pd2.tampilkanData();

        
    }
}

























