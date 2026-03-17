// Outer class Sekolah
class Sekolah {

    // atribut untuk menyimpan nama sekolah
    String namaSekolah;

    // constructor untuk mengisi nama sekolah
    public Sekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }

    // Inner class Kelas (class di dalam class Sekolah)
    class Kelas {

        // atribut untuk menyimpan nama kelas
        String namaKelas;

        // constructor buat mengisi nama kelas
        public Kelas(String namaKelas){
            this.namaKelas = namaKelas;
        }

        // method untuk menampilkan informasi sekolah dan kelas
        public void info(){
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

// Class utama (harus sama dengan nama file LatihanClassSekolah.java)
public class LatihanClassSekolah {

    // method main sebagai tempat menjalankan program
    public static void main(String[] args) {

        // membuat object dari class Sekolah
        Sekolah sekolah1 = new Sekolah("SMA Negeri 1");

        // membuat object dari inner class Kelas
        // cara membuat inner class: objectOuter.new InnerClass()
        Sekolah.Kelas kelas1 = sekolah1.new Kelas("X-A");

        // memanggil method info() untuk menampilkan data
        kelas1.info();
    }
}