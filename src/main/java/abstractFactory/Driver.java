package abstractFactory;

import abstractFactory.factories.FleetFactory;
import abstractFactory.factories.LuxuryFleetFactory;
import abstractFactory.factories.NormieFleetFactory;
import abstractFactory.objects.SUV;
import abstractFactory.objects.Sedan;

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
