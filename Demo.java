import Notify.*;
import Packaging.*;
import Seasonal.*;
import java.util.Scanner;
/**
 * Class Demo digunakan untuk menjalankan program
 * 
 * @author Sri Hariyati
 * @version 1.0
 */

public class Demo {
    private static Scanner scanner;
    public static void main(String[] args)  throws InterruptedException {
        //deklrasi variabel harga
        float harga = 0;

        //Membuat objek baru untuk jenis buah
        Desember des = new Desember();
        Januari jan = new Januari();
        Februari feb = new Februari();

        //Membuat objek baru untuk packaging
        PackingBuah pack1 = new Paperbag(new Packing());
        PackingBuah pack2 = new KotakKayu(new Packing());
        
        // deklarasi scanner untuk input
        scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Seasonal Fruit Store");
        System.out.println("======================================");

        //input nama pembeli
        System.out.print("Masukkan Nama kamu : ");
        String namaString = scanner.nextLine();

        //input jenis bulan
        System.out.print("Masukkan musim (Desember - Februari) : ");
        String seasonString = scanner.nextLine();

        //menampilkan daftar buah
        System.out.println("\n Berikut buah yang tesedia selama bulan "+seasonString);

        if ("Desember".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            //menampilkan jenis buah Desember
            des.showBuah();
        }else if("Januari".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            //menampilkan jenis buah januari
            jan.showBuah();   
        }else if("Februari".equalsIgnoreCase(seasonString)){
            System.out.print("\n");
            //menampilkan jenis buah februari
            feb.showBuah();
        }else{
            System.out.println("-");
            System.out.println("Bulan yang kamu masukkan tidak tersedia");
            System.exit(0);
        }

        //input nama buah yang ingin dibeli
        System.out.print("Pilih buah yang ingin kamu beli : ");
        String buahString = scanner.nextLine();

        //input berat buah yang ingin beli
        System.out.print("Masukkan jumlah buah " +buahString +" yang ingin kamu beli (/kg) : ");
        int kiloString = scanner.nextInt();       

        //menampilkan harga buah berdasarkan jenis bulan yang dipilih
        if ("Desember".equalsIgnoreCase(seasonString)){
            harga = kiloString *12000;
        } else if("Januari".equalsIgnoreCase(seasonString)){
            harga = kiloString *10000;  
        }else if("Februari".equalsIgnoreCase(seasonString)){
            harga = kiloString*8000;
        }

        //konfirmasi pembelian
        System.out.print("Apakah kamu ingin membeli "+buahString+" sebanyak "+kiloString+" Kg dengan harga"+" Rp." + String.format("%.0f",harga)+" (y/n) ?");
        String konfirString = scanner.next();
       
        //tahap pembelian
        if(("y".equalsIgnoreCase(konfirString))||("ya".equalsIgnoreCase(konfirString))){
            System.out.println(" ");

            // membuat ibjek untuk pembeli dan pesanan
            Pesanan pesanan = new Pesanan(buahString);
            Pembeli pembeli = new Pembeli(namaString);

            //menampilkan jenis packaging berdasrkan jumlah pembelian
            if (kiloString <=2){
                System.out.println(pack1.packing());
             }
             else if(kiloString >2){
                 System.out.println(pack2.packing());
             }

             //menampilkan notifikasi
             pesanan.tambahPembeli(pembeli);

             //memberikan jeda waktu running
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
