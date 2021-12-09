package Packaging;
/**
 * Class KotakKayu merupakan salah satu jenis packaging 
 * yang digunakan untuk pengiriman buah
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class KotakKayu extends PackingDecorator {

    /**
     * Method Constructor untuk membuat objek
     * @param packingBuah
     */
    public KotakKayu(PackingBuah packingBuah)
    {
        super(packingBuah);
    }

    /**
     * Method ini digunakan untuk melakukan packaging
     */
    public String packing()
    {
        return super.packing() + this.packingWithKotakKayu();
    }

    /**
     * Method ini digunakan untuk menampilkan jenis packaging yang
     * akan digunakan
     * @return jenis packaging
     */
    public String packingWithKotakKayu()
    {
        return "menggunakan Kotak Kayu";
    }
    
}
