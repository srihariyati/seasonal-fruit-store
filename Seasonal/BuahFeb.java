package Seasonal;
/**
 * CLasas BuahFeb yang mengimplements JenisBuah akan berisi
 * daftar buah yang ada pada bulan Februari
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class BuahFeb implements JenisBuah {

     /** Mengoverride method interface jenis buah 
     * untuk menampilkan daftar buah yang ada hanya pada bulan Februari
      */
    @Override
    public void buah(){
        System.out.println("- Alpukat");
        System.out.println("- Manggis");
        System.out.println("- Sawo");
    }
}
