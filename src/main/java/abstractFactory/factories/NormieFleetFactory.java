package abstractFactory.factories;

import abstractFactory.objects.NormieSUV;
import abstractFactory.objects.NormieSedan;
import abstractFactory.objects.SUV;
import abstractFactory.objects.Sedan;

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
