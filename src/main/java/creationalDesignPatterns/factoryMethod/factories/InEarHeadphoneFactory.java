package creationalDesignPatterns.factoryMethod.factories;

import creationalDesignPatterns.factoryMethod.products.Headphones;
import creationalDesignPatterns.factoryMethod.products.InEarHeadphones;

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
