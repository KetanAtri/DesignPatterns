package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.objects.LuxurySUV;
import creationalDesignPatterns.abstractFactory.objects.LuxurySedan;
import creationalDesignPatterns.abstractFactory.objects.SUV;
import creationalDesignPatterns.abstractFactory.objects.Sedan;

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
