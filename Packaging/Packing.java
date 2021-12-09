package Packaging;
/**
 * Class Packing jika tidak terjadi perhitungan jumlah
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class Packing implements PackingBuah {

    /**
     * Method packing pada PackingBuah akan di override untuk menampilkan
     * informasi packing
     */
    @Override
    public String packing(){
        return "Pengiriman : Pesanan akan dipacking ";
    }
}
