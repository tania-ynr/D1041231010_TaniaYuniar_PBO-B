public class JaggedArray {
    public static void main (String [] args){
        System.out.println ("=== JAGGED ARRAY ===");
        // 1. Deklarasi dan inisialisasi jagged array
        int[][] jagged = {
        {10, 20}, // Baris 0: 2 elemen
        {30, 40, 50, 60}, // Baris 1: 4 elemen
        {70, 80, 90}, // Baris 2: 3 elemen
};
for (int i=0; i< jagged.length; i++){
    System.out.print("Baris " + i +"(" + jagged[i].length + " elemen):");

    for(int j=0;j< jagged[i].length;j++){
        System.out.print(jagged[i][j] + " ");
    }
    System.out.println();
    }
  }
}