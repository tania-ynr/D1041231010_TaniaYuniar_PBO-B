class Mahasiswa {
    static int jumlahMahasiswa=0;
    String nama;

public Mahasiswa(String nama){
    this.nama = nama;
    jumlahMahasiswa++;
    System.out.println("Mahasiswa dibuat: " + nama);
}
public static int getjumlah(){
    return jumlahMahasiswa;
}

}
public class LatihanMahasiswaStatic {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa ("Andi");
        Mahasiswa m2 = new Mahasiswa ("Budi");
        Mahasiswa m3 = new Mahasiswa ("Citra");
    
        System.out.println("Total Mahasiswa: "+ Mahasiswa.getjumlah());
    }
}

