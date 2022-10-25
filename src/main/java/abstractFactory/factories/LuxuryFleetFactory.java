package abstractFactory.factories;

import abstractFactory.objects.LuxurySUV;
import abstractFactory.objects.LuxurySedan;
import abstractFactory.objects.SUV;
import abstractFactory.objects.Sedan;

public class LuxuryFleetFactory extends FleetFactory
{
    @Override
    public SUV createSUV()
    {
        LuxurySUV suv = new LuxurySUV();
        suv.setDrive(4);
        suv.setSupportsCrabWalk(Boolean.TRUE);
        return suv;
    }

    @Override
    public Sedan createSedan()
    {
        return new LuxurySedan(12345, "V12", "Lexus");
    }
}
