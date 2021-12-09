package Seasonal;
/**
 * Class Februari akan dapat mengatur jenis buah yang muncul 
 * pada bulan Februari
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class Februari extends Season{

    /**
     * Method untuk mengatur jenis buah 
     */
    public Februari(){
        setBuahType(new BuahFeb());
    }
}
