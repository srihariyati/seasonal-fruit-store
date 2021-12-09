package Notify;
import java.util.ArrayList;

/**
 * Class Pesanan merupakan class yang mengimplementasi interface Subject
 * dimana subject dapat menambahkan pembeli dan mengirimkan notifikasi kepada para observer
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Pesanan implements Subject 
{
    //Atribut nama buah
    private String namaBuah;

    // Menyimpan pembeli(observer) kedalam sebuah Arraylist
    ArrayList <Pembeli> costumer = new ArrayList<>();

    /**
     * Method constructor
     * @param namaBuah nama buah yang dibeli oleh observer
     */
    public Pesanan(String namaBuah)
    {
        this.namaBuah = namaBuah;
    }

    /**
     * Method untuk menambahkan observer kedalam arraylist
     * @param pembeli pembeli yang akan ditambahkan kedalam arraylist
     */
    @Override
    public void tambahPembeli(Pembeli pembeli)
    {
        costumer.add(pembeli);
    }

    /**
     * Mehod untuk mengirimkan notifikasi kepada observer 
     * yang berisikan informasi nama buah yang dibeli dan notifikasi
     * @param notif 
     */
    @Override
    public void beriNotifikasi(String notif)
    {
        String buatNotif = String.format(namaBuah + " " + notif );

        for(Pembeli pembeli : costumer)
        {
            pembeli.dapatNotifikasi(buatNotif);
        }
    }

}
