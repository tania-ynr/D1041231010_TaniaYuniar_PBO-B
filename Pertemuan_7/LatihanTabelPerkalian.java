public class LatihanTabelPerkalian {
    public static void main (String [] args){
        System.out.println("=== TABEL PERKALIAN 7 ===");
        //variabel yang mau dihitung adalah 7
        int angka = 7;
        //for loop sebanyak 12 kali
        for (int i = 1; i <= 12; i++) {
        
        int hasil = angka * i;
        //garis pemisah untuk keterbacaan
        System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
    
}
