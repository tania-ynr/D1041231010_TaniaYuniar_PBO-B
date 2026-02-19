public class LatihanCounter {
    public static void main (String [ ] args){

        int counter = 10;

        System.out.println("=== COUNTER ===");
        System.out.println ("Nilai awal : " + counter);
        // ++ nya ada 2x
        counter ++;
        counter ++;
        System.out.println("Setelah ++ (2x):"+ counter);

        //decremen 1x
        counter --;
        System.out.println("setelah --:" + counter);

        //tambah 5
        counter += 5;
        System.out.println  ("setelah += 5: "+ counter);

        //kurangi 3
        counter -= 3;
        System.out.println ("setelah -= 3 :"+ counter);

        //kalikan 2
        counter *= 2;
        System.out.println ("setelah *= 2 :"+ counter);

    }
    
}
