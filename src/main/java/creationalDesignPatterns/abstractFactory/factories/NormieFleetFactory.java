package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.objects.NormieSUV;
import creationalDesignPatterns.abstractFactory.objects.NormieSedan;
import creationalDesignPatterns.abstractFactory.objects.SUV;
import creationalDesignPatterns.abstractFactory.objects.Sedan;

public class NormieFleetFactory extends FleetFactory
{
    @Override
    public SUV createSUV()
    {
        NormieSUV suv = new NormieSUV();
        suv.setDrive(2);
        suv.setBrand("Mahindra");
        return suv;
    }

    @Override
    public Sedan createSedan()
    {
        return new NormieSedan(1123, "V6", 2);
    }
}
