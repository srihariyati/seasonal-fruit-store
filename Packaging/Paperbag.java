package Packaging;
/**
 * Class Paperbag merupakan salah satu jenis packaging
 * yang digunakan untuk pengiriman buah
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class Paperbag extends PackingDecorator{
    
    /**
     * Method Constructor untuk membuat objek
     * @param packingBuah
     */
    public Paperbag(PackingBuah packingBuah)
    {
        super(packingBuah);
    }

    /**
     * Method ini digunakan untuk melakukan packaging
     */
    public String packing()
    {
        return super.packing() + this.packingWithPaperbag();
    }

    /**
     * Method ini digunakan untuk menampilkan jenis packaging yang
     * akan digunakan
     * @return jenis packaging
     */
    public String packingWithPaperbag()
    {
        return "menggunakan Paperbag";
    }
    
}
