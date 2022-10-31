package creationalDesignPatterns.abstractFactory;

import creationalDesignPatterns.abstractFactory.factories.FleetFactory;
import creationalDesignPatterns.abstractFactory.factories.LuxuryFleetFactory;
import creationalDesignPatterns.abstractFactory.factories.NormieFleetFactory;
import creationalDesignPatterns.abstractFactory.objects.SUV;
import creationalDesignPatterns.abstractFactory.objects.Sedan;

public class Driver
{
    private static void testAbstractFactory()
    {
        FleetFactory fleetFactory = new LuxuryFleetFactory();
        Sedan sedan = fleetFactory.createSedan();
        SUV suv = fleetFactory.createSUV();
        sedan.pairWith(suv);

        fleetFactory = new NormieFleetFactory();
        sedan = fleetFactory.createSedan();
        suv = fleetFactory.createSUV();
        sedan.pairWith(suv);
    }

    public static void main(String[] args)
    {
        testAbstractFactory();
    }
}
