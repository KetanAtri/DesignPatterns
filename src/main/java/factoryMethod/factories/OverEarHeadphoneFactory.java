package factoryMethod.factories;

import factoryMethod.products.Headphones;
import factoryMethod.products.OverEarHeadphones;

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
