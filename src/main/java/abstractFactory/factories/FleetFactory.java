package abstractFactory.factories;

import abstractFactory.objects.SUV;
import abstractFactory.objects.Sedan;

public abstract class FleetFactory
{
    public abstract SUV createSUV();

    public abstract Sedan createSedan();
}
