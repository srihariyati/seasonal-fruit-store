package Seasonal;
public class Season
{
   private BuahBehaviour buahType;

   public void showBuah(){
       this.buahType.buah();
   }
   public void setBuahType(BuahBehaviour buahType){
       this.buahType = buahType;
   }
}
