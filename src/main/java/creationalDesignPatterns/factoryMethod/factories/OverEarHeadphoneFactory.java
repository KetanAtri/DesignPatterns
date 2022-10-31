package creationalDesignPatterns.factoryMethod.factories;

import creationalDesignPatterns.factoryMethod.products.Headphones;
import creationalDesignPatterns.factoryMethod.products.OverEarHeadphones;

public class OverEarHeadphoneFactory extends HeadphoneFactory
{
    @Override
    public Headphones createHeadphones()
    {
        OverEarHeadphones overEarHeadphones = new OverEarHeadphones();
        overEarHeadphones.setCushionType("Cushiony");
        return overEarHeadphones;
    }
}
