import Notify.*;
import Packaging.*;
import Seasonal.*;
import java.util.Scanner;


public class Demo {
    private static Scanner scanner;
    public static void main(String[] args)  throws InterruptedException {
        Desember des = new Desember();
        Januari jan = new Januari();
        Februari feb = new Februari();
        PackingBuah pack1 = new Paperbag(new Packing());
        PackingBuah pack2 = new KotakKayu(new Packing());
        float harga = 0;
        scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Seasonal Fruit Store");
        System.out.println("======================================");

        System.out.print("Masukkan Nama kamu : ");
        String namaString = scanner.nextLine();

        System.out.print("Masukkan musim (Desember - Februari) : ");
        String seasonString = scanner.nextLine();

        System.out.println("\n Berikut buah yang tesedia selama bulan "+seasonString);

        if ("Desember".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            des.showBuah();
        }else if("Januari".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            jan.showBuah();   
        }else if("Februari".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            feb.showBuah();
        }else{
            System.out.println("-");
            System.out.println("Bulan yang kamu masukkan tidak tersedia");
            System.exit(0);
        }

        System.out.print("Pilih buah yang ingin kamu beli : ");
        String buahString = scanner.nextLine();

        System.out.print("Masukkan jumlah buah " +buahString +" yang ingin kamu beli (/kg) : ");
        int kiloString = scanner.nextInt();       

        if ("Desember".equalsIgnoreCase(seasonString)){
            harga = kiloString *12000;
        } else if("Januari".equalsIgnoreCase(seasonString)){
           harga = kiloString *10000;  
        }else if("Februari".equalsIgnoreCase(seasonString)){
            harga = kiloString*8000;
        }

        System.out.print("Apakah kamu ingin membeli "+buahString+" sebanyak "+kiloString+" Kg dengan harga"+" Rp." + String.format("%.0f",harga)+" (y/n) ?");
        String konfirString = scanner.next();
       

        if(("y".equalsIgnoreCase(konfirString))||("ya".equalsIgnoreCase(konfirString))){
            System.out.println(" ");
            Pesanan pesanan = new Pesanan(buahString);
            Pembeli pembeli = new Pembeli(namaString);

            if (kiloString <=2){
                System.out.println(pack1.packing());
             }
             else if(kiloString >2){
                 System.out.println(pack2.packing());
             }

             pesanan.tambahPembeli(pembeli);
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu sedang diproses");
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu sedang dikemas");
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu sedang menuju ke alamat kamu");
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu sudah tiba di kota kamu"); 
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu sedang diantarkan ke rumah kamu"); 
             Thread.sleep(1000);
             pesanan.beriNotifikasi("pesanan kamu selesai"); 
        }else{
            System.exit(0);
        }      
    }
}
