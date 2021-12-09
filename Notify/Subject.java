package Notify;

/**
 * Interface Subject ini akan berisi method method terkait hal yang
 * dapat dilakukan oleh obserable(pesanan)
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public interface Subject {

    /**
     * Method untuk memberikan notifikasi
     * @param notif
     */
    public void beriNotifikasi(String notif);

    /**
     * Method untuk menambahkan pembeli
     * @param pembeli
     */
    public void tambahPembeli(Pembeli pembeli);
}
