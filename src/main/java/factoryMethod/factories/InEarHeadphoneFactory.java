package factoryMethod.factories;

import factoryMethod.products.Headphones;
import factoryMethod.products.InEarHeadphones;

public class InEarHeadphoneFactory extends HeadphoneFactory
{
    @Override
    public Headphones createHeadphones()
    {
        InEarHeadphones inEarHeadphones = new InEarHeadphones();
        inEarHeadphones.setBudsType("default");
        return inEarHeadphones;
    }
}
