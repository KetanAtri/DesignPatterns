package creationalDesignPatterns.factoryMethod.factories;

import creationalDesignPatterns.factoryMethod.products.Headphones;

public abstract class HeadphoneFactory
{
    public abstract Headphones createHeadphones();
}
