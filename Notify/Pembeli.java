package Notify;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Class ini merupakan class yang mengimplementasi interface Observer
 * dimana class ini akan menginisialisasi waktu pengiriman, nama pembeli dan notifikasi pengiriman
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class Pembeli implements Observer {

    //Atribut nama pembeli
    private final String user;

    /**
     * Method constructor yang akan menginisialisasi nama pembeli
     * @param user
     */
    public Pembeli(String user)
    {
        this.user = user;
    }

    /**
     * Method untuk menampilkan notifikasi kepada pembeli
     * yang berisikan informasi tanggal dan waktu, nama pembeli,
     * beserta notifikasi yang ingin disampaikan
     * @param notif
     */
    @Override
    public void dapatNotifikasi(String notif)
    {
        Date now = new Date();
        String format2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss").format(now);
        System.out.println(format2 + " | Halo "+ user + ", " +notif+ "\n");
    }

    /**
     * Method untuk menampilkan nama pembeli
     * @return user
     */
    public String getUser()
    {
        return user;
    }
}
