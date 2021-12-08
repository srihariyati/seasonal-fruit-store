package Notify;
import java.util.ArrayList;

public class Pesanan implements Subject 
{

    private String namaBuah;
    ArrayList <Pembeli> costumer = new ArrayList<>();

    public Pesanan(String namaBuah)
    {
        this.namaBuah = namaBuah;
    }

    @Override
    public void tambahPembeli(Pembeli pembeli)
    {
        costumer.add(pembeli);
    }

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
