package Packaging;

public abstract class PackingDecorator implements PackingBuah{
    private PackingBuah packingBuah;

    public PackingDecorator(PackingBuah packingBuah)
    {
        this.packingBuah = packingBuah;
    }

    @Override
    public String packing()
    {
        return packingBuah.packing();
    }
    
}
