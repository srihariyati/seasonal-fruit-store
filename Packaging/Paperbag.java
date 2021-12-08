package Packaging;

public class Paperbag extends PackingDecorator{
    
    public Paperbag(PackingBuah packingBuah)
    {
        super(packingBuah);
    }

    public String packing()
    {
        return super.packing() + this.packingWithPaperbag();
    }

    public String packingWithPaperbag()
    {
        return "di packing menggunakan Paperbag";
    }
    
}
