package Seasonal;
/**
 * Class Season akan mengatur jenis buah dan  menampilkan jenis buah 
 * yang tersedia dalam satu bulan
 * 
 * @author Sri Hariyati
 * @version 1.0
 */
public class Season{
   private JenisBuah buahType;
   
   /**
    * Mehthod untuk setting jenis buah 
    * @param buahType
    */
    public void setBuahType(JenisBuah buahType){
    this.buahType = buahType;
    }

    /**
     * Method untuk menampilkan nama buah
     */
   public void showBuah(){
       this.buahType.buah();
   }
  
}
