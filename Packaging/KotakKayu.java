package Packaging;

public class KotakKayu extends PackingDecorator {
    public KotakKayu(PackingBuah packingBuah)
    {
        super(packingBuah);
    }

    public String packing()
    {
        return super.packing() + this.packingWithKotakKayu();
    }

    public String packingWithKotakKayu()
    {
        return "di packing menggunakan Kotak Kayu";
    }
    
}
