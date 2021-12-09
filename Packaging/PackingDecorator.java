package Packaging;
/**
 * Abstrack Class PackingDecorator digunakan untuk
 * menginisiasi cara packing terhadap pesanan
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public abstract class PackingDecorator implements PackingBuah{
    
    // Objek PackingBuah
    private PackingBuah packingBuah;

    /**
     * Method Constructor untuk membuat objek PackingBuah
     * @param packingBuah
     */
    public PackingDecorator(PackingBuah packingBuah)
    {
        this.packingBuah = packingBuah;
    }

    /**
     * Mengoverride method packing untuk jenis packing
     */
    @Override
    public String packing()
    {
        return packingBuah.packing();
    }
    
}
