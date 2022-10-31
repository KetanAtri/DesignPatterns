package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.objects.SUV;
import creationalDesignPatterns.abstractFactory.objects.Sedan;

public abstract class FleetFactory
{
    public abstract SUV createSUV();

    public abstract Sedan createSedan();
}
