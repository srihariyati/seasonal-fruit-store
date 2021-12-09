package Seasonal;
/**
 * CLasas BuahJan yang mengimplements JenisBuah akan berisi
 * daftar buah yang ada pada bulan Januari
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class BuahJan implements JenisBuah {

     /** Mengoverride method interface jenis buah 
     * untuk menampilkan daftar buah yang ada hanya pada bulan Januari
      */
    @Override
    public void buah(){
        System.out.println("- Rambutan");
        System.out.println("- Alpukat");
        System.out.println("- Manggis");
    }
}
