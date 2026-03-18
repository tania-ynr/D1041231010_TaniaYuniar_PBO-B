public class MethodVarArgs {

    // Method untuk menghitung rata-rata dengan varargs (jumlah parameter bebas)
    static double hitungRataRata(int... nilai) {
        
        // Jika tidak ada nilai yang dimasukkan
        if (nilai.length == 0) {
            return 0;
        }

        int total = 0;

        // Enhanced for untuk menjumlahkan semua nilai
        for (int n : nilai) {
            total += n;
        }

        // Menghitung dan mengembalikan rata-rata
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {

        // Memanggil method dengan 3 nilai
        double rata1 = hitungRataRata(70, 80, 90);
        System.out.println("Rata-rata (3 nilai): " + rata1);

        // Memanggil method dengan 5 nilai
        double rata2 = hitungRataRata(85, 90, 78, 92, 88);
        System.out.println("Rata-rata (5 nilai): " + rata2);
    }
}