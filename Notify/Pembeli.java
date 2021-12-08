package Notify;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pembeli implements Observer {

    private final String user;

    public Pembeli(String user)
    {
        this.user = user;
    }
    
    @Override
    public void dapatNotifikasi(String notif)
    {
        Date now = new Date();
        String format2 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss").format(now);
        System.out.println(format2 + " | Halo "+ user + ", " +notif+ "\n");
    }

    public String getUser()
    {
        return user;
    }
}
