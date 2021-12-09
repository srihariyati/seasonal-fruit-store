package Seasonal;
/**
 * Class Januari akan dapat mengatur jenis buah yang muncul 
 * pada bulan januari
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Januari extends Season{
    
    /**
     * Method untuk mengatur jenis buah 
     */
    public Januari(){
        setBuahType(new BuahJan());
    }
}
