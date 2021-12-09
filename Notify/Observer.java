package Notify;
/**
 * Interface Observer berisi method terkait hal hal yang dapat dilakukan oleh observer
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public interface Observer {

    /**
     * Method menerima notifikasi
     * @param notif 
     */
 
    public void dapatNotifikasi(String notif);   
}
