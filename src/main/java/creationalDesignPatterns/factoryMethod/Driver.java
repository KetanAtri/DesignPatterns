package creationalDesignPatterns.factoryMethod;

import creationalDesignPatterns.factoryMethod.factories.HeadphoneFactory;
import creationalDesignPatterns.factoryMethod.factories.InEarHeadphoneFactory;
import creationalDesignPatterns.factoryMethod.factories.OverEarHeadphoneFactory;
import creationalDesignPatterns.factoryMethod.products.Headphones;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Driver
{
    private static Headphones createHeadphones(HeadphoneFactory headphoneFactory)
    {
        return headphoneFactory.createHeadphones();
    }
    public static void testFactories()
    {
        createHeadphones(new InEarHeadphoneFactory()).playAudio();
        createHeadphones(new OverEarHeadphoneFactory()).playMusic();
    }

    public static void main(String[] args)
    {
        testFactories();
    }
}
