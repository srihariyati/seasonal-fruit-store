package Seasonal;
/**
 * CLasas BuahDes yang mengimplements JenisBuah akan berisi
 * daftar buah yang ada pada bulan Desember
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class BuahDes implements JenisBuah {

    /** Mengoverride method interface jenis buah 
     * untuk menampilkan daftar buah yang ada hanya pada bulan Desember
      */
    @Override
    public void buah(){
        System.out.println("- Durian");
        System.out.println("- Rambutan");
        System.out.println("- Alpukat");
    }
    
}
